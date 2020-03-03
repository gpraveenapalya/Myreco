package Analytics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import utils.InputDetails;


public class ABTesting extends InputDetails{

	public static void abTesting(WebDriver d) throws InterruptedException, Exception
	{
		try {
		if(d.findElement(By.linkText("A/B Testing")).isDisplayed())
		{
			System.out.println("A/B Testing is Displayed");
			Reporter.log("A/B Testing is Displayed");
			d.findElement(By.linkText("A/B Testing")).click();
			Thread.sleep(5000);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(carouselSearchTerm);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}
			else {
					captureScreenshot(d);
					Thread.sleep(5000);
					System.out.println("A/B Testing is not Displayed");
					Reporter.log("A/B Testing is not Displayed");
				}
			if(d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[6]/button")).isDisplayed())
			{
				System.out.println("A/B Testing viewed is Displayed");
				Reporter.log("A/B Testing view button  is Displayed");
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[6]/button")).click();
			}
			else
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("A/B Testing viewed is not Displayed");
				Reporter.log("A/B Testing view button  is not Displayed");
			}
			
		
		Thread.sleep(3000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("A/B testing Failed");
			Reporter.log("A/B Testing fail");
	        
		}
		
	}

}
