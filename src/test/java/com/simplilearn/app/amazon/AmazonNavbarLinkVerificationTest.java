package com.simplilearn.app.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavbarLinkVerificationTest {

	public static void main(String[] args) {
		
		// step 1: create a source test url
		String siteURl = "https://www.amazon.in/";
		String driverPath = "drivers/chromedriver.exe";

		// step 2: set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step 3: create a web driver instance
		WebDriver driver = new ChromeDriver();

		// step 4: launch browser
		driver.get(siteURl);

		// find mobile link
		WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)"));
		mobileLink.click();
		
		String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println(" Test is passed !");
		} else {
			System.out.println(" Test is failed !");
		}
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);

		// step 6: close driver
		driver.close();
	}

}
