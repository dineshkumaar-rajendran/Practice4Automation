package com.qa.pages;

import org.openqa.selenium.By;

import com.org.dinesh.driverfactory.ThreadLocalDriver;

public class LoginPageOrange extends BasePage {

	private final By username_textbox = By.xpath("//input[@name='txtUsername' and @id='txtUsername']");
	private final By password_textbox = By.xpath("//input[@name='txtPassword' and @type='password']");
	private final By login_btn = By.xpath("//input[@id='btnLogin' and @type='submit']");

	public LoginPageOrange EnterUsername(String username) {
		Sendkey(username_textbox, username,"present");
		return new LoginPageOrange();
	}

	public LoginPageOrange EnterPassword(String password) {
		Sendkey(password_textbox, password,"present");
		return new LoginPageOrange();
	}

	public HomePage_Orange loginbtn() {
		click(login_btn,"present");
		return new HomePage_Orange();
	}

	public String getTitle() {
		return ThreadLocalDriver.getDriver().getTitle();
	}

}
