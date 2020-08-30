package com.qa.runner;

import java.io.File;

import org.junit.runner.RunWith;

import org.junit.AfterClass;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature/redFin.feature" }, glue = { "com.qa.steps" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json",
		"junit:target/cucumber-results.xml" }, monochrome = true)
public class Runner {
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
//	}

}
