package Tenant;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class Properties extends InputDetails{
	public static void createProperties(WebDriver d) throws Exception
	{	
		try {
			//create
			d.findElement(By.linkText("Properties")).click();
			 Thread.sleep(3000);
			 d.findElement(By.cssSelector("button[type='button'][class='btn btn-primary create-carousel']")).click();
			 Thread.sleep(3000);
			 if(d.findElement(By.id("_cpropertyType")).isDisplayed()) {
			 new Select(d.findElement(By.id("_cpropertyType"))).selectByIndex(2);
			 new Select(d.findElement(By.id("_cconfigBy"))).selectByIndex(2);
			 new Select(d.findElement(By.id("_ccategoryType"))).selectByIndex(2);
			 new Select(d.findElement(By.id("_cclassificationId"))).selectByIndex(2);
			 new Select(d.findElement(By.id("_cmultiValue"))).selectByIndex(2);
			 
			 d.findElement(By.id("_cpropertyName")).sendKeys(PropertiesName);
			 d.findElement(By.id("_cpropertyDesc")).sendKeys(propertyDesc); 
			 d.findElement(By.cssSelector("input[type='checkbox'][value='IndividualPersonalization']")).click();
			 d.findElement(By.cssSelector("input[type='checkbox'][value='SimilarContents']")).click();
			 d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary _cPropertyButton']")).click();
			 System.out.println("Properties create Successful");
			 Reporter.log("Properties create Pass");
			 }
			 Thread.sleep(5000);
			 //Drop down
			if(d.findElement(By.id("entityTypeFilters")).isDisplayed()) 
			{
				 
				WebElement element = d.findElement(By.id("entityTypeFilters"));
				Select select = new Select(element);
				List<WebElement> list = select.getOptions();
				for(int i=0; i<list.size(); i++)        
				    {
				        System.out.println(list.get(i).getText()+ "drop down is Dispalyed");
				        Reporter.log(list.get(i).getText()+ "drop down is Dispalyed");
				    }
				
				new Select(d.findElement(By.id("entityTypeFilters"))).selectByIndex(2);
			}
			else
			{
				 captureScreenshot(d);
				 Thread.sleep(5000);
				 System.out.println("Drops down not found Fail");
				 Reporter.log("Drops down not found Fail");
			}

	}
	catch(Exception e)
	{
		 captureScreenshot(d);
		 Thread.sleep(5000);
		 System.out.println("Properties create Fail");
		 Reporter.log("Properties create Fail");
	}
	}
		public static void EditProperties(WebDriver d) throws Exception
		{	
			try {
				//search
				if( d.findElement(By.id("searchPropertyTerm")).isDisplayed())
				{
				 d.findElement(By.id("searchPropertyTerm")).sendKeys(PropertiesName);
				 d.findElement(By.id("searchPropertyTerm")).sendKeys(Keys.ENTER);
				 Thread.sleep(5000); 
				 System.out.println("Properties Search Pass");
			     Reporter.log("Properties Search Pass");
				}
				else
				{
					captureScreenshot(d);
					Thread.sleep(5000);
					System.out.println("Properties Search Fail");
				    Reporter.log("Properties Search Fail");
				}
				 //edit button
				 d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[8]/a/i")).click();
				 Thread.sleep(5000);
				 d.findElement(By.id("_upropertyName")).clear();
				 d.findElement(By.id("_upropertyName")).sendKeys(PropertiesName);
				 d.findElement(By.id("_upropertyDesc")).clear();
				 d.findElement(By.id("_upropertyDesc")).sendKeys(updatepropertyDesc);
				 Thread.sleep(5000);
				 //submit button
				 d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary _uPropertyButton']")).click();
				 Thread.sleep(5000);
				 System.out.println("Properties updated Pass");
			     Reporter.log("Properties updated Pass");
			     
			}
		
		catch(Exception e)
		{
			 captureScreenshot(d);
			 Thread.sleep(5000);
			 System.out.println("Properties updated Fail");
			 Reporter.log("Properties updated Fail");
		}
		}
		
		public static void Value(WebDriver d) throws Exception
		{	
			try {
				//select value
				d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[7]/a/i")).click();
				Thread.sleep(5000);
				 d.findElement(By.name("metaPropVal")).sendKeys(defaultValueadd);
				 d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary addremovebtn']")).click();
				 Thread.sleep(5000);
				 System.out.println("Properties Value added Pass");
			     Reporter.log("Properties Value added Pass");
			     
			     //add value
			     if(d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[6]/a/i")).isDisplayed())
			     {
			    	 d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[6]/a/i")).click();
			    	 Thread.sleep(5000);
			    	 d.findElement(By.id("selectAll")).click();
			    	 System.out.println("Value selected Pass");
				     Reporter.log("Value selected Pass");
			     }
			     else
			     {
			    	 captureScreenshot(d);
					 Thread.sleep(5000);
			    	 System.out.println("Value selection Fail");
				     Reporter.log("Value selection Fail");
			     }
			     
			     //delete value
			     if(d.findElement(By.xpath("//*[@id=\"assignMetaPropertiesModal\"]/div/div/div[2]/div[1]/div/div/div[3]/a")).isDisplayed())
			     {
			    	 d.findElement(By.id("searchPropertyTerm")).sendKeys(PropertiesName);
					 d.findElement(By.id("searchPropertyTerm")).sendKeys(Keys.ENTER);
					 Thread.sleep(5000); 
					 d.findElement(By.xpath("//*[@id=\"assignMetaPropertiesModal\"]/div/div/div[2]/div[1]/div/div/div[3]/a")).click();
			    	 System.out.println("Value delete button is visible Pass");
				     Reporter.log("Value delete button is visible Pass");
			     }
			     else
			     {
			    	 captureScreenshot(d);
					 Thread.sleep(5000);
			    	 System.out.println("Value delete button is visible Fail");
				     Reporter.log("Value delete button is visible Fail");
			     }
			     d.findElement(By.cssSelector("button[type='button'][class='btn btn-primary update-buttton']")).click();
			   
			     
			}
		
		catch(Exception e)
		{
			 captureScreenshot(d);
			 Thread.sleep(5000);
			 System.out.println("Properties Value added Fail");
			 Reporter.log("Properties Value added Fail");
		}		 
		}
}
