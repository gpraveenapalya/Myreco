package Analytics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class ContentBasedPersonalization extends InputDetails {
	public static void CBPersonalization(WebDriver d) throws InterruptedException, Exception
	{
		try {
			System.out.println("ContentBasedPersonalization is Displayed");
			Reporter.log("ContentBasedPersonalization is Displayed");
			d.findElement(By.linkText("Content Based Personalization")).click();
			Thread.sleep(5000);
			new Select(d.findElement(By.id("_carouselNameSelected"))).selectByIndex(1);
		    new Select(d.findElement(By.id("_period"))).selectByIndex(1);
		    new Select(d.findElement(By.id("_comparedCarouselNameSelected"))).selectByIndex(1);
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("ContentBasedPersonalization is not Displayed");
			Reporter.log("Content Based Personalization is not Displayed");
		}
		
		
	}

}
