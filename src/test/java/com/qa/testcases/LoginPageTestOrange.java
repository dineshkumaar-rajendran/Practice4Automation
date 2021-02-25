package com.qa.testcases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseTest.app.BaseTest;
import com.qa.pages.LoginPageOrange;

public final class LoginPageTestOrange extends BaseTest {

	private LoginPageTestOrange() {

	}

	@Test(dataProvider = "Multiple login" )
	public void loginandlogoutTest(String username , String password) throws InterruptedException {
		String title = new LoginPageOrange().EnterUsername(username).EnterPassword(password).loginbtn()
				.ClickWelcomebtn().logoutBtn().getTitle();
		Assertions.assertThat(title).isEqualTo("OrangeHRM");

	}
	
	
	@DataProvider(name="Multiple login",parallel = true)
	public Object[][] getData(){
		return new Object[][] {
			{"Admin","admin123"},
			{"Admin","admin123"},
			{"Admin","admin123"}
		};
	}
}
