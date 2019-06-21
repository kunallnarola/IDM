package com.dancewear.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.dancewear.utility.ReadCinfigFile;

public class BaseClass {
	ReadCinfigFile readconfig  = new ReadCinfigFile();
	public static WebDriver driver;
	public String baseURl =readconfig.getUrl();
	@Parameters("browser") 
	@BeforeClass
	public void setup(String browser)
	{
		
	if(browser.equalsIgnoreCase("chrome"))	
		
	{
		 // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver","/.Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	  // launch Chrome  and direct it to the Base URL
		driver.get(baseURl);
	}
		

   @AfterClass
	
	public void tearDown()
	{
		
		driver.close();
		
	}
	
	
	  public static void  takeScreenShot(String name ) throws IOException
	    {
	    	
	    	TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
	    	
	      File input= takeScreenShot.getScreenshotAs(OutputType.FILE);
	    	
	      File output = new File(System.getProperty("user.dir")+"/ScreenShots/"+name +".PNG");
	      
	      FileUtils.copyFile(input, output);
	    	
	    	
	    	
	    	
	    }
	  
	  public void resizeBrowserHomePage() throws IOException, InterruptedException {
		  
	        Dimension d = new Dimension(800,480);
	      //Resize current window to the set dimension
	        driver.manage().window().setSize(d);
	        takeScreenShot("HomePage Window Size-800 by 480");
	        Thread.sleep(1000);
	        Dimension d1 = new Dimension(1920,1080);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d1);
	        takeScreenShot(" HomePage Window Size-1920 by 1080");
	        Thread.sleep(1000);
	        Dimension d2 = new Dimension(1600,1200);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d2);
	        takeScreenShot("HomePage Window Size-1600 by 1200");
	        Thread.sleep(1000);
	        Dimension d3 = new Dimension(320,568);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d3);
	        takeScreenShot("HomePage Window Size-320 by 568");
	    }
	  
	  public void resizeBrowserDanceWearPage() throws IOException, InterruptedException {
		  
	        Dimension d = new Dimension(800,480);
	      //Resize current window to the set dimension
	        driver.manage().window().setSize(d);
	        takeScreenShot("costumesPage Window Size-800 by 480");
	        Thread.sleep(1000);
	        Dimension d1 = new Dimension(1920,1080);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d1);
	        takeScreenShot("costumesPage  Window Size-1920 by 1080");
	        Thread.sleep(1000);
	        Dimension d2 = new Dimension(1600,1200);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d2);
	        takeScreenShot("costumesPage  Window Size-1600 by 1200");
	        Thread.sleep(1000);
	        Dimension d3 = new Dimension(320,568);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d3);
	        takeScreenShot("costumesPage  Window Size-320 by 568");
	    }
	  
	  public void resizeBrowserDanceShoesPage() throws IOException, InterruptedException {
		  
	        Dimension d = new Dimension(800,480);
	      //Resize current window to the set dimension
	        driver.manage().window().setSize(d);
	        takeScreenShot("DanceShoesPage Window Size-800 by 480");
	        Thread.sleep(1000);
	        Dimension d1 = new Dimension(1920,1080);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d1);
	        takeScreenShot("DanceShoespage Window Size-1920 by 1080");
	        Thread.sleep(1000);
	        Dimension d2 = new Dimension(1600,1200);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d2);
	        takeScreenShot("DanceShoesPage Window Size-1600 by 1200");
	        Thread.sleep(1000);
	        Dimension d3 = new Dimension(320,568);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d3);
	        takeScreenShot("DanceShoesPage Window Size-320 by 568");
	    }
}
