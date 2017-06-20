package com.automation.simplilearn.ios;

import java.net.MalformedURLException;

import com.api.apps.foundation.core.UiObject;
import com.api.apps.foundation.core.UiSelector;
import com.api.apps.simplilearn.Simplilearn;
import com.api.ios.IOS;




public class Test1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  Simplilearn simplilearn = IOS.app.simplilearn;
		//DriverManager.createDriver();
		simplilearn.open();
		Thread.sleep(10000);	
		UiObject homeLogin= new UiSelector().xPath("//XCUIElementTypeOther//XCUIElementTypeButton[2]").makeUiObject();
	homeLogin.tap();
	Thread.sleep(5000);
	IOS.driver.quit();
	
	}
}
