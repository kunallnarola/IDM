package com.dancewear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostumesPage {
	WebDriver driver;
	@FindBy(xpath="(//span[text()='Costumes'])[3]")
	WebElement button_costumes;
	public CostumesPage(WebDriver driver)
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnCostumes()
	{ 
		
		
		button_costumes.click();
		System.out.println(driver.getTitle());
		
	}
}


