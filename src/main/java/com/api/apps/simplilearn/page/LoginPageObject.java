package com.api.apps.simplilearn.page;

import com.api.apps.foundation.core.UiObject;
import com.api.apps.foundation.core.UiSelector;

public class LoginPageObject {

	private static UiObject 
    startLogin,
    username,
    password,
    logingButton;

public UiObject startLogin(){
if(startLogin == null) startLogin = new UiSelector().text("LOGIN").makeUiObject();
return startLogin;
		
}

public UiObject username(){
	if(username == null) username = new UiSelector().text("Email").makeUiObject();
   return username;
			
	}
 
public UiObject password(){
	if(password == null) password = new UiSelector().text("Password").makeUiObject();
   return password;
			
	}
 
public UiObject logingButton(){
	if(logingButton == null) logingButton = new UiSelector().text("LOGIN").makeUiObject();
   return startLogin;
			
	}
}
