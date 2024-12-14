package com.Adatin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.platform.launcher.Launcher;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.reusable.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/Adactin.feature"
,glue = "com.step_def.adactin")
public class Runner_classs extends Base_Class {
	
	public static WebDriver driver;
	@BeforeClass  // execute before all the methods will execute
	public static void browser() {
		launch();	
	}
	@AfterClass   // execute after when all the methods are executed
	public static void clos() {
		driver.close();
	}
	
	
	
	

}
