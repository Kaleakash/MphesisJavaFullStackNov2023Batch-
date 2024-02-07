package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.input.model.DragData;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchInformationInGoogle {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");  // we are loading google page
		driver.manage().window().maximize();	// maximize that page 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement textareaRef = driver.findElement(By.name("q"));		// By.name("q"); q is name of the text field. 
		//textareaRef.sendKeys("Hello Google");		// textareaRef is refefence of goolge textarea and then we type Hello gooel 
		textareaRef.sendKeys("What is Angular Framework");
		WebElement buttonRef = driver.findElement(By.name("btnK"));
		buttonRef.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}

}
