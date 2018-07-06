package com.qait.tap.hristest.AutomationQAmaven;

import org.testng.annotations.Test;


 
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BingTest {
	
	bING bingObj = new bING();	
	
 @Test (priority = 0)
 public void InputDrop() {
	 bingObj.inputSelection();
 }

 @Test (priority = 1)
 public void OutputDrop() {
	 bingObj.outputSelection();
 }
 
 @Test (priority = 2)
 public void sendText()
 {
	 bingObj.sendtext();
 }
  
 @Test (priority = 3)
 public void checkTranslation() throws InterruptedException {
	Assert.assertTrue(bingObj.translation());
 }
	
  @BeforeClass
  public void beforeClass() {
	  bingObj.launchBrowser();
  }

  @AfterClass
  public void afterClass() {
	  bingObj.closeBrowser();
  }

 
}