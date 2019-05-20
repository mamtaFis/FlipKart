package com.trip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.trip.base.base;

public class IDEPage extends base{
	
	@FindBy(xpath="//a[contains(text(),'Docs')]")
	public WebElement docs;
	


	public void clickDocs()
	{
		docs.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("docs link has been clocked");
	}
	public IDEPage()
	{
		PageFactory.initElements(driver1, this);
	}
}
