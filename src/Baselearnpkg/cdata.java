package Baselearnpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class cdata {
	
@Test(dataProvider="Testprovider")
public void login(String username, String Password  )

{
	
	System.out.println("User Name :  "    +username + " Password  :" +Password);
}


public void register(String firstname, String password ,String username )

{
	System.out.println("User Name :  "    +username + " Password  :" +password);
}


public void sample(String firstname)

{
	System.out.println("User Name :  "    +firstname );
}

@DataProvider(name="Testprovider")
public String[][] getdata()
{
	String [][] data =new String[2][2];
	data[0][0]="Test1";
	data[0][1]="pass1";
	
	
	data[1][0]="Test2";
	data[1][1]="pas2";
	
	return data;
}

}
