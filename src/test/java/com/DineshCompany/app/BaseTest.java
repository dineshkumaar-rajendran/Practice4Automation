package com.DineshCompany.app;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.org.dinesh.driverfactory.driverFactory;

public class BaseTest {

	protected BaseTest() {
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	protected void setup_browser() throws Exception {
		driverFactory.init_driver();

	}

	@AfterMethod
	protected void TearDown() {
		driverFactory.QuitDriver();
	}

}
