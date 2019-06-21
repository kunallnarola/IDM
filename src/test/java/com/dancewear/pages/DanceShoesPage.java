package com.dancewear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DanceShoesPage {
	
			
			WebDriver driver;
			@FindBy(xpath="(//span[text()='Dance Shoes'])[2]")
			WebElement button_danceshoesr;
			public DanceShoesPage(WebDriver driver)
			{
				
				this.driver = driver;
				
				PageFactory.initElements(driver, this);
				
			}
			
			public void clickOnDanceShoes()
			{ 
				
				
				 button_danceshoesr.click();
				System.out.println(driver.getTitle());
				
			}

}
