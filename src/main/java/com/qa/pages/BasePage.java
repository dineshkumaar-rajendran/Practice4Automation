package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.dinesh.constants.FrameworkConstants;
import com.org.dinesh.driverfactory.ThreadLocalDriver;

public class BasePage {

	protected static void click(By by, String WaitStrategy) {

		if (WaitStrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForelementToBeClickable(by);
		} else if (WaitStrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForelementToBePresent(by);
		}

		ThreadLocalDriver.getDriver().findElement(by).click();
	}

	protected static void Sendkey(By by, String value, String WaitStrategy) {

		if (WaitStrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForelementToBeClickable(by);
		} else if (WaitStrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForelementToBePresent(by);
		}
		ThreadLocalDriver.getDriver().findElement(by).sendKeys(value);
	}

	protected String getTitle() {
		return ThreadLocalDriver.getDriver().getTitle();
	}

	private static void explicitlyWaitForelementToBeClickable(By by) {
		new WebDriverWait(ThreadLocalDriver.getDriver(), FrameworkConstants.getExwaittime())
				.until(ExpectedConditions.elementToBeClickable(by));
	}

	private static void explicitlyWaitForelementToBePresent(By by) {
		new WebDriverWait(ThreadLocalDriver.getDriver(), FrameworkConstants.getExwaittime())
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
