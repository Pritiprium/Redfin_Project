package com.qa.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Browser_utility;
import com.qa.Utility.Test_Base;

public class Home_Page extends Test_Base {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor js = (JavascriptExecutor) Test_Base.driver;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='City, Address, School, Agent, ZIP']")
	WebElement searchBox;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'resultsView')]//div[1]//div[1]//div[2]")
	WebElement cityName;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'textContent')]")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'rangeItemContainer')][1]")
	WebElement min_Price;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'$800k')]")
	WebElement price_800;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'No max')]")
	WebElement maxPrice;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'$950k')]")
	WebElement Price_950;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'215 Red Oak Dr Unit B, SUNNYVALE, CA 94086')]")
	WebElement House1;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'1271 Poplar Ave #404, SUNNYVALE, CA 94086')]")
	WebElement House_2;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'1907 Magdalena Cir #42, SANTA CLARA, CA 95051')]")
	WebElement House_3;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'1269 Poplar Ave #309, Sunnyvale, CA 94086')]")
	WebElement House_4;

	public void search_Box(String cityname) throws Exception {
		Browser_utility.wait_for_Element(searchBox);
		searchBox.sendKeys(cityname);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void Select_city_Name() {
		Browser_utility.wait_for_Element(cityName);
		cityName.click();
	}

	public void verify_City() throws Exception {
		Browser_utility.wait_for_Element(City);
		String actual = City.getText();
		// Assert.assertEquals(actual, "Sunnyvale");
		System.out.println(actual);
		System.out.println(City.isDisplayed());
		Thread.sleep(2000);
	}

	public void click_on_minium_Price_button() {
		Browser_utility.wait_for_Element(min_Price);
		min_Price.click();
	}

	public void select_minium_price() {
		Browser_utility.wait_for_Element(price_800);
		price_800.click();
	}

	public void click_maximum_Price_button() {
		Browser_utility.wait_for_Element(maxPrice);
		maxPrice.click();
	}

	public void select_maximum_Price() throws Exception {
		Browser_utility.wait_for_Element(Price_950);
		Price_950.click();
		Thread.sleep(2000);
	}

	public void House_one() {
		Browser_utility.wait_for_Element(House1);
		String actualHouse = House1.getText();
		Assert.assertNotNull(actualHouse);
		System.out.println(actualHouse);
		System.out.println(House1.isDisplayed());

	}
//	public void house_Two() {
//		Browser_utility.wait_for_Element(House_2);
//		String Actul_H_Two = House_2.getText();
//		Assert.assertEquals(Actul_H_Two, "1271 Poplar Ave #404, SUNNYVALE, CA 94086");
//		System.out.println(House_2.getText());
//		
//	}
//	public void house_Three() {
//		Browser_utility.wait_for_Element(House_3);
//		String Actul_H_Two = House_3.getText();
//		Assert.assertEquals(Actul_H_Two, "1907 Magdalena Cir #42, SANTA CLARA, CA 95051");
//		System.out.println(House_3.getText());
//		
//	}
//	public void house_Four() {
//		Browser_utility.wait_for_Element(House_4);
//		String Actul_H_Two = House_2.getText();
//		Assert.assertEquals(Actul_H_Two, "1269 Poplar Ave #309, Sunnyvale, CA 94086");
//		System.out.println(House_2.getText());
//		
//	}
}
