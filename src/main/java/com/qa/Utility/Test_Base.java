package com.qa.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test_Base {

	public static WebDriver driver;
	static Common_utility cmn = new Common_utility();
	static Browser_utility brwsr = new Browser_utility();

	@BeforeSuite
	public static void setup_Url() throws Exception {
		//cmn.read_Property_File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.properties");
		brwsr.launchBrwsr();
		cmn.load_Log4j(System.getProperty("user.dir") + "\\src\\test\\resources\\log4j.properties");

	}

	@AfterSuite
	public static void tear_Down() {
		brwsr.Tear_Down();
	}

}
