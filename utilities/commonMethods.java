package com.flipkart.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.base;

public class commonMethods{
	

	public Properties getProperty() throws IOException
	{
		FileReader fr = new FileReader("C:\\eclipse-workspace\\roughPractice\\src\\com\\flipkart\\configFiles\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop;
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	public void typeElement(WebElement element, String data) {
		element.sendKeys(data);
	}

	
	
	
}
