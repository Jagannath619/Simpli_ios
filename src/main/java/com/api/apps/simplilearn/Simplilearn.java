package com.api.apps.simplilearn;

import java.net.MalformedURLException;

import com.api.apps.foundation.core.manager.DriverManager;
import com.api.apps.interfaces.Application;




public class Simplilearn implements Application{

	public void forceStop() {
		// TODO Auto-generated method stub
		
	}

	public void clearData() {
		// TODO Auto-generated method stub
		
	}

	public Object open() throws MalformedURLException {
		DriverManager.createDriver();
		return null;
	}

	public String packageID() {
		// TODO Auto-generated method stub
		return null;
	}

	public String activityID() {
		// TODO Auto-generated method stub
		return null;
	}

}
