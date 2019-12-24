package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver; 
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src=\"/images/masts/mast_register.gif\"]");	
    By usernamelocato = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
	By registerBtnLocator = By.name("register");
	By userhomelocator = By.name("userName");
	By passwordhomelocastor = By.name("password");
	By singinhomelocator = By.name("login");
	By loginconfirmationpage = By.xpath("//img[@src='/images/masts/mast_signon.gif']");
	
	
	
	
		
	
	   
	@Before
	public void setUp() throws Exception {
		
			
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");	
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		
		
	}
		

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(usernamelocato).sendKeys("qualityadmin");
			driver.findElement(passwordLocator).sendKeys("lolo");
			driver.findElement(confirmPasswordLocator).sendKeys("lolo");
			driver.findElement(registerBtnLocator).click();
			
			
		}
		else {
		System.out.print("Register page was not found");
			
		}
		
		List<WebElement> fonts = driver.findElements(By.tagName("font"));
		
		assertEquals("Note: Your user name is qualityadmin.",fonts.get(5).getText());
			
	}
@Test
public void login() throws InterruptedException {
	
	driver.findElement(userhomelocator).sendKeys("qualityadmin");
	driver.findElement(passwordhomelocastor).sendKeys("lolo");
	driver.findElement(singinhomelocator).click();
	Thread.sleep(2000);
	assertTrue(driver.findElement(loginconfirmationpage).isDisplayed());
	//{
	//else 
		//System.out.printIn("Pagina de registro incorrecta");

	
	}

}	
	
	

