package com.qait.tap.hristest.AutomationQAmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Bing1 {
WebDriver driver;
	
	
	public Bing1(WebDriver driver)
	{
	this.driver = driver;
	}

	public void inputSelection() throws InterruptedException
	{
		Select ivalue = new Select(driver.findElement(By.cssSelector("#t_sl")));
        Thread.sleep(3000);
		ivalue.selectByVisibleText("English");
		
	}
	public void outputSelection() throws InterruptedException

	{
		Select Ovalue = new Select(driver.findElement(By.cssSelector("#t_tl")));
        Thread.sleep(3000);
  
		Ovalue.selectByVisibleText("French");
	}

	public void inputText()
	{
		driver.findElement(By.cssSelector("#t_sv")).sendKeys("Hello Github");
	}
	
	
}
