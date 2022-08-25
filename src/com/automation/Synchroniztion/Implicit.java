package com.automation.Synchroniztion;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implicit {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    WebDriverWait   wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.manage().window().maximize();
	    driver.get("https://timesofindia.indiatimes.com/?from=mdr");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Maybe later']")));
	    driver.findElement(By.xpath("//button[normalize-space()='Maybe later']")).click();
	   
	    
	    

	}

}
