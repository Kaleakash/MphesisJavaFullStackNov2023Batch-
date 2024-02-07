package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailId = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.id("b1"));
		WebElement resetButton = driver.findElement(By.id("b2"));
		
		
		
//		// without writing emailid 
		// submitButton.click();
//		Alert alert= driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
		
		
		// Emailid written but password write
//		emailId.sendKeys("raj@gmail.com");
//		submitButton.click();
//		Alert alert= driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
		
//		// wrong emailid and password 
//		emailId.sendKeys("raj@gmail.com");
//		password.sendKeys("123456");
//		submitButton.click();
//		Alert alert= driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
		
		// Correct emailid and password
				emailId.sendKeys("akash@gmail.com");
				password.sendKeys("123");
				submitButton.click();
				Alert alert= driver.switchTo().alert();
					System.out.println(alert.getText());
				alert.dismiss();
				driver.quit();
//		String beforeClickUrl = driver.getCurrentUrl();
//		System.out.println(beforeClickUrl);
//		//resetButton.click();
//		submitButton.click();
//		String afterClickUrl = driver.getCurrentUrl();
//		System.out.println(afterClickUrl);
	}

}
