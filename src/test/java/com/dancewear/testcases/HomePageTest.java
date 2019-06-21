package com.dancewear.testcases;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.dancewear.pages.CostumesPage;

public class HomePageTest extends BaseClass{
    CostumesPage homepage;
  
	@Test(priority=1)
	public void verifyUrl() throws IOException 
	{ 
		  // get the actual Current Url
		  System.out.println("Url of Home Page is :-" +driver.getCurrentUrl());	
		  // get the actual value of the title
	      String title=driver.getTitle();
	      System.out.println("Home Page Title :"+"    "+ title);
		  System.out.println("Url of Home Page is :-" +driver.getCurrentUrl());		
   
		}
	@Test(priority=2)
	   public void resizeScreenShot() throws IOException, InterruptedException
	   {
		System.out.println("Capturing Screen shot with Diffrent Window Diamension");
		resizeBrowserHomePage();
		 
		  
		
		 
		
	   }
}
