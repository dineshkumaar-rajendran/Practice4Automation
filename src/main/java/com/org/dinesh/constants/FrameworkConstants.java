package com.org.dinesh.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String PathToRes = ".src\\test\\resources\\";
	private static final String ChromeDriverPath = PathToRes + "drivers\\chromedriver.exe";
	private static final String ConfigurationFilePath = PathToRes + "configuration\\config.properties";

	public static String getChromepath() {
		return ChromeDriverPath;
	}

	public static String getConfigFilePath() {
		return ConfigurationFilePath;
	}

}
