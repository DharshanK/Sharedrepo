package Baselearnpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testparam {
	
	
	@Test
	@Parameters({"user","pass"})
	public void login(String Username ,String Password)
	{
		
		System.out.println("User Name : " +Username);	
		System.out.println("Password : " +Password);
	}

	
	@Test
	@Parameters({"user","pass"})
	public void login1(String User ,String Passwrd)
	{
		System.out.println("differnt Sceanrio");
		System.out.println("User Name : " +User);	
		System.out.println("Password : " +Passwrd);
	}
}
