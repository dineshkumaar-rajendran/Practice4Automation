package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.enumer.qa.WaitStrategy;
import com.org.dinesh.driverfactory.ThreadLocalDriver;
import com.org.dinesh.driverfactory.WaitFactory;

public class BasePage {

	protected static void click(By by, WaitStrategy waitStrategy) {

		WebElement element = WaitFactory.explicitWait(by, waitStrategy);
		element.click();
	}

	protected static void Sendkey(By by, String value, WaitStrategy waitStrategy) {

		WebElement element = WaitFactory.explicitWait(by, waitStrategy);
		element.sendKeys(value);
	}

	protected String getTitle() {
		return ThreadLocalDriver.getDriver().getTitle();
	}

}
