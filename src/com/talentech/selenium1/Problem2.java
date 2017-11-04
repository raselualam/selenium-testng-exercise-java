/* Problem 02.	Open profile page and verify right profile name */

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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Problem2 {
  
	WebDriver driver= new FirefoxDriver();	
	
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.get("https://www.ups.com/one-to-one/login");
		  driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void Test2() {
		  
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
		  
		  Actions hoverAction = new Actions (driver);
		  WebElement movetoMyups = driver.findElement(By.xpath("//*[@id='navImg0']"));
		  hoverAction.moveToElement(movetoMyups);
		  hoverAction.perform();
		  
		  WebElement profile = driver.findElement(By.xpath("//*[@id='ccpnmenu0']/a[2]/img[2]"));
		  profile .click();
		  
		  WebElement pgProfile = driver.findElement(By.xpath("//*[@id='main']/div/fieldset/div[2]/fieldset/dl[1]/dd"));
		  String msgAct2 = pgProfile.getText();
		  String msgExp2 = "raselulalam";
		  Assert.assertEquals(msgAct2, msgExp2);
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
