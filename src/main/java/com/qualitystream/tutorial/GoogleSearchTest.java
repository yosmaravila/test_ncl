package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest  {

	private WebDriver driver; 

	@Before
	public void setup() {


	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	}

	@Test
	public void testGooglePage() {

	WebElement searchbox = driver.findElement(By.name("q"));

	searchbox.clear();

	searchbox.sendKeys("lolo");

	searchbox.submit();

	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	assertEquals("lolo - Google Search", driver.getTitle());
	}


	@After
	public void tearDown() {
	driver.quit();
	}

	}
