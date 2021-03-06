package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.enumer.qa.WaitStrategy;
import com.org.dinesh.driverfactory.ThreadLocalDriver;
import com.org.dinesh.driverfactory.WaitFactory;
import com.qa.reports.ExtentLogger;

public class BasePage {

	protected static void click(By by, WaitStrategy waitStrategy, String ElementName) {

		WebElement element = WaitFactory.explicitWait(by, waitStrategy);
		element.click();
		try {
			ExtentLogger.pass("Clicked on the " + ElementName + " Button",true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static void Sendkey(By by, String value, WaitStrategy waitStrategy, String ElementName) {

		WebElement element = WaitFactory.explicitWait(by, waitStrategy);
		element.sendKeys(value);
		try {
			ExtentLogger.pass("Entered the " + ElementName + " and the value is  " + value,true);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	protected String getText(By by, WaitStrategy waitStrategy, String ElementName) {
		WebElement element = WaitFactory.explicitWait(by, waitStrategy);	
		
		return element.getText();
	}

}
