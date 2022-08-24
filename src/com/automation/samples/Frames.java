package com.automation.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    WebElement f1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	    WebElement f2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
	    driver.switchTo().frame(f1);
	    driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("dejavo");
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(f2);
	    WebElement animals=driver.findElement(By.id("animals"));
	    Select sel=new Select(animals);
	    sel.selectByIndex(3);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(f1);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame3']")));
	    driver.findElement(By.xpath("//input[@id='a']")).click();
	    

	}

}
