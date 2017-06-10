package com.api.reports.extent;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.api.apps.foundation.core.manager.TestManager;
import com.api.apps.simplilearn.Simplilearn;
import com.api.ios.IOS;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SimpliscreenShot extends TestManager {

	ExtentReports extent;
	ExtentTest test;
	
	
	private static Simplilearn simplilearn = IOS.app.simplilearn;
	
	
	@BeforeTest
	public void beforeTest(){
		
try {
	extent =  new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentScreenshot.html");
	extent.addSystemInfo("HostName","Jagan")
	.addSystemInfo("Enviroment","QA")
	.addSystemInfo("Username","Jagan");
	extent.loadConfig(new File(System.getProperty("user.dir")+"extent-config.xml"));
			
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Assert failed as condition false");
			throw new RuntimeException(e.getMessage());
		}
	}
	
	@Test(priority=1)
	public void loginToApp() throws InterruptedException{
		//testInfo.id("test2").name("Entering credentials for login");
		try {
			test=extent.startTest("loginToApp");
			
			test.log(LogStatus.PASS, "Assert Pass as condition true");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Assert failed as condition false");
			throw new RuntimeException(e.getMessage());
		}
		}
	@Test(priority=2)
	public void verifyMyCourse() throws InterruptedException{
		try {
			test=extent.startTest("verifyMyCourse");
			
			//Assert.assertTrue(simplilearn.courseMenu.myCourseMenuUiObjects.menuIcon().exist());
			Thread.sleep(5000);

			test.log(LogStatus.PASS, "Assert Pass as condition true");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Assert failed as condition false");
			throw new RuntimeException(e.getMessage());
		}
		}
	
	@Test(priority=3)
	public void verifyLogout() throws InterruptedException, IOException{
		try {
			test=extent.startTest("verifyLogout");
			
			test.log(LogStatus.FAIL, "Assert failed as condition false");
					} catch (Exception e) {
			test.log(LogStatus.FAIL, "Assert failed as condition false");
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{

			
			String screenshotPath = GetScreenShot.capture(IOS.driver, "screenshotForextentReport");
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Screenshot below:  "+ test.addScreenCapture(screenshotPath));
			
			
			
			
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void afterTest(){
		
		extent.flush();
		extent.close();
	}

	
}
