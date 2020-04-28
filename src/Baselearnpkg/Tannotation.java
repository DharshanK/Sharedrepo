package Baselearnpkg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tannotation {
	
@BeforeSuite

public void configuration()
{
	System.out.println("Environemnt configuration");
}
	
@BeforeTest
public void DBconnection()
{
	System.out.println("Connecting to DB");
}

@BeforeMethod
public void launchbrowser()
{
	System.out.println("Launching browser and navigating to URl");
}
	
@Test(dependsOnMethods= {"register1","register2"})

public void login()
{
	
	System.out.println("login Test case");
}

@Test
public void register1()
{
	 
	System.out.println("Register  1 test case ");
   

}
@Test(timeOut=100)
public void register2() throws InterruptedException
{
     
	Thread.sleep(300);
	
	System.out.println("Register  2 test case ");
   

}




@AfterMethod
public void quit()
{
	System.out.println("qutting the browser");
}

@AfterTest
public void closedb()
{
	System.out.println("Closing DB connection");
}

@AfterSuite

public void deconfig()
{
	System.out.println("Environemnt deconfiguration");
}
	
}
