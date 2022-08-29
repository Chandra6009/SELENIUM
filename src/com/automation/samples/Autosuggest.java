package com.automation.samples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest
{

	static void arrowdown() throws AWTException
	{
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		
	}
	
	static void enter() throws AWTException
	{
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/?hl=en-US&authuser=1");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("cog");
	    
	    String search="nizant attrition";
		
	    List<WebElement> srch=driver.findElements(By.xpath("//ul[@role='listbox']//ul[@role='listbox']/li/descendant::b"));
	  
	    Autosuggest.arrowdown();
	    Thread.sleep(500);
	    Autosuggest.arrowdown();
	    
	    for(int i=0;i<=srch.size()-1;i++)
	    {
	    	srch=driver.findElements(By.xpath("//ul[@role='listbox']//ul[@role='listbox']/li/descendant::b"));
	    	System.out.println(srch.get(i).getText());
	    	if(search.equals(srch.get(i).getText()))
	    	{
	    		Autosuggest.enter();
	    		break;
	    	}
	    	else
	    	{
	    		Autosuggest.arrowdown();
	    		Thread.sleep(500);
	    	}
	    	
	    }
	   
	    
	    
	    
	    
	    

	}

}
