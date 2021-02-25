package com.qa.pages;

import org.openqa.selenium.By;

import com.enumer.qa.WaitStrategy;
import com.org.dinesh.driverfactory.ThreadLocalDriver;

public class LoginPageOrange extends BasePage {

	private final By username_textbox = By.xpath("//input[@name='txtUsername' and @id='txtUsername']");
	private final By password_textbox = By.xpath("//input[@name='txtPassword' and @type='password']");
	private final By login_btn = By.xpath("//input[@id='btnLogin' and @type='submit']");

	public LoginPageOrange EnterUsername(String username) {
		Sendkey(username_textbox, username,WaitStrategy.Presence);
		return new LoginPageOrange();
	}

	public LoginPageOrange EnterPassword(String password) {
		Sendkey(password_textbox, password,WaitStrategy.Presence);
		return new LoginPageOrange();
	}

	public HomePage_Orange loginbtn() {
		click(login_btn,WaitStrategy.Presence);
		return new HomePage_Orange();
	}

	public String getTitle() {
		return ThreadLocalDriver.getDriver().getTitle();
	}

}
