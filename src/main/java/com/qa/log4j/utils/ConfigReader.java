package com.qa.log4j.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigReader 
{
	private static Logger logger = LogManager.getLogger(ConfigReader.class);
private Properties prop;
	
	public Properties init_prop()
	{
		prop = new Properties();
		try 
		{
			logger.info("******browser read properties file******");
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
			
		} 
		
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		return prop;
	}


}
