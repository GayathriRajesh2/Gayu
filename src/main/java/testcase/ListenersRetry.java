package testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ListenersRetry implements IAnnotationTransformer, IRetryAnalyzer {
	int ImaxRetry =1 ;
	@Override 

	public boolean retry(ITestResult result) {
	
		if(!result.isSuccess() && ImaxRetry < 2)
		{
		   ImaxRetry++;
		   return true;
	    }
		else
		{
			 return false;
		}
       
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testconstructor, Method method) 
	{
		annotation.setRetryAnalyzer(this.getClass());
	}
	
}


