package com.org.dinesh.driverfactory;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.org.dinesh.utility.configreader;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class driverFactory {
	
	private driverFactory() {
		
	}

		

	public static void init_driver() throws Exception {
		if (Objects.isNull(ThreadLocalDriver.getDriver())) {
			//System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromepath());
			WebDriverManager.chromedriver().setup();
			ThreadLocalDriver.setDriver(new ChromeDriver());
			ThreadLocalDriver.getDriver().manage().window().maximize();
			ThreadLocalDriver.getDriver().get(configreader.getValue("url"));
		}
	}

	public static void QuitDriver() {
		if (Objects.nonNull(ThreadLocalDriver.getDriver())) {
			ThreadLocalDriver.getDriver().quit();
			ThreadLocalDriver.unload();
		}
	}

}
