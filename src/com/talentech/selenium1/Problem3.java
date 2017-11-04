/* Problem 03.	“Create a Shipment” from shipping tab */

package com.talentech.selenium1;

import org.testng.annotations.Test; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Problem3 {
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  driver= new FirefoxDriver();
		  driver.get("https://www.ups.com/one-to-one/login");
		  driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void Test3() {
		  
		  WebElement pgLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]"));
		  String msgAct1 = pgLogin.getText();
		  String msgExp1 = "Log In";
		  Assert.assertEquals(msgAct1, msgExp1);
		  
		  WebElement editId = driver.findElement(By.xpath("//*[@id='repl_id1']"));
		  editId.clear();
		  editId.sendKeys("raselualam");
		  
		  WebElement editPass = driver.findElement(By.xpath("//*[@id='repl_id4']"));
		  editPass.clear();
		  editPass.sendKeys("TTjob_123");
		  
		  WebElement btnLogin = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		  btnLogin.click();
		  
		  WebElement btnShipping = driver.findElement(By.xpath("//*[@id='navImg1']"));
		  btnShipping.click();
		  
		  WebElement btnCreateShipping = driver.findElement(By.xpath("//*[@id='ccpnmenu1']/a[1]"));
		  btnCreateShipping.click();
		  
		  WebElement btnContinue = driver.findElement(By.xpath("//*[@id='ContinueToApplication']"));
		  btnContinue.click();
		  
		  //We don't have enough data like credit card info to go ahead.
		  
	  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
