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

public class CBRecommendations extends InputDetails {

	public static void  CbRecommendationssub(WebDriver d) throws InterruptedException, Exception
	{
		try {
				
				d.findElement(By.linkText("Analytics")).click();
				Thread.sleep(5000);
				//Solution page 
				d.findElement(By.linkText("Solutions")).click();
				Thread.sleep(3000);
				
				//Content Based Recommendations button
				d.findElement(By.linkText("Content Based Recommendations")).click();
				Thread.sleep(5000);
				
				//create Carousel
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/button")).click();
				d.findElement(By.id("CarouselTitle")).sendKeys(CarouselTitleCBR);
				new Select(d.findElement(By.id("ContentType"))).selectByIndex(1);
			    
			    //select Start date
			    d.findElement(By.id("StartDate")).click();
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click();
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[4]/td[2]")).click();	    
			    
			    //Select end date
			    d.findElement(By.id("EndDate")).click();
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[6]/td[3]")).click();
			    
			    // click check box
			    d.findElement(By.id("TestingCheckBox")).click();
			    
			    // check box
			    if(d.findElement(By.id("TestingCheckBox")).isSelected()) {
			    	d.findElement(By.id("ActorWeightage")).sendKeys("3");
			    	d.findElement(By.id("GenreWeightage")).sendKeys("2");
			    	d.findElement(By.id("YearofReleaseWeightage")).sendKeys("110");
			    	d.findElement(By.id("LanguageWeightage")).sendKeys("120");
			    	new Select(d.findElement(By.id("Randomize"))).selectByIndex(2);
			        d.findElement(By.id("Batchsizeforshuffling")).sendKeys("20");
			        new Select(d.findElement(By.id("Removeseencontent"))).selectByIndex(2);
			        d.findElement(By.id("Reappearcriteriadays")).sendKeys("100");
			        Thread.sleep(3000);
			        //JavascriptExecutor js = (JavascriptExecutor) d;
			        //js.executeScript("window.scrollBy(28,102)");
			        
			        //select next check box
			        d.findElement(By.linkText("Variant B")).click();
			        Thread.sleep(3000);
			        d.findElement(By.id("variant2_ActorWeightage")).sendKeys("3");
			    	d.findElement(By.id("variant2_GenreWeightage")).sendKeys("2");
			    	d.findElement(By.id("variant2_YearofReleaseWeightage")).sendKeys("110");
			    	d.findElement(By.id("variant2_LanguageWeightage")).sendKeys("120");
			    	new Select(d.findElement(By.id("variant2_Randomize"))).selectByIndex(2);
			        d.findElement(By.id("variant2_Batchsizeforshuffling")).sendKeys("20");
			        new Select(d.findElement(By.id("variant2_Removeseencontent"))).selectByIndex(2);
			        d.findElement(By.id("variant2_Reappearcriteriadays")).sendKeys("100");
			        
			        //cancel button
			        if(d.findElement(By.linkText("Cancel")).isDisplayed())
					{
						System.out.println("CbRecommendations cancle button is displayed");
						Reporter.log("CbRecommendations cancle button is displayed");
					}
			    	else {
				    		captureScreenshot(d);
							Thread.sleep(5000);
				    		Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
				    		System.out.println("CbRecommendations cancle button is not displayed");
				    		Reporter.log("CbRecommendations cancle button is not displayed");
			    	}
			        
			        //save and list button
					if(d.findElement(By.linkText("Save to List")).isDisplayed())
					{
						System.out.println("CbRecommendations Save to List button is displayed");
						Reporter.log("CbRecommendations Save to List button is displated");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
							System.out.println("CbRecommendations Save to List button is not displayed");
							Reporter.log("CbRecommendations Save to List button is not displayed");
					}
					
					//save and preview button
					if(d.findElement(By.linkText("Save and Preview")).isDisplayed())
					{
						System.out.println("CbRecommendations Save and Preview button is displayed");
						Reporter.log("CbRecommendations Save and Preview button is displayed");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
							System.out.println("CbRecommendations Save and Preview button is not displayed");
							Reporter.log("CbRecommendations Save and Preview button is not displayed");
					}
			        
			    }
			    
			    // check box not selected
			    else if(!d.findElement(By.id("TestingCheckBox")).isSelected()) {
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
						System.out.println("CbRecommendations cancle button is displayed");
						Reporter.log("CbRecommendations cancle button is displayed");
					}
			    	else {
				    		captureScreenshot(d);
							Thread.sleep(5000);
				    		Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
				    		System.out.println("CbRecommendations cancle button is not displayed");
				    		Reporter.log("CbRecommendations cancle button is not displayed");
			    	}
					if(d.findElement(By.linkText("Save to List")).isDisplayed())
					{
						System.out.println("CbRecommendations Save to List button is displayed");
						Reporter.log("CbRecommendations Save to List button is displayed");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
							System.out.println("CbRecommendations Save to List button is not displayed");
							Reporter.log("CbRecommendations Save to List button is not displayed");
					}
					if(d.findElement(By.linkText("Save and Preview")).isDisplayed())
					{
						
						System.out.println("CbRecommendations Save and Preview button is displayed");
						Reporter.log("CbRecommendations Save and Preview button is displayed");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							
							Actions action = new Actions(d);
							action.sendKeys(Keys.ESCAPE).build().perform();
							System.out.println("CbRecommendations Save and Preview button is not displayed");
							Reporter.log("CbRecommendations Save and Preview button is not displayed");
					}
			        
			    }
			    
			    	//Submit button
					d.findElement(By.linkText("Save and Preview")).click();
					Thread.sleep(5000);
					Actions action = new Actions(d);
					action.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Solutionspage ContentBased Recommendations Successful");
					Reporter.log("Solutionspage ContentBased Recommendations Pass");
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage ContentBased Recommendations Failed");
				Reporter.log("Solutionspage ContentBased Recommendations Fail");
			}

    }
	public static void  CbRecommendationsSearchTab(WebDriver d) throws InterruptedException, Exception
	{
		try {
				
				//d.findElement(By.linkText("Solutions")).click();
			
				//Content Based Recommendations page
				d.findElement(By.linkText("Content Based Recommendations")).click();
				Thread.sleep(5000);
				
				// search bar
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleCBR);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				//WebDriverWait wait=new WebDriverWait(d,30);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")));
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[11]/i")).click();
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[7]/div/button")));
				Thread.sleep(5000);
				WebElement select=d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
				Actions action = new Actions(d);
				action.moveToElement(select).click().build().perform();
				//action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Solutionspage ContentBasedRecommendationsSearch Successful");
				Reporter.log("Solutionspage ContentBased Recommendations Search Pass");
				Reporter.log("Solutionspage ContentBased Recommendations Deleted Pass");
			
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedRecommendationsSearch Failed");
			Reporter.log("Solutionspage ContentBased Recommendations Search Fail");
			Reporter.log("Solutionspage ContentBased Recommendations Deleted Fail");
		}

	}
	public static void  unpublished(WebDriver d) throws InterruptedException, Exception
	{
		try {
				//Content Based Recommendations page
				d.findElement(By.linkText("Content Based Recommendations")).click();
				
				//search bar
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleCBR);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				//Thread.sleep(5000);
				//WebElement e1=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
				WebDriverWait wait=new WebDriverWait(d,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
				
				// submit button
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
				System.out.println("Solutionspage ContentBasedRecommendations unpublished Successful");
				Reporter.log("Solutionspage ContentBased Recommendations unpublished Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedRecommendations unpublished Failed");
			Reporter.log("Solutionspage ContentBased Recommendations unpublished Fail");
		}
		
	}
	public static void  published(WebDriver d) throws InterruptedException, Exception
	{
		try {
				// Content Based Recommendations page
				d.findElement(By.linkText("Content Based Recommendations")).click();
				
				//search bar
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleCBR);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				//Thread.sleep(5000);
				//WebElement e2=d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button"));
				WebDriverWait wait=new WebDriverWait(d,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")));
				//Thread.sleep(5000);
				
				//publish button
				d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
				System.out.println("Solutionspage ContentBasedRecommendations published Successful");
				Reporter.log("Solutionspage ContentBased Recommendations published Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Solutionspage ContentBasedRecommendations published Failed");
			Reporter.log("Solutionspage ContentBased Recommendations published Fail");
	        
		}
	}
	public static void  edit(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Content Based Recommendations")).click();
				Thread.sleep(5000);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleCBR);
				//d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				
				//edit button
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/i")).click();
				Thread.sleep(5000);
				d.findElement(By.id("ActorWeightage")).clear();
				d.findElement(By.id("ActorWeightage")).sendKeys("5");
				d.findElement(By.id("GenreWeightage")).clear();
		    	d.findElement(By.id("GenreWeightage")).sendKeys("8");
		    	d.findElement(By.id("YearofReleaseWeightage")).clear();
		    	d.findElement(By.id("YearofReleaseWeightage")).sendKeys("80");
		    	
		    	// click save to list
		    	d.findElement(By.linkText("Save to List")).click();
		    	System.out.println("Solutionspage ContentBasedRecommendations edited pass");
				Reporter.log("Solutionspage ContentBased Recommendations edited Pass");
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(5000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Solutionspage ContentBasedRecommendations edited Failed");
		Reporter.log("Solutionspage ContentBased Recommendations edited Fail");
        
	}
	}
	public static void  BlackListedContent(WebDriver d) throws InterruptedException, Exception
	{
		try {
				d.findElement(By.linkText("Content Based Recommendations")).click();
				
				// search bar
				d.findElement(By.id("carouselSearchTerm")).sendKeys(CarouselTitleCBR);
				d.findElement(By.id("carouselSearchTerm")).sendKeys(Keys.ENTER);
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
					System.out.println("Solutionspage ContentBasedRecommendations BlackListedContent pass");
					Reporter.log("Solutionspage ContentBased Recommendations BlackListedContent Pass");
				}
		
		
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(10000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Solutionspage ContentBasedRecommendations BlackListedContent Failed");
		Reporter.log("Solutionspage ContentBased Recommendations BlackListedContent Fail");
        
	}
		
	}
}
