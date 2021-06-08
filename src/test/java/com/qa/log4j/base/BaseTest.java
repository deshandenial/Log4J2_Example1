package com.qa.log4j.base;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.qa.log4j.factory.DriverFactory;
import com.qa.log4j.pages.UI_Page;

import com.qa.log4j.utils.ConfigReader;


public class BaseTest 
{
	private static Logger logger = LogManager.getLogger(BaseTest.class);
	private WebDriver driver;
	public Properties prop;
	DriverFactory df;
	private ConfigReader configReader;
	public UI_Page uiPage;
	
	
	
	@BeforeTest
	public void setUp() 
	{
		logger.info("******before test annotation triggered******");
		configReader =new ConfigReader();
		prop = configReader.init_prop();
		String browser = prop.getProperty("browser");
		df = new DriverFactory();
		driver =df.init_driver(browser);
		logger.info("******successfully browser read properties files******");
		driver.get("https://letcode.in/");
		logger.info("******application url triggered******");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    uiPage = new UI_Page(driver);
	    logger.info("******application page triggered******");
	    logger.info("******before test annotation finished******");
	}
	
	@AfterTest
	public void tearDown() 
	{
	logger.info("******after test annotation triggered******");
	 driver.quit();	
	 logger.info("******after test annotation completed******");
	}
	
	

}
