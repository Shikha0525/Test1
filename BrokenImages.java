package com.qait.automation_test;



import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImages {
	
	WebDriver driver;
	
	
	public BrokenImages(WebDriver driver) {
	
		this.driver=driver;
		
	}


	public void Test() {
		
		
		
		
		driver.get(" http://10.0.31.161:9292/");
		driver.findElement(By.linkText("Broken Images")).click();
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		
		
		//System.out.println("Total no. of images are " + imagesList.size());
		int result=0;
		for (WebElement imgElement : imagesList) {
			if (imgElement != null) {
				result=verifyimageActive(imgElement);
			}
		}
		if(imagesList.size()==result) {
			
			System.out.println("No Broken images");
			
		}
		
		
		
		
		
	}


	public int verifyimageActive(WebElement imgElement) {
		
		int invalidImageCount=0;
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			HttpResponse response = (HttpResponse) client.execute(request);
			
			if (response.getStatus().getCode() != 200)
				invalidImageCount++;
		    } catch (Exception e) {
			e.printStackTrace();
		}
		return invalidImageCount;
		
	}
	
	

	
	

}
