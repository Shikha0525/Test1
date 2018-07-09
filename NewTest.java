package com.qait.automation_test;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.AfterTest;

public class NewTest {
  
	WebDriver driver;
	BasicAuth basic;
	BrokenImages Broken_Image;
	Exit_intent exit_intent;
	
	public NewTest() {
		
		String exepath = "/home/qainfotech/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver",exepath);
		driver = new ChromeDriver();
		basic=new BasicAuth(driver);
	}
	
	
	
	@Test
	public void Test01BasicAuth() throws InterruptedException {
		
		basic.Test();
		
    }
	
	@Test
	public void Test02BrokenImages() {
		
		Broken_Image=new BrokenImages(driver);
		Broken_Image.Test();
	}
	
	@Test
	public void Test03exit_intent() {
	
		exit_intent=new Exit_intent(driver);
		exit_intent.Test();
	
	}
	
	
	
	
}
