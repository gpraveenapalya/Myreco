package Solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class ABTesting  extends InputDetails{
	
		public static void Coldstart(WebDriver d) throws Exception
		{	
			try {
				Actions action = new Actions(d);
				d.findElement(By.linkText("Analytics")).click();
				Thread.sleep(5000);
				d.findElement(By.linkText("Solutions")).click();
				Thread.sleep(5000);
				d.findElement(By.linkText("Individual Personalization")).click();
				Thread.sleep(5000);
				d.findElement(By.cssSelector("button[type='button'][class='btn btn-primary create-carousel']")).click();
				Thread.sleep(5000);
				new Select(d.findElement(By.id("ContentType"))).selectByVisibleText("Movie");
				 
				d.findElement(By.id("StartDate")).click();
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		    	d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[4]/td[2]")).click();
				   
			    d.findElement(By.id("EndDate")).click();
				   //next
		        d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
				   //date
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[5]")).click();	
			    d.findElement(By.id("CarouselTitle")).sendKeys(AbTesting);
			    
			    //A/B Testing
			    d.findElement(By.id("TestingCheckBox")).click();
			    Thread.sleep(5000);
			   
			    // Coldstart
			    d.findElement(By.cssSelector("input[id='recommendationType'][value='coldstart']")).click();
			    //Proceed to Customize
			   
			  
			
			  
			    
				//action.sendKeys(Keys.ESCAPE).build().perform();
				 Thread.sleep(5000);
			    d.findElement(By.linkText("Save and Preview")).click();
			    Thread.sleep(5000);
			    d.findElement(By.id("previewUserId")).sendKeys("11");
			    Thread.sleep(5000);
			    d.findElement(By.xpath("//*[@id=\"carouselPreviewModel\"]/div/div/div[2]/div[3]/button")).click();
			    Thread.sleep(15000);
			   
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("A/B Testing Created Successful");
				Reporter.log("A/B Testing Created Successful");
				
			   
			}
			catch(Exception e)
			{
				System.out.println("A/B Testing Creation Failed");
				Reporter.log("A/B Testing Creation Failed");
			}
		}
		public static void curated(WebDriver d) throws Exception
		{	
			try {
				Actions action = new Actions(d);
				d.findElement(By.linkText("Analytics")).click();
				Thread.sleep(5000);
				d.findElement(By.linkText("Solutions")).click();
				Thread.sleep(5000);
				d.findElement(By.linkText("Individual Personalization")).click();
				Thread.sleep(5000);
				d.findElement(By.cssSelector("button[type='button'][class='btn btn-primary create-carousel']")).click();
				Thread.sleep(5000);
				new Select(d.findElement(By.id("ContentType"))).selectByVisibleText("Movie");
				
				d.findElement(By.id("StartDate")).click();
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
		    	d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[4]/td[2]")).click();
				   
			    d.findElement(By.id("EndDate")).click();
				   //next
		        d.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[4]")).click(); 
				   //date
			    d.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[5]")).click();	
			    d.findElement(By.id("CarouselTitle")).sendKeys(AbTesting);
			    
			    //A/B Testing
			    d.findElement(By.id("TestingCheckBox")).click();
			    Thread.sleep(5000);
			    // Curated
			    d.findElement(By.cssSelector("input[id='recommendationType'][value='curated']")).click();
			    
			    
			    
			    
			    
			    if( d.findElement(By.id("_curatedContentNameSearch20")).isDisplayed())
			    {
			    	System.out.println("A/B Testing Minimum 20 Content are Visible");
					Reporter.log("A/B Testing Minimum 20 Content are Visible");
			    }
			    else
			    {
			    	System.out.println("A/B Testing Minimum 20 Content are not Visible");
					Reporter.log("A/B Testing Minimum 20 Content are not Visible");
			    }
			  
			    d.findElement(By.linkText("Save Promotions")).click();
			    Thread.sleep(5000);
			    Thread.sleep(5000);
			    d.findElement(By.linkText("Save and Preview")).click();
			    Thread.sleep(5000);
			    d.findElement(By.id("previewUserId")).sendKeys("11");
			    Thread.sleep(5000);
			    d.findElement(By.xpath("//*[@id=\"carouselPreviewModel\"]/div/div/div[2]/div[3]/button")).click();
			    Thread.sleep(15000);
			   
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("A/B Testing Created Successful");
				Reporter.log("A/B Testing Created Successful");
			}
			catch(Exception e)
			{
				System.out.println("A/B Testing Creation Failed");
				Reporter.log("A/B Testing Creation Failed");
			}
			}
}