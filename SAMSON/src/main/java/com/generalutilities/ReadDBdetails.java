package com.generalutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDBdetails {
	
	public static Properties readdbdetails() throws IOException
	{
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\get.properties");
		Properties data= new Properties();
		data.load(fis);
		
		return data;
	}
	

}
