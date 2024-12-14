package com.fb.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Pom_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner_1 {
	
		
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys("qwerty");
		
		Pom_Class d = new Pom_Class(driver);
		WebElement name = d.getUser();
		name.sendKeys("qwert");
		
	}
	
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	


