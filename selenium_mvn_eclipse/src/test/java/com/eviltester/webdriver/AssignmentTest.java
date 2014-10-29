package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AssignmentTest {
	@Test
	public void startWebDriver(){
		WebDriver d = new InternetExplorerDriver();
		d.navigate().to("http://the-internet.herokuapp.com/");
		d.close();
	}

}
