/* Problem 04.	Tracking package from tracking tab:  
								a.	Track by a number (Create separate test)
								b.	Track by reference (Create separate test)      */

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

public class Problem4 {
  
	WebDriver driver= new FirefoxDriver();
	
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.get("https://www.ups.com/one-to-one/login");
		  driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void TestTrackbyNumber() {
		  
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
		  
		  Actions hoverAction2 = new Actions (driver);
		  WebElement Tracking = driver.findElement(By.xpath("//*[@id='navImg2']"));
		  hoverAction2.moveToElement(Tracking);
		  hoverAction2.perform();
		  
		  WebElement btnTracking = driver.findElement(By.xpath("//*[@id='ccpnmenu2']/a[1]"));
		  btnTracking.click();
		  
		  WebElement tboxTrackingNum = driver.findElement(By.xpath("//*[@id='trackNums']"));
		  tboxTrackingNum.clear();
		  tboxTrackingNum.sendKeys("123456");
		  
		  WebElement btnTrack = driver.findElement(By.xpath("//*[@id='ui-id-2']/form/div/fieldset/div[2]/div/input"));
		  btnTrack.click();
		  
		  
	  }
	  
	  
	  @Test
	  public void TestTrackbyReference() {
		  
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
		  
		  Actions hoverAction2 = new Actions (driver);
		  WebElement Tracking = driver.findElement(By.xpath("//*[@id='navImg2']"));
		  hoverAction2.moveToElement(Tracking);
		  hoverAction2.perform();
		  
		  WebElement btnTracking = driver.findElement(By.xpath("//*[@id='ccpnmenu2']/a[1]"));
		  btnTracking.click();
		  
		  WebElement btnRefTracking = driver.findElement(By.xpath("//*[@id='ui-id-3']/a"));
		  btnRefTracking.click();
		  
		  WebElement btnShipmentType = driver.findElement(By.xpath("//*[@id='mailRadio']"));
		  btnShipmentType.click();
		  
		  WebElement editReference = driver.findElement(By.xpath("//*[@id='ui-id-4']/form/div/fieldset/div[1]/dl[2]/dd/input"));
		  editReference.clear();
		  editReference.sendKeys("10 crates");
		  
		  WebElement btnstCalender = driver.findElement(By.xpath("//*[@id='ui-id-4']/form/div/fieldset/div[1]/dl[3]/dd/img[1]"));
		  btnstCalender.click();
		  
		  WebElement startDate = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[7]/a"));
		  startDate.click();
		  
		  WebElement btnendCalender = driver.findElement(By.xpath("//*[@id='ui-id-4']/form/div/fieldset/div[1]/dl[3]/dd/img[2]"));
		  btnendCalender.click();
		  
		  WebElement endDate = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a"));
		  endDate.click();
		  
		  WebElement editZipcode = driver.findElement(By.xpath("//*[@id='DestinationPostalCode']"));
		  editZipcode.clear();
		  editZipcode.sendKeys("07029");
		  
		  Actions buttonclick = new Actions (driver);
		  WebElement buttonhere = driver.findElement(By.xpath(".//*[@id='ui-id-4']/form/div/fieldset/div[3]/div/input"));
		  buttonclick.moveToElement(buttonhere).click().perform();
		  
		  
		  //WebElement btnTrack1 = driver.findElement(By.xpath(".//*[@id='ui-id-4']/form/div/fieldset/div[3]/div/input"));
		  //btnTrack1.click();
		  
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
