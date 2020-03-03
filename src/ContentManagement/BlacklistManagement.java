package ContentManagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import utils.InputDetails;

public class BlacklistManagement extends InputDetails{
	public static void Management(WebDriver d) throws InterruptedException, IOException
	{
		try {
			//d.findElement(By.linkText("Content Management")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[3]/a")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[1]/input")).click();
			d.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[5]/td[1]/input")).click();
			Thread.sleep(3000);
			new Select(d.findElement(By.id("multiSelectCheckBoxId"))).selectByIndex(1);
			 //all
			 //d.findElement(By.cssSelector("input[type='checkbox'][id='selectCarousels']")).click();
			 //individualpersonalization
			 Thread.sleep(3000);
			 d.findElement(By.xpath("//*[@id=\"individualpersonalization\"]")).click();
			 Thread.sleep(3000);
			 d.findElement(By.xpath("//*[@id=\"blackLisitng_content_form\"]/div[2]/button")).click();
			 
			 
			 System.out.println("Blacklist Management content upated Pass");
			 Reporter.log("Blacklist Management content upated Pass");
		}
		catch(Exception e)
		{
			captureScreenshot(d);
			Thread.sleep(5000);
			System.out.println("Blacklist Management content upated Fail");
			Reporter.log("Blacklist Management content upated Fail");
		    
		}
	}
	

}
