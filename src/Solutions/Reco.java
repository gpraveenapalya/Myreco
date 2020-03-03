package Solutions;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import utils.InputDetails;

public class Reco extends InputDetails{
	public static WebElement element=null;
	public static void login(WebDriver d) throws InterruptedException, Exception
	{
		try {
			//pre prodvalid user and valid password
			//d.findElement(By.id("user_name")).sendKeys(username);
			//d.findElement(By.id("password")).sendKeys(password);
			
			//prod user
			d.findElement(By.id("user_name")).sendKeys(username);
			d.findElement(By.id("password")).sendKeys(password);
			d.findElement(By.id("load")).click();
			Thread.sleep(5000);
			Reporter.log("Login Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("Login Failed");
			Reporter.log("Login Failed");
		}
		
	}
	public static void invalidlogin(WebDriver d) throws InterruptedException, Exception
	{
		try {
			//
				d.findElement(By.id("user_name")).sendKeys(invaliduser);
				d.findElement(By.id("password")).sendKeys(invalidpassword);
				d.findElement(By.id("load")).click();
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				Reporter.log("invalid login Pass");
				Thread.sleep(5000);
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("invalid login Failed");
			Reporter.log("invalid login Failed");
		}
		
		
	}
	
		public static void changepassword(WebDriver d) throws InterruptedException, Exception
		{
			try {
				 	d.findElement(By.id("dropdown-username")).click();
				 	/*WebElement e1=d.findElement(By.linkText("Change Passworde"));
					WebDriverWait wait=new WebDriverWait(d,30);
					wait.until(ExpectedConditions.visibilityOf(e1));*/
				 	Thread.sleep(5000);
					d.findElement(By.linkText("Change Password")).click();
					d.findElement(By.id("_userpassword")).sendKeys("Myplex@123");
					d.findElement(By.id("_usernew_password")).sendKeys("Myplex@123");
					d.findElement(By.id("_uconfirm_new_password")).sendKeys("Myplex@123");
					Thread.sleep(5000);
				if(d.findElement(By.cssSelector("button[class='btn btn-primary center-block _userChangePwdBtn'][type='submit']")).isDisplayed())
				{
					System.out.println("Change password succesful");
					Reporter.log("Change password Pass");
					// submit button
					//d.findElement(By.cssSelector("button[class='btn btn-primary center-block _userChangePwdBtn'][type='submit']")).click();
				}
			
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Change password Fail");	
				Reporter.log("Change password Fail");
			}
			
		}
	 
		public static void logout(WebDriver d) throws InterruptedException, Exception
		{
			try {
					d.findElement(By.id("dropdown-username")).click();
					d.findElement(By.xpath("/html/body/div[3]/div/div[1]/nav/nav/ul/div/div/div/div/ul/li/ul/li[1]/a")).click();
					System.out.println("Logout Pass");
					Reporter.log("logout Pass");
					Thread.sleep(5000);
					Actions action = new Actions(d);
					action.sendKeys(Keys.ESCAPE).build().perform();
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Logout Failed");
				Reporter.log("logout Failed");
			}
		
			
		}
		public static void Editproject(WebDriver d) throws InterruptedException, Exception
		{
			try {
					if(d.findElement(By.linkText("Open Project")).isDisplayed())
					{
						System.out.println("Open project displated");
						Reporter.log("Open project displated");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							System.out.println("Open project is not displated");
							Reporter.log("Open project is not displated");
						}
					d.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div/div/div/div[1]/div/button/div")).click();
					Thread.sleep(5000);
					if(d.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/button[1]")).isDisplayed()) 
					{
						System.out.println("Edit option is displated");
						Reporter.log("Edit option is displated");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							System.out.println("Edit option is not displated");
							Reporter.log("Edit option is not displated");
						}
					if(d.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/button[2]")).isDisplayed()) 
					{
						System.out.println("Delete option is displated");
						Reporter.log("Delete option is displated");
					}
					else {
							captureScreenshot(d);
							Thread.sleep(5000);
							System.out.println("Delete option is not displated");
							Reporter.log("Delete option is not displated");
						}
					
					d.findElement(By.linkText("Open Project")).click();
					Thread.sleep(5000);
					}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Edit project Failed");
				Reporter.log("Edit project Failed");
			}
			
			
		}
		public static void NavigateToMenu(WebDriver d) throws InterruptedException, Exception
		{
			try {
					d.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[1]/div[1]/a/span/span/strong/img")).click();
				if(d.findElement(By.linkText("Open Project")).isDisplayed())
					{
							System.out.println("NavigateToMenu  displated");
							Reporter.log("Navigate To Menu is displayed");
							d.findElement(By.linkText("Open Project")).click();
							Thread.sleep(5000);
							
					}
					}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Navigate To Menu Failed");
				Reporter.log("Navigate To Menu Failed");
			}
		}
		
		public static void Tenant(WebDriver d) throws InterruptedException, Exception
		{
			try {
				
				//
				d.findElement(By.id("user_name")).sendKeys(Tenantuserid);
				d.findElement(By.id("password")).sendKeys(Tenantpassword);
				d.findElement(By.id("load")).click();
				Thread.sleep(5000);
				System.out.println("Tenant login Pass");
				Reporter.log("Tenant login Pass");
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Tenant login Failed");
				Reporter.log("Tenant login Failed");
			}
			
			
		}
		public static void Tenantinvalid(WebDriver d) throws InterruptedException, Exception
		{
			try {
				//invalid user and valid password
				d.findElement(By.id("user_name")).sendKeys(invalidTenantuser);
				d.findElement(By.id("password")).sendKeys(validpassword);
				d.findElement(By.id("load")).click();
				System.out.println("Tenant user with invaliduser and valid pass login Failed Pass");
				Reporter.log("Tenant user with invaliduser and valid pass login Failed Pass");
				Thread.sleep(5000);
				Actions action = new Actions(d);
				action.sendKeys(Keys.ESCAPE).build().perform();
				
				//valid user and invalid password
				d.findElement(By.id("user_name")).sendKeys(validuser);
				d.findElement(By.id("password")).sendKeys(invalidTenantpassword);
				d.findElement(By.id("load")).click();
				Thread.sleep(5000);
				System.out.println("Tenant user with validuser and invalid password login Failed Pass");
				Reporter.log("Tenant user with validuser and valid password login Failed Pass");
				
				action.sendKeys(Keys.ESCAPE).build().perform();
				
				//invalid user and invalid password
				d.findElement(By.id("user_name")).sendKeys(invalidTenantuser);
				d.findElement(By.id("password")).sendKeys(invalidTenantpassword);
				d.findElement(By.id("load")).click();
				Thread.sleep(5000);
				System.out.println("Tenant user with invalid user and invalid password login Failed Pass");
				Reporter.log("Tenant user with invalid user and invalid password login Failed Pass");
				action.sendKeys(Keys.ESCAPE).build().perform();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Tenant invalid login Scenario Failed");
				Reporter.log("Tenant invalid login Scenario Failed");
			}
		}
		public static  WebElement search(WebDriver d) {
			element=d.findElement(By.id("carouselSearchTerm"));
					return element;	
		}
		
}
