package com.BaseTest.app;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.enumer.qa.ConfigProperties;
import com.org.dinesh.driverfactory.driverFactory;
import com.org.dinesh.utility.configreader;

public class BaseTest {

	protected BaseTest() {

	}

	@BeforeMethod
	protected void setup_browser() throws Exception {
		driverFactory.init_driver(configreader.get(ConfigProperties.BROWSER));

	}

	@AfterMethod
	protected void TearDown() {
		driverFactory.QuitDriver();
	}

}
