package Baselearnpkg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class readdata {
	
	@Test(dataProviderClass=Baselearnpkg.Dataclass.class,dataProvider="Testprovider")
	public void login(String username, String Password  )

	{
		
		Reporter.log("username Entered is : " + username);
		Reporter.log("Password Entered is : " + Password);
		Assert.fail();
		System.out.println("User Name :  "    +username + " Password  :" +Password);
		
		
	}	

	@Test(dataProviderClass=Baselearnpkg.Dataclass.class,dataProvider="Testprovider")
	public void Register(String Firstname ,String Lastname , String Emailid  )

	{
		
		System.out.println("Firstname:  "    +Firstname + " Lastname  :" +Lastname + "Emailid  : " +Emailid);
		
	}

}
