package com.trip.base;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.flipkart.utilities.commonMethods;

public class base {
	
	public  static WebDriver driver;
	public static commonMethods common;
	public Properties prop;
	
	
	
	@Test
	public void openBrowser() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com");
		 common = new commonMethods();
		 prop= common.getProperty();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver1.get(prop.getProperty("url"));
		Thread.sleep(12000);
	
		System.out.println("waited for 10 seconds");
	}
	
	@Test
	public void go()
	{
		System.out.println("starting");
	}
	

}
