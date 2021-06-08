package com.qa.log4j.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.log4j.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Story("US-101: design the all web element for practice")
@Epic("Epic-100: design ui feature")
public class UI_Page_Test extends BaseTest
{
	
	private static Logger logger = LogManager.getLogger(UI_Page_Test.class);
	
	@BeforeClass
	public void AccSetUp() 
	{
	logger.info("******before class triggered******");
	uiPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	logger.info("******user successfully read username and password******");
	logger.info("******before class ended*******");
	
	}
  
	@Description("Input Text Area Web Element Test!!!")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 1)
	public void inputTest() 
	{
		logger.info("*****inputTest is started******");
		
		uiPage.inputUI();
		logger.info("******inputTest is ended*******");
	}
	
	@Description("Button Web Element Test!!!")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void buttonTest() 
	{
		logger.info("*****buttonTest is started******");	
		uiPage.buttonUI();
		logger.info("******buttonTest is ended*******");
	}
	
	@Description("Select Web Element Test!!!")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3)
	public void selectTest() 
	{
		logger.info("*****selectTest is started******");
		uiPage.selectUI();
		logger.info("******selectTest is ended*******");
	}
	
	@Description("Alert Test!!!")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 4)
	public void alertTest() 
	{
		logger.info("*****alertTest is started******");
		uiPage.alertUI();
		logger.info("******alertTest is ended*******");
	}
	
	@Description("IFrames Test!!!")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 5)
	public void framesTest() 
	{
		logger.info("*****framesTest is started******");
		uiPage.frameUI();
		logger.info("******framesTest is ended*******");
	}
	
	
}
