package com.login;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSpringMVCTesting {
	WebDriver driver;
	WebElement emailId,password,submitButton,resetButton;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	driver = new EdgeDriver();
	driver.get("http://localhost:8080/SpringMVCLoginAppUsingJdbcTemplate/");
	driver.manage().window().maximize();
	emailId = driver.findElement(By.name("emailid"));
	password = driver.findElement(By.name("password"));
	List<WebElement> listOfTag = driver.findElements(By.tagName("input"));
	submitButton = listOfTag.get(0);		// first input submit button 
	}
	
 

  @Test(priority = 3)
  public void InValidEmailIdAndPasswordTest() {
		emailId.sendKeys("raj@gmail.com");
		password.sendKeys("123");
		submitButton.click();
		driver.get("http://localhost:8080/SpringMVCLoginAppUsingJdbcTemplate/failure.jsp");
	     //String url = driver.getCurrentUrl();
	     //System.out.println(url);
		List<WebElement> listOfTag = driver.findElements(By.tagName("h2"));
		WebElement web = listOfTag.get(0);
		//System.out.println(web.getText());
		assertEquals("Failure try once again", web.getText());
//		Iterator<WebElement> li = listOfTag.iterator();
//		while(li.hasNext()) {
//			WebElement we = li.next();
//			System.out.println(we.getTagName()+" "+we.getText());
//		}
  }

  @Test(priority = 4)
  public void ValidEmailIdAndPasswordTest() {
		emailId.sendKeys("akash@gmail.com");
		password.sendKeys("akash@123");
		submitButton.click();
		driver.get("http://localhost:8080/SpringMVCLoginAppUsingJdbcTemplate/Home.jsp");
		List<WebElement> listOfTag = driver.findElements(By.tagName("h2"));
		WebElement web = listOfTag.get(0);
		//System.out.println(web.getText());
		assertEquals("Welcome to Home Page", web.getText());
  }
  
  @AfterMethod
  public void afterClass() {
	  driver.quit();
  }
}
