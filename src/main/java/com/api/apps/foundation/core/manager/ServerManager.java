package com.api.apps.foundation.core.manager;

import java.io.IOException;
import java.util.Scanner;

public class ServerManager {

	private static String OS;
	
	
	public static String getOS(){
		 if(OS==null) OS=System.getenv("os.name");
		 return OS;
	 }
	 
   public static boolean isWindows(){
	   return getOS().startsWith("Windows");
   }
   public static boolean isMac(){
	   return getOS().startsWith("Mac");
   }
   
	public static String runCommand(String command) {
		String output = null;

		try {
			Scanner scanner = new Scanner(Runtime.getRuntime().exec(command)
					.getInputStream()).useDelimiter("\\A");

			if (scanner.hasNext())
				output = scanner.next();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		return output;
	}
   
	
}
