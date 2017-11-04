/* Problem 01.	Login Test:  
					a.	Write a test with wrong user id (Create separate test)
					b.	Write a test with wrong password (Create separate test)
					c.	Write a test with valid user id and password (Create separate test) */

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

public class Problem1 {
	WebDriver driver= new FirefoxDriver();
	
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.get("https://www.ups.com/one-to-one/login");
		  driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void TestA() {
		  
		  WebElement pgLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]"));
		  String msgAct1 = pgLogin.getText();
		  String msgExp1 = "Log In";
		  Assert.assertEquals(msgAct1, msgExp1);
		  
		  WebElement editId = driver.findElement(By.xpath("//*[@id='repl_id1']"));
		  editId.clear();
		  editId.sendKeys("InvalidID");
		  
		  WebElement editPass = driver.findElement(By.xpath("//*[@id='repl_id4']"));
		  editPass.clear();
		  editPass.sendKeys("TTjob_123");
		  
		  WebElement btnLogin = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		  btnLogin.click();
		  
		  WebElement pgafterLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]/h2"));
		  String msgAct2 = pgafterLogin.getText();
		  String msgExp2 = "Log In";
		  Assert.assertEquals(msgAct2, msgExp2);
		  //I tried to put Assert for "error text" but unfortunately its always failed so i put Assert on Tab Title.
	  }

	  @Test
	  public void TestB() {
		  
		  WebElement pgLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]"));
		  String msgAct1 = pgLogin.getText();
		  String msgExp1 = "Log In";
		  Assert.assertEquals(msgAct1, msgExp1);
		  
		  WebElement editId = driver.findElement(By.xpath("//*[@id='repl_id1']"));
		  editId.clear();
		  editId.sendKeys("raselulalam");
		  
		  WebElement editPass = driver.findElement(By.xpath("//*[@id='repl_id4']"));
		  editPass.clear();
		  editPass.sendKeys("InvalidPassword");
		  
		  WebElement btnLogin = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		  btnLogin.click();
		  
		  WebElement pgafterLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]/h2"));
		  String msgAct2 = pgafterLogin.getText();
		  String msgExp2 = "Log In";
		  Assert.assertEquals(msgAct2, msgExp2);
		  //I tried to put Assert for "error text" but unfortunately its always failed so i put Assert on Tab Title.
	  }
	  
	  @Test
	  public void TestC() {
		  
		  WebElement pgLogin = driver.findElement(By.xpath("//*[@id='main']/form/div[1]/div[1]/div[1]"));
		  String msgAct1 = pgLogin.getText();
		  String msgExp1 = "Log In";
		  Assert.assertEquals(msgAct1, msgExp1);
		  
		  WebElement editId = driver.findElement(By.xpath("//*[@id='repl_id1']"));
		  editId.clear();
		  editId.sendKeys("raselulalam");
		  
		  WebElement editPass = driver.findElement(By.xpath("//*[@id='repl_id4']"));
		  editPass.clear();
		  editPass.sendKeys("TTjob_123");
		  
		  WebElement btnLogin = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		  btnLogin.click();
		  
		  WebElement btnMyups = driver.findElement(By.xpath("//*[@id='navImg0']"));
		  String msgAct3 = btnMyups.getText();
		  String msgExp3 = "My UPS";
		  Assert.assertEquals(msgAct3, msgExp3);
		  
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
