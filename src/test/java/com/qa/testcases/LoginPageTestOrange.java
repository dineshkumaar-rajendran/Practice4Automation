package com.qa.testcases;

import org.testng.annotations.Test;

import com.BaseTest.app.*;
import com.qa.pages.LoginPage_Orange;

public final class LoginPage_Test_Orange extends BaseTest {

	private LoginPage_Test_Orange() {
		
	}
	
	@Test
	public void loginandlogoutTest() {
		LoginPage_Orange loginpage = new LoginPage_Orange();
		loginpage.EnterUsername("Admin");
		loginpage.EnterPassword("admin123");
		loginpage.loginbtn();
	}
	
}
