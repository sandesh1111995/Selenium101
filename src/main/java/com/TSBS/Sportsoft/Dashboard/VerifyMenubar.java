package com.TSBS.Sportsoft.Dashboard;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.core.Constant;

public class VerifyMenubar {
	@Test 
	  public static void Verify_Menubar() {
		  Assert.assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/button/span[1]/mat-icon")).getText() , "menu");
		  Reporter.log("Drawer icon verified \n");
	  }
	@Test 
	  public static void Verify_Menubar1() {
		  Assert.assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/h1")).getText() , "LANDING");
		  Reporter.log("Default Menu name verified \n");
	  }
	@Test 
	  public static void Verify_Menubar2() {
		  Assert.assertEquals(Constant.driver.findElement(By.xpath(Constant.Common+"header/mat-toolbar/div/button/span[1]")).getText() , Constant.Username+" account_circle");
		  Reporter.log("Username and Icon Verified \n");
	  }
}
