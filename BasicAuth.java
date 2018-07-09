package com.qait.automation_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.security.UserAndPassword;

import junit.framework.Assert;

public class BasicAuth {

    WebDriver driver;
	public BasicAuth(WebDriver driver) {
		
		this.driver=driver;

	}
	
       public void Test() throws InterruptedException {
		
		driver.get(" http://10.0.31.161:9292/");
		WebElement BasicAuth=driver.findElement(By.linkText("Basic Auth"));
		BasicAuth.click();
		
		
		/*Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("admin" + Keys.TAB + "admin");
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
        
		//alert.accept();
		String message="Congratulations! You must have the proper credentials.\n";
		Assert.assertEquals(message, driver.getCurrentUrl());
		*/
    }

}
