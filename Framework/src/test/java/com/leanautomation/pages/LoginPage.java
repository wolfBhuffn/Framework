package com.leanautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	//this is new commit by wolf
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(name = "email")
	WebElement uname; 
	@FindBy(name = "pass")
	WebElement pass;
	@FindBy(name = "login")
	WebElement loginButton;

	public void loginToFB(String usernameApplication, String passAppplication) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passAppplication);
		loginButton.click();

	}

}
