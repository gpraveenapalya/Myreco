package ContentManagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import utils.InputDetails;

public class MetaEnrichment extends InputDetails {
	public static void Metaenrichment(WebDriver d) throws InterruptedException, IOException
	{
		try {
			d.findElement(By.linkText("Content Management")).click();
			Thread.sleep(3000);
			d.findElement(By.linkText("Meta Enrichment")).click();
			
			d.findElement(By.id("_contentSearchTerm")).sendKeys("hindi");
			d.findElement(By.id("_contentSearchTerm")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[10]/a/i")).click();
			Thread.sleep(3000);
			d.findElement(By.id("_enrichedGenre")).clear();
			d.findElement(By.id("_enrichedGenre")).sendKeys("Kids");
			d.findElement(By.id("_enrichedCast")).clear();
			d.findElement(By.id("_enrichedCast")).sendKeys("Hi");
			d.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div/div[2]/div/div[2]/div/button")).click();
			System.out.println("Meta Enrichment Content Meta data search & upated Pass");
		
			Reporter.log("Meta Enrichment Content Meta data search & upated Pass");
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(5000);
		System.out.println("Meta Enrichment Content Meta data search & upated Fail");
		Reporter.log("Meta Enrichment Content Meta data search & upated Fail");
        
	}
	}
	public static void filters(WebDriver d) throws Exception
	{
		try {
			d.findElement(By.linkText("Meta Enrichment")).click();
			Thread.sleep(15000);
			d.findElement(By.linkText("Genre")).click();
			d.findElement(By.cssSelector("input[id='genreFilter'][value='Action']")).click();
			d.findElement(By.cssSelector("input[id='genreFilter'][value='Horror']")).click();
			d.findElement(By.cssSelector("input[id='genreFilter'][value='Comedy']")).click();
			//d.findElement(By.cssSelector("input[id='genreFilter'][value='Drama']")).click();
			//d.findElement(By.cssSelector("input[id='genreFilter'][value='Family']")).click();
			//d.findElement(By.cssSelector("input[id='genreFilter'][value='Romance']")).click();
			//d.findElement(By.cssSelector("input[id='genreFilter'][value='Thriller']")).click();
			//language
			d.findElement(By.linkText("Language")).click();
			d.findElement(By.cssSelector("input[id='languageFilter'][value='Hindi']")).click();
			//d.findElement(By.cssSelector("input[id='languageFilter'][value='Telugu']")).click();
			//d.findElement(By.cssSelector("input[id='languageFilter'][value='English']")).click();
			//Content Type
			d.findElement(By.linkText("Content Type")).click();
			d.findElement(By.cssSelector("input[id='contentTypeFilter'][value='live']")).click();
			d.findElement(By.cssSelector("input[id='contentTypeFilter'][value='Movie']")).click();
			d.findElement(By.cssSelector("input[id='contentTypeFilter'][value='TV Series']")).click();
			//Rating
			/*d.findElement(By.linkText("Rating")).click();
			d.findElement(By.cssSelector("input[id='ratingsFilter'][value='Thriller']")).click();
			d.findElement(By.cssSelector("button[id='ratingsFilter'][value='0']")).click();
			d.findElement(By.cssSelector("input[id='ratingsFilter'][value='3.0']")).click();
			d.findElement(By.cssSelector("input[id='ratingsFilter'][value='3.5']")).click();
			d.findElement(By.cssSelector("input[id='ratingsFilter'][value='4.0']")).click();
			d.findElement(By.cssSelector("input[id='ratingsFilter'][value='4.5']")).click();*/
			//Year of Release
			d.findElement(By.linkText("Year of Release")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='2011-2019']")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='2001-2010']")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='1991-2000']")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='1981-1990']")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='1971-1980']")).click();
			d.findElement(By.cssSelector("input[id='yearOfReleaseFilter'][value='1961-1970']")).click();
			//Publish dates
			d.findElement(By.linkText("Publish Status")).click();
			d.findElement(By.cssSelector("input[id='publishStatusFilter'][value='published']")).click();
			d.findElement(By.cssSelector("input[id='publishStatusFilter'][value='unPublished']")).click();
			// submit
			d.findElement(By.cssSelector("button[id='_metaEnrichFilterSubmit'][type='button']")).click();
			System.out.println("Meta Enrichment Content Meta data filters applyed Pass");
			Reporter.log("Meta Enrichment Content Meta data filters applyed Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("Meta Enrichment Content Meta data filters applyed Fail");
			Reporter.log("Meta Enrichment Content Meta data filters applyed Fail"); 
	        
		}
		
	}
}
