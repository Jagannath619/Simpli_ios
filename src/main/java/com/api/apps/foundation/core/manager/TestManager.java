package com.api.apps.foundation.core.manager;

import com.api.apps.foundation.core.TestInfo;



public class TestManager {
public static TestInfo testInfo = new TestInfo();
	
	/*@Rule
	public Retry retry = new Retry(1);

	@Before
	public void before(){
		testInfo.reset();
	}
	
	@Rule
	public TestRule listen = new TestWatcher(){
		
		public void failed(Throwable t,Description description){
			MyLogger.log.info("Test Failed");
			TestInfo.printResults();
			
		}
      public void succeded(Description description){
    	  MyLogger.log.info("Test Passed");
			TestInfo.printResults();
		}
	};*/
}
