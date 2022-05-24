package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.leanautomation.pages.BaseClass;
import com.leanautomation.pages.LoginPage;

public class LoginTestFB extends BaseClass{

	 
	@Test(priority = 1)
	public void loginApp() {
		 
		logger = report.createTest("Login to FACEBOOK");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		loginPage.loginToFB(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Login Successful");
		
		
	}
	
	@Test(priority = 2)
	public void loginApp1() {
		
		logger = report.createTest("Logout");
		
		logger.fail("Logout Failed");
		
		
	}
}