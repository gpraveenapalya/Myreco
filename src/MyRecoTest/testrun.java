package MyRecoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Solutions.ABTesting;
import Solutions.CustomCarousel;
import Solutions.Reco;
import Tenant.Properties;
import Tenant.Tenantuser;
import utils.InputDetails;

public class testrun extends InputDetails{
public static WebDriver d=null;

	
	@BeforeClass
	public static void startpage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apalya\\Desktop\\Automation\\selenium\\MyReco\\src\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://dev.console.myreco.in:8080/login");
		d.manage().window().maximize();
		Reporter.log("discount created Pass");
		Thread.sleep(5000);
		//captureScreenshot(d);
	}
	
	@Test
	public static void openpage() throws Exception 
	{	
		Reco.login(d);
    	Thread.sleep(1000);
    	Reco.Editproject(d);
		Thread.sleep(3000);
		CustomCarousel.custom(d);
		
//		
//
		
	}
	
}
			