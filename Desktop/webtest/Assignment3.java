package com.webtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		// create a webdriver session
		
		WebDriver driver= new ChromeDriver();
		
		// Assignment 3: WAS to automate naukri page, get total count of links
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com");
		
		// to get the total no of links
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links are: " +allLinks.size());
		
		// print href values
		
		String exp= "https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch";

		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			
			try {
			
			if(i.getAttribute("href").contains(exp)) {
				
				System.out.println("Pass,link found");
			}
			} catch(NullPointerException n) 
			{
				System.out.println("Object href is null!");
			}
		}
		
		
		
	}
	
	
	

}
