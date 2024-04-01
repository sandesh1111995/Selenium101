package com.TSBS.Sportsoft;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.core.Constant;

public class Home {
	  
	  
	  public static void Login() throws AWTException, InterruptedException {
		  //WebConstant.driverManager.chromeConstant.driver().setup();
	      
	      String expectedTitle = "EquipmentManager";
	      String actualTitle = "";
	      

	      // launch Chrome and direct it to the Base URL
	      Constant.driver.get(Constant.baseUrl);
	      
	      // maximize window
	      Constant.driver.manage().window().maximize();

	      // get the actual value of the title
	      //actualTitle = Constant.driver.getTitle();

	      //compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"
//	      if (actualTitle.contentEquals(expectedTitle)){
//	          System.out.println("Test Passed!");
//	      } else {
//	          System.out.println("Test Failed");
//	      }
	      
	      //Login
	      //Constant.driver.findElement(By.xpath("/html/body/app-root/app-login-page/section/section/mat-card[2]/button[1]/span[1]")).click();
	      WebElement username=Constant.driver.findElement(By.id("username"));
	      WebElement password=Constant.driver.findElement(By.id("password"));
	      WebElement login=Constant.driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/form/div[2]/button"));
	      username.sendKeys(Constant.Username);
	      password.sendKeys("0nlyF0rT3sting!");
	      login.click();
	      Thread.sleep(5000);
	      
	      // Terms and condition dialog box handle
	      Constant.driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-dialog-v2/div[3]/app-button/div/div[1]/button/span[1]")).click(); // Clicking on the popup button
	      Robot robot = new Robot();
	      //System.out.println("Test2");
	      Thread.sleep(2000);
	      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	      Thread.sleep(5000);
	  }
	  
	  
	  public static void closebrowser() {
		  //close Constant.driver
	      Constant.driver.close();
	  }

}
