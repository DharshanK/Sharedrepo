package Baselearnpkg;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Dataclass {

	
	@DataProvider(name="Testprovider")
	public static String[][] getdata(Method m)
	{
		String [][] data =null; 
		if(m.getName().equals("login"))
		{
		 data =new String[2][2];
		data[0][0]="Test1";
		data[0][1]="pass1";
		
	
		data[1][0]="Test2";
		data[1][1]="pas2";
		
		
		}else if(m.getName().equals("Register"))
		{
		  data =new String[2][3];
			data[0][0]="User1";
			data[0][1]="last1";
			data[0][2]="Test1@fmail.com";
			
			data[1][0]="User2";
			data[1][1]="last1";
			data[1][2]="Test2@fmail.com";
		}
		
		return data;
	
	}
	
	
}
