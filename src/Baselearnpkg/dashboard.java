package Baselearnpkg;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dashboard {
	 	
	@BeforeMethod(groups="smoke")
	public void beforemethod()
	{
		System.out.println("Launch URL and navigate to browser");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void displaybashboard()
	{
		System.out.println("Dashboard is displayed");
	}

@Test(enabled=false)
public void displaybashboard1()
{
	System.out.println("Dashboard search function");
}


@Test(groups="smoke")
public void displayskip()
{
	System.out.println("i am skipping uing skip Exception");
	throw new SkipException("Incmplete Test case");
}


@Test(groups="smoke")
public void serach()
{
	System.out.println("Dashboard search function");
}

@Test(groups="Regression")
public void title()
{
	System.out.println("Title of dashboard");
}


@AfterMethod(groups="smoke")
public void Aftermethod()
{
	System.out.println("Quitting the browser");
}


}
