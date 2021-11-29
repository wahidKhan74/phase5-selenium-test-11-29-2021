package com.simplilearn.app.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSourceURLTest {

	public static void main(String[] args) {
		
		// step 1: create a source test url
		String siteURl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver.exe";
		
		// step 2: set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step 3: create a web driver instance
		WebDriver driver = new ChromeDriver();
		
		// step 4: launch browser
		driver.get(siteURl);
		
		// step 5: perform / evaluate test
			
		if(siteURl.equals(driver.getCurrentUrl())) {
			System.out.println(" Test is passed !");
		} else {
			System.out.println(" Test is failed !");
		}
		System.out.println("Expected URL : "+siteURl);
		System.out.println("Actual URL : "+driver.getCurrentUrl());
		
		// step 6: close driver
		driver.close();
	}

}
