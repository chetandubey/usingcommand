package com.qait.tap.hristest.AutomationQAmaven;


import com.qait.tap.hristest.AutomationQAmaven.Hris;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.*;



public class NewhrisTest {

	WebDriver driver;
	Hris Hobj;

	
@Test(priority=2)
  public void HrisLoginTest() {
	Hobj.HrisLogin("chetandubey","Cheta@321#");
		Assert.assertTrue(Hobj.GetUrl()
			.contains("timesheet"));
		
  }
	
	@Test(priority=1)
	 public void attempt_Login_With_Incorrect_Password_Should_Render_Error_Message(){

	Assert.assertTrue(Hobj.Login_with_Incorrect_Crediantials("INVALID_USERN", "INVALUD_PASSWEOR").contains("Invalid Login"));
	
	}
	@Test(priority=1)
	public void attempt_login_with_blank_password()
	{
		Hobj.HrisLogin("chetandubey", "");
        
		Assert.assertTrue(Hobj.isPasswordEntryAnnotated());	
		
	}
	
	
	
	
  @BeforeClass
  public void LaunchBrowser() {
	  
		System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");

	  driver = new ChromeDriver();
	  driver.get("https://hris.qainfotech.com");
	  driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li.pausePlayer.active > a > i")).click();
	  
	  driver.manage().window().maximize();
	  Hobj = new Hris(driver);
  }

  @AfterClass
  public void CloseBrowser() throws InterruptedException {
      Thread.sleep(10000);
	  driver.quit();  }

}
