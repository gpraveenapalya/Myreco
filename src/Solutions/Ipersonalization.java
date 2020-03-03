package Solutions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utils.InputDetails;

public class Ipersonalization extends InputDetails{

	public static void Ipersonalizationsub(WebDriver d) throws Exception
	{	
		try {
			d.findElement(By.linkText("Analytics")).click();
			Thread.sleep(5000);
			d.findElement(By.linkText("Solutions")).click();
			Thread.sleep(5000);
			d.findElement(By.linkText("Individual Personalization")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/button")).click();
			d.findElement(By.id("CarouselTitle")).sendKeys(CarouselTitleIP);
			new Select(d.findElement(By.id("ContentType"))).selectByIndex(2);
		   d.findElement(By.id("StartDate")).click();
		   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[4]/td[2]")).click();
		   
		   d.findElement(By.id("EndDate")).click();
		   //next
		   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		   //date
		   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[5]")).click();		
		   d.findElement(By.id("TestingCheckBox")).click();
		   d.findElement(By.id("RelevanceParameters")).click();
		   d.findElement(By.id("MOUcutoff")).sendKeys("80");
		   new Select(d.findElement(By.id("Randomize"))).selectByIndex(2);
		   d.findElement(By.id("Batchsizeforshuffling")).sendKeys("30");
		   new Select(d.findElement(By.id("Removeseencontent"))).selectByIndex(2);
		   d.findElement(By.id("Reappearcriteriadays")).sendKeys("50");
		   d.findElement(By.id("Numberofcontentstofetch")).sendKeys("30");
		   if(d.findElement(By.linkText("Cancel")).isDisplayed())
			{
				System.out.println("Individual Personalization cancle button isdisplayed");
				Reporter.log("Individual Personalization cancle button is displayed");
			}
		   else {
			   	   captureScreenshot(d);
				   Thread.sleep(5000);
				   Actions action = new Actions(d);
				   action.sendKeys(Keys.ESCAPE).build().perform();
				   System.out.println("Individual Personalization cancle button is not displayed");
				   Reporter.log("Individual Personalization cancle button is not displayed");
		   }
			if(d.findElement(By.linkText("Save to List")).isDisplayed())
			{
				
				System.out.println("Individual Personalization Save to List button is displayed");
				Reporter.log("Individual Personalization Save to List button is displayed");
			}
			else {
					captureScreenshot(d);
					Thread.sleep(5000);
					Actions action = new Actions(d);
					action.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Individual Personalization Save to List button is not displayed");
					Reporter.log("Individual Personalization Save to List button is not displayed");
			}
			if(d.findElement(By.linkText("Save and Preview")).isDisplayed())
			{
				System.out.println("Individual Personalization Save and Preview button is displayed");
				Reporter.log("Individual Personalization Save and Preview button is displayed");
			}
			else {
					captureScreenshot(d);
					Thread.sleep(5000);
					Actions action = new Actions(d);
					action.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Individual Personalization Save and Preview button is not displayed");
					Reporter.log("Individual Personalization Save and Preview button is not displayed");
			}
				 d.findElement(By.linkText("Save to List")).click();
				 System.out.println("Solutionspage IndividualPersonalization Successful");
				 Reporter.log("Solutionspage Individual Personalization Pass");
			}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage IndividualPersonalization Failed");
		    Reporter.log("Solutionspage Individual Personalization Failed");
		}
		

}
	public static void IpersonalizationSearchTab(WebDriver d) throws InterruptedException, Exception
	{
		try {
			//d.findElement(By.linkText("Solutions")).click();
			 Thread.sleep(3000);
			d.findElement(By.linkText("Individual Personalization")).click();
			Thread.sleep(3000);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleIP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			//WebDriverWait wait=new WebDriverWait(d,30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")));
			//d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/button")).click();
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[7]/div/button")));
			Thread.sleep(5000);
			WebElement select=d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
			Actions action = new Actions(d);
			action.moveToElement(select).click().build().perform();
			System.out.println("Solutionspage IndividualPersonalizationSearchTab Successful");
			Reporter.log("Solutionspage IndividualPersonalizationSearchTab Pass");
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(5000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Solutionspage IndividualPersonalizationSearchTab Failed");
		Reporter.log("Solutionspage IndividualPersonalizationSearchTab Fail");
	}
	
	}
	public static void  unpublished(WebDriver d) throws InterruptedException, Exception
	{
		try {
			d.findElement(By.linkText("Individual Personalization")).click();
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleIP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			//Thread.sleep(5000);
			//WebElement e2=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
			WebDriverWait wait=new WebDriverWait(d,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
			System.out.println("Solutionspage IndividualPersonalization unpublished Successful");
			Reporter.log("Solutionspage IndividualPersonalization unpublished Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage IndividualPersonalization unpublished Failed");
			Reporter.log("Solutionspage IndividualPersonalization unpublished Fail");
		}
	}
	public static void  published(WebDriver d) throws InterruptedException, Exception
	{
		try {
			d.findElement(By.linkText("Individual Personalization")).click();
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleIP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			//Thread.sleep(5000);
			//WebElement e2=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
			WebDriverWait wait=new WebDriverWait(d,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
			System.out.println("Solutionspage IndividualPersonalization published Successful");
			Reporter.log("Solutionspage IndividualPersonalization published Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage IndividualPersonalization published Failed");
			Reporter.log("Solutionspage IndividualPersonalization published Fail");
	        
		}
	}
		public static void  edit(WebDriver d) throws Exception
		{
			try {
				d.findElement(By.linkText("Individual Personalization")).click();
				Thread.sleep(5000);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleIP);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/i")).click();
				Thread.sleep(5000);
				 d.findElement(By.id("MOUcutoff")).clear();
				 d.findElement(By.id("MOUcutoff")).sendKeys("20");
				 d.findElement(By.id("Batchsizeforshuffling")).clear();
				 d.findElement(By.id("Batchsizeforshuffling")).sendKeys("10");
				 d.findElement(By.linkText("Save to List")).click();
				 Reporter.log("Solutionspage IndividualPersonalization edited pass");
				 System.out.println("Solutionspage Individual Personalization edited pass");
			
			}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage IndividualPersonalization edited Failed");
		    Reporter.log("Solutionspage Individual Personalization edited Fail");
		}
			
		
	}
		public static void  BlackListedContent(WebDriver d) throws InterruptedException, Exception
		{
			try {
				
				d.findElement(By.linkText("Individual Personalization")).click();
				
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[10]/i")).click();
				Thread.sleep(5000);
				if(!d.findElement(By.xpath("//*[@id=\"myModalBlacklistedContent\"]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/span/a")).isDisplayed())
				{
					d.findElement(By.xpath("//*[@id=\"myModalBlacklistedContent\"]/div/div/div[1]/button")).click();
				}
				else
				{
				d.findElement(By.xpath("//*[@id=\"myModalBlacklistedContent\"]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/span/a")).click();
				Thread.sleep(5000);
				}
				if(d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[1]/div/ol/li[3]/strong")).isDisplayed()) 
				{
					System.out.println("Solutionspage IndividualPersonalization BlackListedContent pass");
					Reporter.log("Solutionspage Individual Personalization BlackListedContent Pass");
				}
			
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(10000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage IndividualPersonalization BlackListedContent Failed");
			Reporter.log("Solutionspage Individual Personalization BlackListedContent Fail");
	        
		}
			
		}
		


}
