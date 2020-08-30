package com.qa.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.Utility.Browser_utility;
import com.qa.Utility.Test_Base;

public class Locate_Xpath extends Test_Base {

	public static void main(String[] args) throws Exception {
		Test_Base.setup_Url();
		JavascriptExecutor js = (JavascriptExecutor) Test_Base.driver;
		WebElement searchbox = driver
				.findElement(By.xpath("//input[@placeholder='City, Address, School, Agent, ZIP']"));
		Browser_utility.wait_for_Element(searchbox);
		searchbox.sendKeys("Sunnyvale");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement cityname = driver.findElement(By.xpath(
				"//div[contains(@class,'resultsView')]//div[1]//div[1]//div[2]"));
		// a[contains(@href,'/city/19457/CA/Sunnyvale') and @class='item-title
		// block'][@title='Sunnyvale']
		Browser_utility.wait_for_Element(cityname);
		// js.executeScript("arguments[0].click();", cityname);
		cityname.click();
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("//div[contains(@class,'textContent')]"));
		Browser_utility.wait_for_Element(city);
		String actual = city.getText();
		Assert.assertEquals(actual, "Sunnyvale");
		System.out.println(city.getText());
		Thread.sleep(2000);
		WebElement minm_price = driver.findElement(By.xpath("//span[contains(@class,'rangeItemContainer')][1]"));
		Browser_utility.wait_for_Element(minm_price);
		minm_price.click();
		Thread.sleep(1000);
		 WebElement price_800 =
		 driver.findElement(By.xpath("//*[@name='quickMinPrice']/option[26]"));
		 js.executeScript("arguments[0].click();", price_800);
		//js.executeScript("scroll(0, 10000)");
//		List<WebElement> optionList = driver.findElements(By.xpath("//*[@name='quickMinPrice']/option[1]"));
//		System.out.println(optionList.size());
//		js.executeScript("arguments[0].scrollIntoView(true)", optionList.get(7));
//		Select dropdown = new Select(minm_price);
//		dropdown.selectByIndex(25);
//		//price_800.click();

//		WebElement price = driver.findElement(By.xpath("//select[@name='quickMinPrice']/option[26]"));
//@href,'/CA/Sunnyvale/215-Red-Oak-Dr-94086/unit-B/home/105499358
//		//Browser_utility.wait_for_Element(price);
//		js.executeScript("arguments[0].click();", price);
//		//price.click();
		 
		 WebElement maxPrice=driver.findElement(By.xpath("//span[contains(text(),'No max')]"));
		 Browser_utility.wait_for_Element(maxPrice);
		 maxPrice.click();
		 WebElement price_950 = driver.findElement(By.xpath("//span[contains(text(),'$950k')]"));
		 js.executeScript("arguments[0].click();", price_950);
		Thread.sleep(3000);	
		WebElement house_found1 = driver.findElement(By.xpath("//span[contains(text(),'215 Red Oak Dr Unit B, SUNNYVALE, CA 94086')]"));
		Browser_utility.wait_for_Element(house_found1);		
		System.out.println(house_found1.isDisplayed());
		WebElement house_founs2 = driver.findElement(By.xpath("//span[contains(text(),'1271 Poplar Ave #404, SUNNYVALE, CA 94086')]"));
		Browser_utility.wait_for_Element(house_founs2);
		String actualHouse = house_founs2.getText();
		Assert.assertEquals(actualHouse, "1271 Poplar Ave #404, SUNNYVALE, CA 94086" );
		System.out.println(house_founs2.getText());
		Thread.sleep(2000);
		js.executeScript("scroll(0, 500)");
		WebElement house_3 = driver.findElement(By.xpath("//span[contains(text(),'1907 Magdalena Cir #42, SANTA CLARA, CA 95051')]"));
		Browser_utility.wait_for_Element(house_3);
		String house3 = house_3.getText();
		Assert.assertEquals(house3, "1907 Magdalena Cir #42, SANTA CLARA, CA 95051");
		System.out.println(house_3.isDisplayed());
		WebElement house_4 = driver.findElement(By.xpath("//span[contains(text(),'1269 Poplar Ave #309, Sunnyvale, CA 94086')]"));
		Browser_utility.wait_for_Element(house_4);
		String house4 = house_4.getText();
		Assert.assertEquals(house4, "1269 Poplar Ave #309, Sunnyvale, CA 94086");
		System.out.println(house_4.isDisplayed());
		Thread.sleep(3000);
		Test_Base.driver.quit();
	}
}
