package com.dancewear.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.dancewear.pages.DanceShoesPage;
import com.dancewear.pages.CostumesPage;

public class DanceShoesTest extends BaseClass {
	
   DanceShoesPage danceshoespage;
	@Test(priority=2)
	public void verifyTitle() throws IOException 
	{ 
		danceshoespage = new DanceShoesPage(driver);
		danceshoespage.clickOnDanceShoes();
		System.out.println("Url of DanceShoes Page is :-" +driver.getCurrentUrl());	
		  // get the actual value of the title
	   String title=driver.getTitle();
	   System.out.println("DanceShoes Page Title :"+"    "+ title);
				
   
		}
	@Test(priority=3)
	   public void resizeScreenShot() throws IOException, InterruptedException
	   {
		System.out.println("Capturing Screen shot with Diffrent Window Diamension");
		resizeBrowserDanceShoesPage();
		 
		  
		
		 
		
	   
}

}
