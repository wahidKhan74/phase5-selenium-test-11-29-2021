
package com.simplilearn.app.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest2 {

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

		// search test evaluation
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium webdriver documentation");
		searchBox.submit();
		
		// step 5: evaluate test
		String expectedTitle = "selenium webdriver documentation - Google Search";
		String actualTitle = driver.getTitle();
		

		if(actualTitle.equals(expectedTitle)) {
			System.out.println(" Test is passed !");
		} else {
			System.out.println(" Test is failed !");
		}
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		// step 6: close driver
		driver.close();
	}

}
