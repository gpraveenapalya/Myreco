package Tenant;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import utils.InputDetails;

public class Tenantuser extends InputDetails{
	
public static WebElement select;

	public static void TenantManagementSystem(WebDriver d) throws Exception
	{	
		d.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div/button")).click();
		Thread.sleep(5000);
	}
	
	public static void Tenantuser(WebDriver d) throws Exception
	{	
		try {
			//create Tenant
			 d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/div/button")).click();
			 Thread.sleep(5000);
			 d.findElement(By.id("_cTenantName")).sendKeys(TenantName);
			 d.findElement(By.id("_cTenantPrimaryContactName")).sendKeys(ContactName);
			 d.findElement(By.id("_cTenantPrimaryContactEmail")).sendKeys(ContactEmail);
			 d.findElement(By.id("_cTenantPassword")).sendKeys(NewPassword);
			 d.findElement(By.id("_cTenantConfirmPassword")).sendKeys(NewPassword);
			 d.findElement(By.id("_cTenantPrimaryContactNumber")).sendKeys(ContactNumber);
			 Thread.sleep(5000);
			 d.findElement(By.id("_cTenantDescription")).sendKeys(propertyDesc);
			 
			 //start date
			 d.findElement(By.id("_cTenantStartDate")).click();
			 d.findElement(By.xpath("/html/body/div[5]/div[1]/table/tfoot/tr[1]/th")).click();
			 //end date
			 d.findElement(By.id("_cTenantEndDate")).click();
			 //next button
			 d.findElement(By.cssSelector("th[class='next'][style='visibility: visible;']")).click();
			
			 d.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[4]")).click();
			 Thread.sleep(5000);
			 //submit button
			 d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary TenantButtonCreate']")).click();
		
			 System.out.println("Tenant user creation Successful");
			 Reporter.log("Tenant user creation Pass");
			}
		catch(Exception e)
			{
				captureScreenshot(d);
				Thread.sleep(5000);
				System.out.println("Tenant user creation Failed");
				Reporter.log("Tenant user creation Failed");
			}
}
	public static void Tenantsearch(WebDriver d) throws Exception
				{	
				try {
						d.findElement(By.id("tenantSearchTerm")).sendKeys(TenantName);
						d.findElement(By.id("tenantSearchTerm")).sendKeys(Keys.ENTER);
						Thread.sleep(5000);
						d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[8]/a/i")).click();
						Thread.sleep(5000);
						if(d.findElement(By.id("_uTenantName")).isDisplayed()) 
						{
							
							d.findElement(By.id("_uTenantName")).clear();
							d.findElement(By.id("_uTenantName")).sendKeys(changeName);
							d.findElement(By.id("_uTenantDescription")).clear();
							d.findElement(By.id("_uTenantDescription")).sendKeys(discription);
							//start
							d.findElement(By.id("_uTenantStartDate")).click();
							d.findElement(By.cssSelector("th[colspan='8'][class='today']")).click();
							//end
							//d.findElement(By.id("_uTenantEndDate")).click();
							//d.findElement(By.xpath("th[class='next'][style='visibility: visible']")).click();
							//d.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[3]")).click();
							//submit
							d.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary tenantButtonUpdate _cStudiopl']")).click();
							
							System.out.println("Tenant edit Successful");
							Reporter.log("Tenant edit Pass");
						}
						else {
							System.out.println("Tenant edit Fail");
							Reporter.log("Tenant edit Fail");
						}
					
						 System.out.println("Tenant search Successful");
						 Reporter.log("Tenant search Pass");
					}
				catch(Exception e)
					{
						captureScreenshot(d);
						Thread.sleep(5000);
						System.out.println("Tenant search Failed");
						Reporter.log("Tenant search Failed");
					}
				}
	public static void Tenantdelete(WebDriver d) throws Exception
				{	
					try {
						d.findElement(By.id("tenantSearchTerm")).sendKeys(TenantName);
						d.findElement(By.id("tenantSearchTerm")).sendKeys(Keys.ENTER);
						Thread.sleep(5000);
						//delete button
						d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/i")).click();
						Thread.sleep(5000);
						if(d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button")).isDisplayed())
						{
							WebElement select=d.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
							// click delete
							 Actions action = new Actions(d);
							action.moveToElement(select).click().build().perform();
							System.out.println("Tenant deleted button is visible");
							Reporter.log("Tenant user deleted button is visible");
							Thread.sleep(5000); 
							if(d.findElement(By.cssSelector("button[class='confirm'][tabindex='1']")).isDisplayed())
							{
								
								action.sendKeys(Keys.ESCAPE).build().perform();
								System.out.println("Tenant user not deleted ");
								Reporter.log("Tenant user not deleted");
							}
							else
							{
								captureScreenshot(d);
								Thread.sleep(5000);
								System.out.println("Tenant user deleted ");
								Reporter.log("Tenant user deleted");
							}
						}
						if(d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tfoot/tr/td/ul/li[4]/a")).isDisplayed())
						{
							d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tfoot/tr/td/ul/li[4]/a")).click();
							System.out.println("In Tenant page next page is selected pass");
							Reporter.log("In Tenant page next page is selected Pass");
						}
						else
						{
							captureScreenshot(d);
							Thread.sleep(5000);
							System.out.println("In Tenant page next page is not selected Fail");
							Reporter.log("In Tenant page next page is not selected Fail");
						}
					}
						catch(Exception e) 
										{
											captureScreenshot(d);
											Thread.sleep(5000);
											//click ESC
											Actions action = new Actions(d);
											action.sendKeys(Keys.ESCAPE).build().perform();
											System.out.println("Tenant user deleted button not visible");
											Reporter.log("Tenant user deleted button not visible");
											
						                }
				}
						
}
