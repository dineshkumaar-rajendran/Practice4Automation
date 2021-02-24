package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.dinesh.driverfactory.ThreadLocalDriver;

public final class HomePage_Orange extends BasePage {

	private final By welcomeButton = By.id("welcome");
	private final By logoutBtn = By.xpath("//a[text()='Logout']");

	public HomePage_Orange ClickWelcomebtn() {
		click(welcomeButton,"present");
		return new HomePage_Orange();
	}

	public LoginPageOrange logoutBtn() {
		
		click(logoutBtn,"clickable");
		return new LoginPageOrange();
	}

	

}
