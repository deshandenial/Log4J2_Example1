package com.qa.log4j.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.log4j.utils.ElementUtil;

import io.qameta.allure.Step;



public class UI_Page 
{
	private static Logger logger = LogManager.getLogger(UI_Page.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	private By practiceUI2 = By.xpath(".//*[@id='testing']"); 
	private By Login = By.xpath("//a[@class='button is-info']");
	private By username = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[text()='LOGIN']");
	private By practiceUI = By.xpath("//button[@routerlink='/test']");
	
	// **********************************INPUT WEBELEMENT UI LOCATORS *************************
		
		private By inputUI = By.xpath("//p[text()='Input']//following::button[1]");
		private By clearUI = By.xpath(".//*[@id='clearMe']");
		private By getTextUI = By.xpath(".//*[@id='getMe']");
	
	// **********************************BUTTON WEBELEMENT UI LOCATORS *************************
	
		private By buttonUI = By.xpath("//p[text()='Button']//following::button[1]");
		private By buttonClick = By.xpath(".//*[@id='home']");
		private By buttonDisableUI = By.xpath(".//*[@id='isDisabled']");
		
	// **********************************SELECT WEBELEMENT UI LOCATORS *************************
		
		private By selectUI = By.xpath("//p[text()='Select']//following::button[1]");
		private By selectAll = By.xpath(".//*[@id='superheros']");		
		private By selectValue = By.xpath(".//*[@id='country']");
		
	// **********************************ALERT WEBELEMENT UI LOCATORS *************************
		
		private By alertUI = By.xpath("//p[text()='Alert']//following::button[1]");
		private By simpleAlert = By.xpath(".//*[@id='accept']");	
		private By confirmationAlert = By.xpath(".//*[@id='confirm']");
		private By promptAlert = By.xpath(".//*[@id='prompt']");
		//private By validatePrompt = By.xpath(".//*[@id='myName']");
		private By modernAlert = By.xpath(".//*[@id='modern']");		
		private By gettextModernAlert = By.xpath(".//p[contains(text(),'Modern Alert - Some people address me as sweet alert as well ')]");
		private By closeModernAlert = By.xpath(".//*[@aria-label='close']");
	
	// **********************************FRAME WEBELEMENT UI LOCATORS *************************
		
		private By frameUI = By.xpath("//p[text()='Frame']//following::button[1]");
		private By firstFrame = By.xpath(".//*[@id='firstFr']");	
		private By firFrameName = By.xpath(".//*[@name='fname']");
		private By innerFrame = By.xpath(".//*[@src='innerFrame']");
		private By innFrameEmail = By.xpath(".//*[@name='email']");		
		private By firFrameLast = By.xpath(".//*[@name='lname']");
		private By getTextFrame = By.xpath(".//*[@class='title has-text-info']");
		
	
	
	public UI_Page(WebDriver driver) {
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}

	// **********************************COMMON UI OPERATIONS *************************
	/**
	 * @author DESHAN
	 * in below common method created for accessing all UI WebElements 
	 *  methodName is "commonPractice"
	 */
	
	
	
	
	
	// **********************************INPUT UI OPERATIONS *************************
	/**
	 * @author DESHAN
	 * in below method created for input UI WebElements 
	 *  methodName is "inputUI"
	 */
	
	public void inputUI()
	{
		elementUtil.doClick(practiceUI);
		logger.info("******successfully user click practice button*******");
		try
		{
		elementUtil.doClick(inputUI);
		logger.info("******successfully user Input Automation practice login button*******");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		elementUtil.doSendKeys1(clearUI, "My Name is Deshan Denial");
		logger.info("user successfully send a text into clear the text input field");
		elementUtil.doGetElementText(getTextUI);
		logger.info("*****get the text from this field What is inside the text box******");
		elementUtil.navigationBack();
	}
	
	// **********************************BUTTON UI OPERATIONS *************************
		/**
		 * @author DESHAN
		 * in below method created for button UI WebElements 
		 *  methodName is "buttonUI"
		 */
	public void buttonUI()
	{
		//elementUtil.doClick(practiceUI);
		elementUtil.doClick(buttonUI);
		logger.info("******successfully user Button Automation practice button*******");
		elementUtil.doClick1(buttonClick);
		logger.info("******successfully user GotoHome button*******");
		elementUtil.navigationBack();
		elementUtil.doClick1(buttonDisableUI);
		logger.info("******user try to click disable button*******");
		elementUtil.navigationBack();
		
	}
	
	// **********************************SELECT UI OPERATIONS *************************
		/**
		 * @author DESHAN
		 * in below method created for select UI WebElements 
		 *  methodName is "selectUI"
		 */
	public void selectUI()
	{
		//elementUtil.doClick(practiceUI);
		elementUtil.doClick(selectUI);
		logger.info("******successfully user click Select Automation*******");
		elementUtil.doSelectByVisibleText(selectAll, "Ant-Man");
		logger.info("user select the drop down value is Ant-Man");
		elementUtil.doSelectByVisibleText(selectAll, "Batman");
		logger.info("user select the drop down value is BatMan");
		elementUtil.doSelectByTextOption(selectValue, "India");
		logger.info("user select the drop down value is India");
		elementUtil.navigationBack();
	}
	
	// **********************************ALERT UI OPERATIONS *************************
			/**
			 * @author DESHAN
			 * in below method created for alert UI WebElements 
			 *  methodName is "alertUI"
			 */
	public void alertUI()
	{
		
		// simple alert
		elementUtil.doClick(alertUI);
		logger.info("******successfully user click Alert Automation*******");
		elementUtil.doClick(simpleAlert);
		logger.info("******successfully user click simpleAlert button*******");
		elementUtil.waitForAlertPresent(10000);
		elementUtil.getAlertText(1000);
		
		
		// confirmation alert
		
		elementUtil.doClick(confirmationAlert);
		logger.info("******successfully user click Confirmation button*******");
		elementUtil.waitForAlertPresent(1000);
		elementUtil.getAlertText(1000);
		//elementUtil.dismissAlert(1000);
				
		// prompt alert
		elementUtil.doClick(promptAlert);
		logger.info("******successfully user click promptAlert button*******");
		elementUtil.waitForAlertPresent(1000);
		elementUtil.getAlertText(1000);
		
			
		// modern alert
		elementUtil.doClick(modernAlert);
		logger.info("******successfully user click Modern Alert button*******");
		elementUtil.getText(gettextModernAlert);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementUtil.doClick(closeModernAlert);
		logger.info("******successfully user close Modern alert*******");
		elementUtil.navigationBack();
	}
	
	public void frameUI()
	{
		
		elementUtil.doClick(frameUI);
		logger.info("******successfully user click Frames Automation*******");
		elementUtil.waitForFrameToBeAvailable(firstFrame, 1000);
		elementUtil.doSendKeys(firFrameName, "Deshan");
		logger.info("******successfully user send a text in parent frame to firstName field*******");
		elementUtil.waitForFrameToBeAvailable(innerFrame, 1000);
		elementUtil.doSendKeys(innFrameEmail, "Deshan@gmail.com");
		logger.info("******successfully user send a text in child frame to emailName field*******");
		elementUtil.parentFrame();
		elementUtil.doSendKeys(firFrameLast, "Denial");
		logger.info("******successfully user send a text in parent frame to lastName field*******");
		elementUtil.getText(getTextFrame);
		
	}

	 @Step("login with username: {0} and password: {1}") 
	  public void doLogin(String un, String pwd) 
	  { 
		  
		  elementUtil.doClick1(Login);
		  
		  System.out.println("login with: " + un + " : " + pwd);
		  elementUtil.doMoveToElement(username);
		  elementUtil.doSendKeys1(username, un);
		  logger.info("******user successfully send username******");
		 elementUtil.doMoveToElement(password);
		 elementUtil.doSendKeys1(password, pwd);
		  logger.info("******user successfully send password******");
		  
		  elementUtil.doClick1(loginButton);
		  
	  }

			
	
}
