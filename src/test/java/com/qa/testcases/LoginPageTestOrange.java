package com.qa.testcases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.BaseTest.app.BaseTest;
import com.qa.pages.LoginPageOrange;

public final class LoginPageTestOrange extends BaseTest {

	private LoginPageTestOrange() {

	}

	@Test
	public void loginandlogoutTest() throws InterruptedException {
		String title = new LoginPageOrange().EnterUsername("Admin").EnterPassword("admin123").loginbtn()
				.ClickWelcomebtn().logoutBtn().getTitle();
		Assertions.assertThat(title).isEqualTo("OrangeHRM");

	}

}
