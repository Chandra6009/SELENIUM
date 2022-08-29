package com.automation.Synchroniztion;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implicit {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	   
		driver.manage().window().maximize();
	    driver.get("https://timesofindia.indiatimes.com/?from=mdr");
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	      	       .withTimeout(Duration.ofSeconds(30))
	               .pollingEvery(Duration.ofSeconds(2))
	               .withMessage("hi raining in bangalore")
	               .ignoring(NoSuchElementException.class);
	       		
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Maybe later1']")));	;	
	    driver.findElement(By.xpath("//button[normalize-space()='Maybe later1']")).click();
	   
	    
	    

	}

}
