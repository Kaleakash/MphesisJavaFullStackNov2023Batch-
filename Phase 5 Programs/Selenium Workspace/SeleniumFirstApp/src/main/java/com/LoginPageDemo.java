package com;

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
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("akash@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		WebElement submitButton = driver.findElement(By.id("b1"));
		WebElement resetButton = driver.findElement(By.id("b2"));
		String beforeClickUrl = driver.getCurrentUrl();
		System.out.println(beforeClickUrl);
		//resetButton.click();
		submitButton.click();
		String afterClickUrl = driver.getCurrentUrl();
		System.out.println(afterClickUrl);
	}

}
