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

public class MPersonalization extends InputDetails{
	public static void MPersonalizationsub(WebDriver d) throws Exception
	{
		try {
				d.findElement(By.linkText("Analytics")).click();
				Thread.sleep(5000);
				d.findElement(By.linkText("Solutions")).click();
				Thread.sleep(3000);
				d.findElement(By.linkText("Mass Personalization")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/button")).click();
				d.findElement(By.id("CarouselTitle")).sendKeys(CarouselTitleMP);
				new Select(d.findElement(By.id("ContentType"))).selectByIndex(2);
			   d.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div/div[1]/div[3]/div/div/span/i")).click();
			   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tfoot/tr[1]/th")).click();
			   d.findElement(By.id("StartDate")).click();
			   //next
			   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
			   //start date
			   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[4]/td[2]")).click();
			     
			   d.findElement(By.id("EndDate")).click();
			   //next
			   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
			   //End date
			   d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[5]")).click();
			   //d.findElement(By.id("Reappearcriteriadays")).sendKeys("20");
			   new Select(d.findElement(By.id("user_properties"))).selectByIndex(2);
			   d.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/div/div/ul/li/input")).sendKeys("20");
			   d.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[3]/button")).click();
			   
			   new Select(d.findElement(By.id("mass_content_properties"))).selectByIndex(2);
			   new Select(d.findElement(By.id("PersonalizedBy"))).selectByIndex(2);
			   d.findElement(By.id("OrderBy")).click();
			   new Select(d.findElement(By.id("Randomize"))).selectByIndex(2);
			   d.findElement(By.id("Batchsizeforshuffling")).sendKeys("10");
			   new Select(d.findElement(By.id("Removeseencontent"))).selectByIndex(2);
			   d.findElement(By.id("Reappearcriteriadays")).sendKeys("20");
			  
				if(d.findElement(By.linkText("Cancel")).isDisplayed())
				{
					System.out.println("MPersonalizationsub cancle button is displayed");
					 Reporter.log("MPersonalizations cancle button is displayed");
				}
				else {
						captureScreenshot(d);
						Thread.sleep(5000);
						Actions action = new Actions(d);
						action.sendKeys(Keys.ESCAPE).build().perform();
						System.out.println("MPersonalizationsub cancle button is not displayed");
						Reporter.log("MPersonalizations cancle button is not displayed");
				}
				if(d.findElement(By.linkText("Save to List")).isDisplayed())
				{
					
					System.out.println("MPersonalizationsub Save to List button is displayed");
					Reporter.log("MPersonalizationsub Save to List button is displayed");
				}
				else {
						captureScreenshot(d);
						Thread.sleep(5000);
						Actions action = new Actions(d);
						action.sendKeys(Keys.ESCAPE).build().perform();
						System.out.println("MPersonalizationsub Save to List button is not displayed");
						Reporter.log("MPersonalizationsub Save to List button is not displayed");
				}
				if(d.findElement(By.linkText("Save and Preview")).isDisplayed())
				{
					System.out.println("MPersonalizationsub Save and Preview button is displayed");
					Reporter.log("MPersonalizationsub Save and Preview is displayed");
				}
				else {
						captureScreenshot(d);
						Thread.sleep(5000);
						Actions action = new Actions(d);
						action.sendKeys(Keys.ESCAPE).build().perform();
						System.out.println("MPersonalizationsub Save and Preview is not displayed");
						Reporter.log("MPersonalizationsub Save and Preview button is not displayed");
				}
		
		   d.findElement(By.linkText("Save to List")).click();
		   System.out.println("Solutionspage MassPersonalization Successful");
		   Reporter.log("Solutionspage Mass Personalization Pass");
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(5000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Solutionspage MassPersonalization Failed");
	    Reporter.log("Solutionspage Mass Personalization Fail");
        
	}
		
		
   }
	public static void MPersonalizationSearchTab(WebDriver d) throws InterruptedException, Exception
	{
		try {
			//d.findElement(By.linkText("Solutions")).click();
			//d.findElement(By.linkText("Solutions")).click();
			Thread.sleep(5000);
			d.findElement(By.linkText("Mass Personalization")).click();
			Thread.sleep(5000);
			
			// search Bar
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			
			Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[10]/i")).click();
			Thread.sleep(5000);
			
			//submit button
			d.findElement(By.xpath("//*[@id=\"myModalBlacklistedContent\"]/div/div/div[1]/button")).click();
			System.out.println("Solutionspage MassPersonalizationSearchTab Successful");
			Reporter.log("Solutionspage Mass Personalization SearchTab Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage MassPersonalizationSearchTab Failed");
			Reporter.log("Solutionspage Mass Personalization SearchTab Fail");
	        
		}
		
	}
	public static void  unpublished(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Mass Personalization")).click();
				
				//search Bar
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				//WebElement e1=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
				WebDriverWait wait=new WebDriverWait(d,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
				System.out.println("Solutionspage MassPersonalization unpublished Successful");
				Reporter.log("Solutionspage Mass Personalization unpublished Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage MassPersonalization unpublished Failed");
			Reporter.log("Solutionspage Mass Personalization unpublished Fail");
		}
		
	}
	public static void  published(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Mass Personalization")).click();
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				//WebElement e2=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
				WebDriverWait wait=new WebDriverWait(d,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
				System.out.println("Solutionspage MassPersonalization published Successful");
				Reporter.log("Solutionspage Mass Personalization published Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage MassPersonalization published Failed");
			Reporter.log("Solutionspage Mass Personalization published fail");
	        
		}
	}
	public static void  edit(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Mass Personalization")).click();
				Thread.sleep(5000);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/i")).click();
				d.findElement(By.id("Batchsizeforshuffling")).clear();
				d.findElement(By.id("Batchsizeforshuffling")).sendKeys("5");
				d.findElement(By.id("Reappearcriteriadays")).clear();
				d.findElement(By.id("Reappearcriteriadays")).sendKeys("15");
				d.findElement(By.linkText("Save to List")).click();
				System.out.println("Solutionspage Mass Personalization edit Successful");
				Reporter.log("Solutionspage Mass Personalization edit Pass");
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage Mass Personalization edit Failed");
				Reporter.log("Solutionspage Mass Personalization edit fail");
		        
			}
		}
	public static void  delete(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Mass Personalization")).click();
				Thread.sleep(5000);
				
				//search
				Reco.search(d).sendKeys(CarouselTitleMP);
				Reco.search(d).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")).click();
				Thread.sleep(5000);
				WebElement select=d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
				Actions action = new Actions(d);
				action.moveToElement(select).click().build().perform();
				System.out.println("Solutionspage MassPersonalization delete Successful");
				Reporter.log("Solutionspage Mass Personalization delete Pass");
				Thread.sleep(5000);
				//next page
			if(d.findElement(By.xpath("//*[@id=\"DataTables_Table_0_next\"]/a")).isDisplayed())
			{
			d.findElement(By.xpath("//*[@id=\"DataTables_Table_0_next\"]/a")).click();
			System.out.println("In Solutionspage MassPersonalization page next page is selected pass");
			Reporter.log("In Solutionspage MassPersonalization page next page is selected Pass");
			}
			else 
			{
				captureScreenshot(d);
				Thread.sleep(5000);	
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("In Solutionspage MassPersonalization page next page is not selected pass");
				Reporter.log("In Solutionspage MassPersonalization page next page is not selected Pass");
			}
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage MassPersonalization delete Failed");
				Reporter.log("Solutionspage Mass Personalization delete fail");
		        
			}
		}
	public static void  BlackListedContent(WebDriver d) throws InterruptedException, Exception
	{
		try {
			
				d.findElement(By.linkText("Mass Personalization")).click();
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
				System.out.println("Solutionspage Mass Personalization BlackListedContent pass");
				Reporter.log("Solutionspage Mass Personalization BlackListedContent Pass");
			}
		
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(10000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Solutionspage Mass Personalization BlackListedContent Failed");
		Reporter.log("Solutionspage Mass Personalization BlackListedContent Fail");
        
	}
		
	}

}
