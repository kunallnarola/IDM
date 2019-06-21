package com.dancewear.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadCinfigFile {
	File file ; 
	FileInputStream fis;
	Properties pro;
	
	
	public ReadCinfigFile() 
	{
		
	try {
		file = new File("./Configuration/config.properties");
		fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
		
		
	}
	
	
	public String getUrl()
	{
		String url = pro.getProperty("baseUrl");
		
		return url;
	
	}
	
	


}
