package com.TSBS.Sportsoft;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.TSBS.Sportsoft.Dashboard.VerifyMenubar;
import com.core.Constant;


public class NewTest {

  @BeforeTest
  public void beforeTest() throws AWTException, InterruptedException {
	Home.Login();  
  }
  
  @Test (priority=1)
  public static void Landing_Page() {      
      assertEquals(Constant.driver.getCurrentUrl(), "https://sportsoftcloudbeta.z19.web.core.windows.net/landing-page");
      Reporter.log("Redirected to the landing page Verified");
  }
  
  @Test (priority=2)
  public static void Verify_Menubar() {
	  assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).getText() , "menu");
	  Reporter.log("Drawer icon verified \n");
  }
  
  @Test (priority=3)
  public static void Verify_Menubar1() {
	  assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/h1")).getText() , "LANDING");
	  Reporter.log("Default Menu name verified \n");
  }
  
  @Test (priority=4)
  public static void Verify_Menubar2() {
	  assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/div/button/span[1]")).getText() , Constant.Username+" account_circle");
	  Reporter.log("Username and Icon Verified \n");
  }
  
  @Test (priority=5)
  public static void Verify_Drawer() {
	  //Drawar icon click
	  Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).click();
	  Reporter.log("Drawer Collapsed Verified \n");
  }
  
  @Test (priority=6)
  public static void Verify_Drawer1() {
	  //Drawar icon click
	  Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).click();
	  Reporter.log("Drawer Expand Verified \n\n");
  }
  
  @Test (priority=7)
  public static void Verify_Drawer2() {
	  //Drawer option Verification 
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[1]/div")).getText() , "home\n"+ "  Home");
	  Reporter.log("Home Option Verified \n");
  }
  
  @Test (priority=8)
  public static void Verify_Drawer3() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[2]/div")).getText() , "people\n"+ "  Personnel");
	  Reporter.log("Personnel Option Verified \n");
  }
  
  @Test (priority=9)
  public static void Verify_Drawer4() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[3]/div")).getText() , "folder_shared\n"+ "  Info");
	  Reporter.log("Info Option Verified \n");
  }
  
  @Test (priority=10)
  public static void Verify_Drawer5() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[4]/div")).getText() , "local_offer\n"+ "  Serialized");
	  Reporter.log("Serialized Option Verified \n");
  }
  
  @Test (priority=11)
  public static void Verify_Drawer6() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[5]/div")).getText() , "view_module\n"+ "  Expendable");
	  Reporter.log("Expandable Option Verified \n");
  }
  
  @Test (priority=12)
  public static void Verify_Drawer7() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[6]/div")).getText() , "access_time\n"+ "  Express");
	  Reporter.log("Express Option Verified \n");
  }
  
  @Test (priority=13)
  public static void Verify_Drawer8() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[7]/div")).getText() , "insert_chart\n"+ "  Reporting");
	  Reporter.log("Reportin Option Verified \n");
  }
  
  @Test (priority=14)
  public static void Verify_Drawer9() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[8]/div")).getText() , "cloud_upload\n"+ "  Importing");
	  Reporter.log("Importing Option Verified \n");
  }
  
  @Test (priority=15)
  public static void Verify_Drawer10() {
	  assertEquals(Constant.driver.findElement(By.xpath("//*[@id=\"sidenav\"]/div/mat-nav-list/a[9]/div")).getText() , "settings\n"+ "  Settings");
	  Reporter.log("Settings Option Verified \n\n");
	  
  }
  
  @Test (priority=16)
  public static void Verify_Drawer11() {
	  //Drawer expand and minimize
	  Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).click();
	  Reporter.log("Drawer Minimize Verified \n");
  }
  
  @Test (priority=17)
  public static void Verify_Drawer12() {
	  //Drawer expand and minimize
	  Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).click();
	  Reporter.log("Drawer Expand Verified \n");
  }
  
  @Test (priority=18)
  public static void Verify_Footer() {
	  assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"footer/mat-toolbar/h1")).getText() , "Mens Ice Hockey");
	  Reporter.log("Sport name Verified \n");
  }
  
  @Test (priority=19)
  public static void Verify_Footer1() {
	  assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"footer/mat-toolbar/button/span[1]")).getText() , "Change Sport");
	  Reporter.log("Change Sport button Verified \n");
  }
  
  @AfterTest
  public void afterTest() {
	  Home.closebrowser();
  }

}
