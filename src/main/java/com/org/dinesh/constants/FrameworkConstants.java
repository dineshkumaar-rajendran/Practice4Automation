package com.org.dinesh.constants;

import com.enumer.qa.ConfigProperties;
import com.org.dinesh.utility.configreader;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String PathToRes = "./src/test/resources/";
	private static final String ChromeDriverPath = PathToRes + "drivers/chromedriver.exe";
	private static final String ConfigurationFilePath = PathToRes + "configuration/config.properties";
	private static final int ExWaitTime = 20;
	private static final String ExtentReportPath = System.getProperty("user.dir") + "/extent-test-output/";
	public static String extentReportsFilePath = "";

	public static int getExwaittime() {
		return ExWaitTime;
	}

	public static String getChromepath() {
		return ChromeDriverPath;
	}

	public static String getConfigFilePath() {
		return ConfigurationFilePath;
	}

	public static String getExtentreportpath() throws Exception {
		if (extentReportsFilePath.isEmpty()) {
			extentReportsFilePath = createReportPath();
		}

		return extentReportsFilePath;
	}

	private static String createReportPath() throws Exception {
		if (configreader.get(ConfigProperties.OVERRIDE).equalsIgnoreCase("no")) {
			return ExtentReportPath + System.currentTimeMillis() + "/index.html";
		} else {
			return ExtentReportPath + "index.html";
		}
	}

}
