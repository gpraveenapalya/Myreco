package Solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import utils.InputDetails;

public class CustomCarousel  extends InputDetails{
	public static void custom(WebDriver d) throws Exception 
	{

	Actions action = new Actions(d);
	d.findElement(By.linkText("Analytics")).click();
	Thread.sleep(5000);
	d.findElement(By.linkText("Solutions")).click();
	Thread.sleep(5000);
	d.findElement(By.linkText("Custom Carousel")).click();
	Thread.sleep(5000);
	d.findElement(By.cssSelector("button[type='button'][class='btn btn-primary create-carousel']")).click();
	Thread.sleep(5000);
	d.findElement(By.id("CarouselTitle")).sendKeys(CarouselTitle);
	d.findElement(By.id("NumberofContentsinCarousel")).sendKeys("3");
	d.findElement(By.linkText("Proceed to Customize")).click(); 
	Thread.sleep(5000);
	new Select(d.findElement(By.id("_solutionType1"))).selectByVisibleText("Promotional Place Holder");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("userProperty1"))).selectByVisibleText("State");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("userProperty1_values"))).selectByVisibleText("AP");
	d.findElement(By.id("_contentNameSearch1")).sendKeys("chalo",Keys.ENTER,Keys.DOWN.ENTER);
	
	
	new Select(d.findElement(By.id("_solutionType2"))).selectByVisibleText("Individual Personalization");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("_contentType2"))).selectByVisibleText("Movie");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("_carouselId2"))).selectByVisibleText("Cold Start Testing (66dcaba1-abb2-4376-9ef7-389da54146e4)");
	
	Thread.sleep(5000);
	new Select(d.findElement(By.id("_solutionType3"))).selectByVisibleText("Mass Personalization");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("_contentType3"))).selectByVisibleText("TV Series");
	Thread.sleep(3000);
	new Select(d.findElement(By.id("_carouselId3"))).selectByVisibleText("Testing TV series (b7b831b4-5297-449e-8ae0-f8cc333bdb85)");
	
	d.findElement(By.id("_savePromotions")).click();
	Thread.sleep(5000);
	
	
	}
}
