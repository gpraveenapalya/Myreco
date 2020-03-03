package Analytics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class ContentBasedRecommendations extends InputDetails{
	public static void CBRecommendations(WebDriver d) throws InterruptedException, Exception
	{
		try {
			System.out.println("ContentBasedRecommendations is Displayed");
			Reporter.log("Content Based Recommendations is Displayed Pass");
			d.findElement(By.linkText("Content Based Recommendations")).click();
			Thread.sleep(5000);
			new Select(d.findElement(By.id("_carouselNameSelected"))).selectByIndex(1);
		    new Select(d.findElement(By.id("_period"))).selectByIndex(1);
		    new Select(d.findElement(By.id("_comparedCarouselNameSelected"))).selectByIndex(1);
			
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("ContentBasedRecommendations is not Displayed");
			Reporter.log("Content Based Recommendations is Displayed Fail");
		}
		
		
	}

}
