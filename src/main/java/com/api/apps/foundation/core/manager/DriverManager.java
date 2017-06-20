package com.api.apps.foundation.core.manager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import com.api.apps.foundation.core.MyLogger;
import com.api.ios.IOS;




public class DriverManager {
	
	private static String nodeJS="/Applications/Appium.app/Contents/Resources/node/bin/node";
	//private static String appiumJS="/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/ios-webkit-debug-proxy-launcher.js";
	//private static String appiumJS="/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js";
	private static String appiumJS="/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js";
	private static AppiumDriverLocalService service;
	private static String deviceID;
	
	private static HashMap<String ,URL> hosts;
	private static String unlockPackage = "io.appium.unlock";
	 private static File classpathRoot = new File(System.getProperty("user.dir"));
	 private static File appDir = new File(classpathRoot, "/apps/");
	 private static File app= new File("//Users//jagannath//Documents//Simplilearn_ios//Simplilearn.app");
	 
	 private static DesiredCapabilities getCaps(){
			MyLogger.log.info("Creating desirecapabalities for device: "+deviceID);
			DesiredCapabilities caps = new DesiredCapabilities();
//			caps.setCapability("deviceName", deviceID);
//			caps.setCapability("platfornName", "Android");
//			caps.setCapability("app",app.getAbsolutePath());
//			caps.setCapability("platfornName", "Android");
//			caps.setCapability("noReset", "true");
			
			
			caps.setCapability(MobileCapabilityType.APP, app);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
			
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Golden's iPhone");
			caps.setCapability(MobileCapabilityType.UDID, "95077cf465446a4a204509b3bc47018537f105b9");
			caps.setCapability("bundleID","com.simplilearn.Simplilearn");
			
			caps.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
			
			caps.setCapability("automationName", "XCUITest");
			return caps;
		}
	 
	 private static URL host() throws MalformedURLException{
			if(hosts==null) {
				hosts= new HashMap<String, URL>();
				hosts.put(deviceID, new URL("http://127.0.0.1:4723/wd/hub"));
				
			}return hosts.get(deviceID);
		}
	 
	 public static void createDriver() throws MalformedURLException{
			
				MyLogger.log.info("Trying to create a new Driver for device:IOSs");
				
				IOS.driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),getCaps());
				//driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				
			
			
		}

}
