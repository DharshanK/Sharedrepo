package Baselearnpkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Tlistener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Secondline");
		if(true)
		{
			System.out.println("Print true");
		}
		System.out.println("Testing  Modify");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	Reporter.log(result.getName()+" is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName()+" is failed");
		Reporter.log("<a href=\"C:\\quote.jpg\" target=\"_blank\">Test case failed :</a>" +result.getName()) ;
		Reporter.log("<br>");
		
	
		Reporter.log("<a href=\"C:\\quote.jpg\" target=\"_blank\"><img height=200 width=200 src=\"C:\\quote.jpg\"></img></a>" +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log(context.getName()+" Started Execution");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log(context.getName()+"  Execution complete");
	}
	
	

}
