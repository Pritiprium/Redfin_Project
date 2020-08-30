package com.qa.Utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_utility  {
	Common_utility common = new Common_utility();
	
	public void launchBrwsr() {
		WebDriverManager.chromedriver().setup();
		Test_Base.driver = new ChromeDriver();
		Test_Base.driver.get("https://www.redfin.com/");
		Test_Base.driver.manage().window().maximize();
	}
	
	public static void wait_for_Element(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(Test_Base.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elem));		
	}
	public static void List_Element (List <WebElement> listelem) {
		WebDriverWait wait = new WebDriverWait(Test_Base.driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(listelem));
		
	}
	public void Tear_Down() {
		Test_Base.driver.quit();
	}

}
