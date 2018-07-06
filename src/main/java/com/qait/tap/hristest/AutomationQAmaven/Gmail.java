package com.qait.tap.hristest.AutomationQAmaven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
WebDriver driver;
WebElement Mails;
public WebElement getUsername()
{
	return this.driver.findElement(By.id("identifierId"));
}
 public WebElement getPassword()
 {
	return this.driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
 }
 
 public void Compose() throws InterruptedException
 {
	 driver.findElement(By.cssSelector("#\\3a 46 > div > div")).click();
	 
	//Thread.sleep(1000);

	 driver.findElement(By.cssSelector("textarea[name='to']")).sendKeys("surajgupta@qainfotech.com");
	 
	 driver.findElement(By.cssSelector("#\\3a 8q")).sendKeys("to verify the testautomation");
	 driver.findElement(By.xpath("//*[@id=\":9v\"]")).sendKeys("please verify that code is working or not");
	 driver.findElement(By.cssSelector("#\\3a 8g")).click();

	 
 }
 
 public void DeleteMail()
 {
	 driver.findElement(By.cssSelector("#\\3a 8h > div > div.aio.UKr6le > span > a")).click();
	 driver.findElement(By.cssSelector("#\\3a a9")).click();
	 driver.findElement(By.cssSelector("#\\3a 5 > div.G-atb.D.E.aCh > div.iH.bzn > div > div:nth-child(2) > div.T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.W6eDmd > div > div")).click();
 }
 
 public void List_Table(int x, int y)
 {
	 List<WebElement> list = driver.findElements(By.cssSelector("#\\3a 39"));
int index=0;
	 Iterator<WebElement> itr = list.iterator();
	 while(itr.hasNext()) {
				 WebElement element = itr.next();
				 if(index>=x||index<=y) {
					 System.out.println(element.getText());		 
				 }

		   

	    	 }
 }
 
 
 
 
 

public void Gmail_Login(String Username, String Password)
{
getUsername().clear();
getUsername().sendKeys(Username);
//driver.findElement(By.className("RveJvd snByac")).click();
driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

getPassword().sendKeys(Password);
//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(driver, 5);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordNext"))));
driver.findElement(By.id("passwordNext")).click();

}

	public Gmail(WebDriver driver)
	{
		this.driver= driver;
	}
		
}
