package com.trip.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.trip.base.base;
import com.trip.pages.IDEPage;
import com.trip.pages.homePage;

public class doc_test {
	
	@Test
	public void doctest() throws InterruptedException
	{
	homePage home = new homePage();
	home.clickClose();
	home.search();
	
	}

}
