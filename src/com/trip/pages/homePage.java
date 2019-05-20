package com.trip.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.utilities.commonMethods;
import com.trip.base.base;

public class homePage extends base{
	//public commonMethods methods;
	
	
	@FindBy(xpath="//iframe[contains(@name,'notification-frame')]")
	public WebElement closeBtnOnPopUp;
	
	@FindBy(xpath="//*[@id='fromCity' and @type='text']")
	public WebElement searchFrom;
	
	@FindBy(xpath="//*[@id='toCity' and @type='text']")
	public WebElement searchTo;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div[1]/ul/li[2]/span")
	public WebElement roundTrip;
	
	@FindBy(xpath="//*[@class='DayPicker-Day DayPicker-Day--today']")
	public WebElement currentDate;
	
	
	public void clickClose() throws InterruptedException
	{
	
		Thread.sleep(9000);
		closeBtnOnPopUp.click();
	}

	
	public void search() throws InterruptedException
	{
		
		roundTrip.click();
		searchFrom.sendKeys("delhi");
		searchTo.sendKeys("banglore");
		currentDate.click();
	}
	public homePage()
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
}
