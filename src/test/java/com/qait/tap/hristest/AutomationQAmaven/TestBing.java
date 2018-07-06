package com.qait.tap.hristest.AutomationQAmaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestBing {
	WebDriver driver;
	Bing1 BingObj;
	
	
  @Test(priority = 0)
  public void TestInput_Selection() throws InterruptedException {
	  BingObj.inputSelection();
	  
  }
  
  @Test(priority=1)
  public void TestOutput_Selection() throws InterruptedException
  {
	  BingObj.outputSelection();
  }
   @Test(priority=2)
   public void Test_inputText()
   {
	BingObj.inputText(); 
   }
  
  @BeforeClass
  public void launchBrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\\\chetan\\\\eclipse-workspace\\\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.bing.com/translator");
driver.manage().window().maximize();

	BingObj = new Bing1(driver);  
Thread.sleep(3000);
  }

  @AfterClass
  public void CloseBrowser() throws InterruptedException {
Thread.sleep(3000);
  driver.quit();
  }

}
