package com.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class LoginTesting {
  
	WebDriver driver;
	WebElement emailId,password,submitButton,resetButton;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	driver = new EdgeDriver();
	driver.get("http://127.0.0.1:5500/index.html");
	driver.manage().window().maximize();
	emailId = driver.findElement(By.id("email"));
	password = driver.findElement(By.id("password"));
	submitButton = driver.findElement(By.id("b1"));
	resetButton = driver.findElement(By.id("b2"));
	}
	
  @Test(priority = 1)
  public void emailIdRequiredTest() {
		submitButton.click();
		Alert alert= driver.switchTo().alert();
		String result = alert.getText();
		assertEquals("Emailid is required", result);
		alert.dismiss();
  }
  
  @Test(priority = 2)
  public void passwordRequiredTest() {
		emailId.sendKeys("raj@gmail.com");
		submitButton.click();
		Alert alert= driver.switchTo().alert();
		String result = alert.getText();
		assertEquals("Password is required", result);
		alert.dismiss();
  }

  @Test(priority = 3)
  public void InValidEmailIdAndPasswordTest() {
		emailId.sendKeys("raj@gmail.com");
		password.sendKeys("123");
		submitButton.click();
		Alert alert= driver.switchTo().alert();
		String result = alert.getText();
		assertEquals("failure try once again", result);
		alert.dismiss();
  }

  @Test(priority = 4)
  public void IValidEmailIdAndPasswordTest() {
		emailId.sendKeys("akash@gmail.com");
		password.sendKeys("123");
		submitButton.click();
		Alert alert= driver.switchTo().alert();
		String result = alert.getText();
		assertEquals("Successfully login", result);
		alert.dismiss();
  }
  
  @AfterMethod
  public void afterClass() {
	  driver.quit();
  }

}
