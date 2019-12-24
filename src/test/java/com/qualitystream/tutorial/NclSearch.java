package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NclSearch {
	
	private WebDriver driver;
	
	By destinationlocator = By.xpath("//i[@class='e1_icon nis-marker']");
	By africacruiselocator = By.xpath("//label[@for='Africa Cruises']");
	By applylocator = By.xpath("(//li/a[@title='Apply'])[1]");
	By findacruiselocator = By.xpath("//div[@class='m12_cta']");
	By egitimagenlocator = By.id("teaLeaf-overlay800");
	
	
	
	

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ncl.com/");			
		
			
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(destinationlocator).click();
		Thread.sleep(2000);		
		driver.findElement(africacruiselocator).click();
		driver.findElement(applylocator).click();
		driver.findElement(findacruiselocator).click();
		if (driver.findElement(egitimagenlocator).isDisplayed()){
		System.out.print("Africa crusie search was successfully");	
				
		}
		
		else {
			System.out.print("Search was incomplited");
			
			
			
		}
		
		
				
		
				
		
	}

}
