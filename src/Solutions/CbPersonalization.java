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

public class CbPersonalization extends Reco{
	public static void  CbPersonalizationsub(WebDriver d) throws InterruptedException, Exception
	{	
		try {
			d.findElement(By.linkText("Solutions")).click();
			Thread.sleep(3000);
			d.findElement(By.linkText("Content Based Personalization")).click();
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/button")).click();
			d.findElement(By.id("CarouselTitle")).sendKeys(CarouselTitleMP);
			d.findElement(By.id("ContentType")).sendKeys("TestMovie new");
			new Select(d.findElement(By.id("ContentType"))).selectByIndex(1);
		    d.findElement(By.id("StartDate")).click();
		   
		    
		    //month
		    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		    Thread.sleep(3000);
		   // d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    
		    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[8]")).click();
		    d.findElement(By.id("EndDate")).click();
		    //month
		    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		    d.findElement(By.id("EndDate")).click();  
		    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[6]/td[4]")).click();   
		    d.findElement(By.id("ActorWeightage")).sendKeys("3");
	    	d.findElement(By.id("GenreWeightage")).sendKeys("2");
	    	d.findElement(By.id("YearofReleaseWeightage")).sendKeys("110");
	    	d.findElement(By.id("LanguageWeightage")).sendKeys("120");
	    	new Select(d.findElement(By.id("Randomize"))).selectByIndex(2);
	        d.findElement(By.id("Batchsizeforshuffling")).sendKeys("20");
	        new Select(d.findElement(By.id("Removeseencontent"))).selectByIndex(2);
	        d.findElement(By.id("Reappearcriteriadays")).sendKeys("100");
	        
	        if(d.findElement(By.linkText("Cancel")).isDisplayed())
			{
				System.out.println("CbPersonalization cancle button is displayed");
				Reporter.log("CbPersonalization cancle button is displayed");
			}
	    	else {
	    		captureScreenshot(d);
	    		Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
	    		System.out.println("CbPersonalization cancle button is not displayed");
	    		Reporter.log("CbPersonalization cancle button is not displayed");
	    	}
			if(d.findElement(By.linkText("Save to List")).isDisplayed())
			{
				System.out.println("CbPersonalization Save to List button is displayed");
				Reporter.log("CbPersonalization Save to List button is displayed");
			}
			else {
				captureScreenshot(d);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("CbPersonalization Save to List button is not displayed");
				Reporter.log("CbPersonalization Save to List button is not displayed");
			}
			if(d.findElement(By.linkText("Save and Preview")).isDisplayed())
			{
				System.out.println("CbPersonalization Save and Preview button is displayed");
				Reporter.log("CbPersonalization Save and Preview button is displayed");
			}
			else {
				captureScreenshot(d);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("CbPersonalization Save and Preview button is not displayed");
				Reporter.log("CbPersonalization Save and Preview button is not displayed");
			}
			 d.findElement(By.linkText("Save to List")).click();	
	        System.out.println("Solutions page Content Based Personalization Pass");
	        Reporter.log("Solutions page Content Based Personalization Pass");
	        
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedPersonalization Fail");
			 Reporter.log("Solutions page Content Based Personalization Fail");
		}
	}
	
	public static void  unpublished(WebDriver d) throws InterruptedException, Exception
	{
		try {
			d.findElement(By.linkText("Content Based Personalization")).click();
			
			
			Reco.search(d).sendKeys(CarouselTitleMP);
			
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			
			WebDriverWait wait=new WebDriverWait(d,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
			//Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
			System.out.println("Solutionspage ContentBasedPersonalization unpublished Successful");
			 Reporter.log("Solutionspage ContentBased Personalization unpublished Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedPersonalization unpublished Failed");
			Reporter.log("Solutionspage ContentBased Personalization unpublished Fail");
	        
		}
		
	}
	public static void  published(WebDriver d) throws InterruptedException, Exception
	{
		try {
			d.findElement(By.linkText("Content Based Personalization")).click();
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			/*WebElement e1=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
			WebDriverWait wait=new WebDriverWait(d,30);
			wait.until(ExpectedConditions.visibilityOf(e1));*/
			Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
			System.out.println("Solutionspage ContentBasedPersonalization published Successful");
			Reporter.log("Solutionspage ContentBased Personalization published pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedPersonalization published Failed");
			Reporter.log("Solutionspage ContentBased Personalization published Fail");
		}
	}
	
	public static void  CBPersonalizationSearchTab(WebDriver d) throws InterruptedException, Exception
	{	
		try {
			//d.findElement(By.linkText("Solutions")).click();
			d.findElement(By.linkText("Content Based Personalization")).click();
			
			//search Bar
			d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
			d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
			/*WebElement e2=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i"));
			WebDriverWait wait=new WebDriverWait(d,30);
			wait.until(ExpectedConditions.visibilityOf(e2));*/
			Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")).click();
			Thread.sleep(5000);
			
			//close tab
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedPersonalizationSearchTab Successful");
			Reporter.log("Solutionspage ContentBased Personalization SearchTab Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedPersonalizationSearchTab Failed");
			Reporter.log("Solutionspage ContentBased Personalization SearchTab Failed");
		}
	}
		public static void  delete(WebDriver d) throws InterruptedException, Exception
		{
			try {
				d.findElement(By.linkText("Content Based Personalization")).click();
				Thread.sleep(5000);
				Reco.search(d).sendKeys(CarouselTitleMP);
				Reco.search(d).sendKeys(Keys.ENTER);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")).click();
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ENTER).build().perform();
				System.out.println("Solutionspage ContentBasedPersonalization content deleted");
				Reporter.log("Solutionspage ContentBased Personalization content deleted");
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage ContentBasedPersonalization content not deleted");
				Reporter.log("Solutionspage ContentBased Personalization content not deleted");
			}
	
	}
		public static void  edit(WebDriver d) throws InterruptedException, Exception
		{
			try {
				d.findElement(By.linkText("Content Based Personalization")).click();
				
				Thread.sleep(5000);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleMP);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				//Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/i")).click();
				Thread.sleep(9000);
				d.findElement(By.id("ActorWeightage")).clear();
				d.findElement(By.id("ActorWeightage")).sendKeys("5");
				d.findElement(By.id("GenreWeightage")).clear();
			    d.findElement(By.id("GenreWeightage")).sendKeys("6");
			   	d.findElement(By.id("YearofReleaseWeightage")).clear();
			   	d.findElement(By.id("YearofReleaseWeightage")).sendKeys("90");
			   	d.findElement(By.linkText("Save to List")).click();	
			   	System.out.println("Solutionspage ContentBasedPersonalization edit Pass");
				Reporter.log("Solutionspage ContentBased Personalization edit Pass");
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage ContentBasedPersonalization edit Fail");
				Reporter.log("Solutionspage ContentBased Personalization edit Fail");
			}
				
			}
		public static void  BlackListedContent(WebDriver d) throws InterruptedException, Exception
		{
			try {
				
				d.findElement(By.linkText("Content Based Personalization")).click();
				
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
					System.out.println("Solutionspage Content Based Personalization BlackListedContent pass");
					Reporter.log("Solutionspage Content Based Personalization BlackListedContent Pass");
				}
			
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(10000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage Content Based Personalization BlackListedContent Failed");
			Reporter.log("Solutionspage Content Based Personalization BlackListedContent Fail");
	        
		}
			
		}

}
