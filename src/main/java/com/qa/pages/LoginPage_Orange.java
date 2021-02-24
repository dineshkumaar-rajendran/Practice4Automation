package com.qa.pages;

import org.openqa.selenium.By;

import com.org.dinesh.driverfactory.ThreadLocalDriver;

public class LoginPage_Orange {

	private final By username_textbox = By.xpath("//input[@name='txtUsername' and @id='txtUsername']");
	private final By password_textbox = By.xpath("//input[@name='txtPassword' and @type='password']");
	private final By login_btn = By.xpath("//input[@id='btnLogin' and @type='submit']");
	
	public void EnterUsername(String username) {
		ThreadLocalDriver.getDriver().findElement(username_textbox).sendKeys(username);
	}
	
	public void EnterPassword(String password) {
		ThreadLocalDriver.getDriver().findElement(username_textbox).sendKeys(password);
	}
	
	public void loginbtn() {
		ThreadLocalDriver.getDriver().findElement(login_btn).click();
	}


}
