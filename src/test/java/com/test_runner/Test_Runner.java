package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_file", glue = "com.stepdefinition",
                             monochrome = true, dryRun = false, strict = true,
                             plugin = {"html:Report", "json:Report/cucumber.json", "pretty",}) //"com.cucumber.listener.ExtendCucumberFormatter:Report/Adactin.html"})


public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {

		driver = Base_Class.getBrowser("chrome");
	
	}
	
	@AfterClass
	public static void browserClose() {

		Base_Class.close();
	}
	}
