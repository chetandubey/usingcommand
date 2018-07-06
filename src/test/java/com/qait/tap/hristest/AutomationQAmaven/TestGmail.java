package com.qait.tap.hristest.AutomationQAmaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
 

public class TestGmail {
  WebDriver driver;
 Gmail Obj;
	
  @Test(priority = 0)
  public void Test_gmail_login() {
   Obj.Gmail_Login("Chetandubey93120","rajat@1998");
   }
  
  @Test(priority=1)
  public void Test_Compose() throws InterruptedException
  {
	  Obj.Compose();
  }
 
  
 @Test(priority=2)
  public void Test_List_Table()
  {
	  Obj.List_Table(0,1);
  }

  @BeforeClass
  public void testlaunchGmail() {
	  
	System.setProperty("webdriver.chrome.driver","D:\\chetan\\eclipse-workspace\\chromedriver.exe");
  driver= new ChromeDriver();
  driver.get("https://mail.google.com/mail"); 
  driver.manage().window().maximize();
 Obj = new Gmail(driver);
 
  
  }

  @AfterClass
  public void closeGmail() throws InterruptedException {
	  Thread.sleep(10000);

	  driver.quit();
  }

}
