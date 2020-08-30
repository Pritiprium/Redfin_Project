package com.qa.steps;

import org.apache.log4j.Logger;

import com.qa.PageObject.Home_Page;
import com.qa.Utility.Test_Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Steps {

	Logger log = Logger.getLogger(getClass().getSimpleName());

	@Given("^Launched the browser and enter Url$")
	public void launched_the_browser_and_enter_Url() throws Throwable {
		Test_Base.setup_Url();
		log.info("Redfin.com Launched");
	}

	@When("^User send \"([^\"]*)\" in Search Box and Enter$")
	public void user_send_in_Search_Box_and_Enter(String cityname) throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.search_Box(cityname);
		log.info("city name searched-->" + cityname.toString());
	}

	@Then("^Pop-up Displays and User select Sunnyvale CA,USA$")
	public void pop_up_Displays_and_User_select_Sunnyvale_CA_USA() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.Select_city_Name();
		log.info("Selected City Name--> ");
	}

	@Then("^User verify the serchbox$")
	public void user_verify_the_serchbox() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.verify_City();
	}

	@Then("^User Select the minium price button$")
	public void user_Select_the_minium_price_button() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.click_on_minium_Price_button();
	}

	@Then("^User Slect  min_price$")
	public void user_Slect_min_price() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.select_minium_price();

	}

	@Then("^User select Maximum price button$")
	public void user_select_Maximum_price_button() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.click_maximum_Price_button();

	}

	@Then("^User Select max_price$")
	public void user_Select_max_price() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.click_maximum_Price_button();
	}

	@Then("^User verify the house is displayed in the range$")
	public void user_verify_the_house_is_displayed_in_the_range() throws Throwable {
		Home_Page page_OB = new Home_Page(Test_Base.driver);
		page_OB.House_one();

	}

	@Then("^User Quit the Browser$")
	public void user_Quit_the_Browser() throws Throwable {
		Test_Base.tear_Down();
	}
}
