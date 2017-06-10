package com.api.reports.foundation;

import java.lang.reflect.Method;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListener  implements IInvokedMethodListener {
    
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("before invocation of " + method.getTestMethod().getMethodName());
       
         }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("after invocation " + method.getTestMethod().getMethodName());
    }
    
   
}