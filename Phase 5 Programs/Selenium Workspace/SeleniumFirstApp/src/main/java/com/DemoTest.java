package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\chrome-win64\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		//System.out.println("Driver loaded successfully");
		//WebDriver driver = new ChromeDriver();	// created the reference of drive 
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");  // we are loading google page 
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String data = driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		System.out.println(data);
		//driver.close();
	}

}
