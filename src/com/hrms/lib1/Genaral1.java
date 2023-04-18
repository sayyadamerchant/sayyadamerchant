package com.hrms.lib1;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility1.Log;



public class Genaral1  extends Gobal1{

		//To provide all re-usable fun:/methods related to whole application
		public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "F:\\new floder selenium\\new floder geckodriver path\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		}
		public void closeApplication() 
		{
		driver.close();
		}
		public void login() 
		{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Application Opened"); //logfile
		}
		public void logout() 
		{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Application Opened"); //html Report
		Log.info("logout complted"); //logfile
		}
		public void enterFrame() 
		{
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into Frame");
		Log.info("enter into frme"); //logfile
		}
		public void exitFrame() 
		{
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frme"); //logfile
		}
		public void addNewEmp() 
		{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_empfn)).sendKeys(FN);
		driver.findElement(By.name(txt_empln)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp Added");
		Log.info("new emp added"); //logfile

	}

}
