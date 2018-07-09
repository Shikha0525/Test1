package com.qait.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exit_intent {

	WebDriver driver;
	public Exit_intent(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void Test() {
		
		driver.get(" http://10.0.31.161:9292/");
		WebElement BrokenImage=driver.findElement(By.linkText("Exit Intent"));
		BrokenImage.click();
		
		

		
	}

	

}
