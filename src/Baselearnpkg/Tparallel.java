package Baselearnpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Tparallel {
	
	WebDriver driver ;
	
	@Test(dataProvider="Testdata")
	public void Browser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\Chrome\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.google.co.in");
		
		}
		
		if(browser.equalsIgnoreCase("IE"))
		{
		  System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer\\IEDriverServer.exe");
	
			driver= new InternetExplorerDriver();
			driver.get("https://www.google.co.in");
			
		}
	}




@DataProvider(name="Testdata",parallel=true)
public String[] senddata()
{
 return new String[] {"chrome","IE"};
}

}
