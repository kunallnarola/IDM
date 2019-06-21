package com.dancewear.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.dancewear.pages.CostumesPage;

public class CostumesPageTest extends BaseClass {
	CostumesPage costumespage;
	@Test(priority=5)
	public void captureTitle() throws IOException 
	{ 
		costumespage = new CostumesPage(driver);
		costumespage.clickOnCostumes();
		System.out.println("Url of Costumes Page is :-" +driver.getCurrentUrl());	
		 // get the actual Current Url
	     String title=driver.getTitle();
	     System.out.println("Costumes page Title :"+"    "+ title);
			
   
		}
	@Test(priority=6)
	   public void resizeScreenShot() throws IOException, InterruptedException
	   {
		System.out.println("Capturing Screen shot with Diffrent Window Diamension");
		resizeBrowserDanceWearPage();
		 
		  
		
		 
		
	   
}

}
