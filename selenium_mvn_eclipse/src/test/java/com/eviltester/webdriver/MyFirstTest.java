package com.eviltester.webdriver;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	@Test
	public void startWebDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumsimplified.com");
		Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Selenium Simplified"));
		driver.close();
		System.out.print("Changed");
		System.out.println("This Changed should be visible");
		
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
