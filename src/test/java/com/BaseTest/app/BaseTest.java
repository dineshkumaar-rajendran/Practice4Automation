package com.BaseTest.app;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.org.dinesh.driverfactory.driverFactory;

public class BaseTest {

	protected BaseTest() {

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
