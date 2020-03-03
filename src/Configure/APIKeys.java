package Configure;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import utils.InputDetails;

public class APIKeys extends InputDetails{
	public static void usersearch(WebDriver d) throws InterruptedException, Exception
	{
		try {
		if(d.findElement(By.linkText("API Key")).isDisplayed())
		{
			System.out.println("API Keys is Displayed");
			Reporter.log("API Keys is Displayed Pass");
			d.findElement(By.linkText("API Key")).click();
		}
		
		else
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("API Keys is not Displayed");
			Reporter.log("API Keys is Displayed Fail");
		}
		if(d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/span/button")).isDisplayed())
		{
			System.out.println("Project ID and Copy button is Displayed");
			Reporter.log("Project ID and Copy button Pass");
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/span/button")).click();
		}
		else
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Project ID and Copy button is not Displayed");
			Reporter.log("Project ID and Copy button Fail");
		}
		if(d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[2]/div/span/button")).isDisplayed())
		{
			System.out.println("Project Token field and Copy button is Displayed");
			Reporter.log("Project Token field and Copy button is Displayed Pass");
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[2]/div/span/button")).click();
		}
		}
		catch(Exception e) 
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Project Token field and Copy button is not Displayed");
			System.out.println("API Keys usersearch Failed");
			Reporter.log("Project Token field and Copy button is not Displayed Fail");
			Reporter.log("API Keys usersearch Failed ");
		}
		
		
		
	}

}
