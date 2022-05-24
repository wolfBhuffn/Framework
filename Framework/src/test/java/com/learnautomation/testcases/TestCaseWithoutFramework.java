package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("Selenium_50");
		driver.findElement(By.name("pass")).sendKeys("Abcd@123456");

		driver.findElement(By.xpath("//button[@name='login']")).click();

		driver.quit();

	}

}
