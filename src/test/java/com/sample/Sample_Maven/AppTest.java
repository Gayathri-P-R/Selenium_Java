package com.sample.Sample_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class AppTest
{
	
public static WebDriver driver;
public static WebDriver driver_Configuration(String type )
{
	if(type.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty(type));
	driver= new ChromeDriver();
	
	}
	else if (type.equalsIgnoreCase("Firefox")) 
	{
		System.setProperty("webdriver.gecko.driver","value");
		driver= new FirefoxDriver();	
	}
	driver.manage().window().maximize();
	return driver;
}
//public static 
}