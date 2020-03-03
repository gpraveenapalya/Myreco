package Analytics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import utils.InputDetails;

public class Dashboard extends InputDetails{
	public static void dashboard(WebDriver d) throws InterruptedException, Exception
	{
		try {
			d.findElement(By.linkText("Analytics")).click();
			Thread.sleep(5000);
			System.out.println("Dashboard is Displayed");
			Reporter.log("Dashboard is Displayed Pass");
			d.findElement(By.linkText("Dashboard")).click();
			}
		catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Dashboard is not Displayed");
				Reporter.log("Dashboard is not Displayed Fail");
			}	
	}
}
