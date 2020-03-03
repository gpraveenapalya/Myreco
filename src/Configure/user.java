package Configure;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class user extends InputDetails{
	public static void creatuser(WebDriver d) throws InterruptedException, Exception
	{
		try {
			//WebDriverWait wait=new WebDriverWait(d,30);
			d.findElement(By.linkText("Configure")).click();
			Thread.sleep(5000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Users")));
			d.findElement(By.linkText("Users")).click();
			System.out.println("Configure button is Displayed");
			
			Thread.sleep(5000);

			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/button")).click();
			/*Select  drp1= new Select(d.findElement(By.id("_cUserTenantName")));
		    //drp1.selectByIndex(0);
		    
		    Select  drp3= new Select(d.findElement(By.id("_cProject")));
		    drp3.selectByIndex(0);*/
			Thread.sleep(7000);
			new Select(d.findElement(By.id("_croleType"))).selectByIndex(1);
			Thread.sleep(3000);
			d.findElement(By.id("_cuserName")).sendKeys(searchUserTerm);
			d.findElement(By.id("_cPassword")).sendKeys(userpassword);
			d.findElement(By.id("_cConfirmPassword")).sendKeys(userpassword);
			d.findElement(By.id("_cContactNumber")).sendKeys(Mobile);
			d.findElement(By.id("_cfirstName")).sendKeys(FirstName);
			d.findElement(By.id("_clastName")).sendKeys(LastName);
			Thread.sleep(3000);
			if(d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary _cuserButton']")).isDisplayed()) 
			{
				System.out.println("user create submit button is visible Pass");
				Reporter.log("user create submit button is visible Pass");
				//submit button
				d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary _cuserButton']")).click();
			}
			else 
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("user create submit button is visible Fail");
				Reporter.log("user create submit button is visible Fail");
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
			}
			
			//d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary _cuserButton']")).click();
			
			Thread.sleep(5000);
			System.out.println("user create button is Displayed");
			Reporter.log("user create button is Displayed Pass");
			System.out.println("user created  Pass");
			Reporter.log("user created  Pass");
		
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("user create button is not Displayed");
			System.out.println("creatuser Failed");
			Reporter.log("user create button is not Displayed Fail");
			Reporter.log("creat user Failed");
			System.out.println("Configure button is not Displayed");
			Reporter.log("Configure button is not Displayed Fail");
		}
		
	}
	public static void usersearch(WebDriver d) throws InterruptedException, Exception
	{
		try {
		d.findElement(By.id("searchUserTerm")).sendKeys(searchUserTerm);
		d.findElement(By.id("searchUserTerm")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
			if(d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/a/i")).isDisplayed())
			{
			System.out.println("Edit Option is Displayed");
			Reporter.log("Edit Option is Displayed Pass");
			d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/a/i")).click(); 
			}
			else 
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Edit Option is not Displayed");
				Reporter.log("Edit Option is not Displayed Fail");
			}
			Thread.sleep(3000);
		d.findElement(By.id("_uContactNumber")).clear();
		Thread.sleep(3000);
		d.findElement(By.id("_uContactNumber")).sendKeys("9876543212");
		Thread.sleep(5000);	
		if(d.findElement(By.xpath("//*[@id=\"user_updation_form\"]/div[2]/button")).isDisplayed())
		{
		d.findElement(By.xpath("//*[@id=\"user_updation_form\"]/div[2]/button")).click();
			/*Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();*/
			System.out.println("Update button is Displayed");
			Reporter.log("Update button is Displayed Pass");
		}
		else 
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Update button is not Displayed");
			Reporter.log("Update button is not Displayed Fail");
		}
		Thread.sleep(5000);
	
		d.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/i")).click();
			if(d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button")).isDisplayed())
			{
			System.out.println("Delete button is Displayed");
			Reporter.log("Delete button is Displayed Pass");
			}
			else 
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Delete button is not Displayed");
				Reporter.log("Delete button is not Displayed Pass");
			}
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			Thread.sleep(5000);
			System.out.println("user Search Pass ");
			Reporter.log("user Search Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("user Search Fail ");
			Reporter.log("user Search Fail");
		}
		}
		
	public static void Deleteuser(WebDriver d) throws InterruptedException, Exception
	{
		try {
		d.findElement(By.id("searchUserTerm")).sendKeys(searchUserTerm);
		d.findElement(By.id("searchUserTerm")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//delete button
		if(d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/i")).isDisplayed())
		{
			d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/i")).click();
		
			System.out.println("user Deleted Pass ");
			Reporter.log("user Deleted Pass");
		}
		else
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			Actions action = new Actions(d);
			action.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("user Deleted Fail ");
			Reporter.log("user Deleted Fail");
		}
	}
	catch(Exception e)
	{
		captureScreenshot(d);
		Thread.sleep(5000);
		Actions action = new Actions(d);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("user Search Fail ");
		Reporter.log("user Search Fail");
	}
}
	
		
}
