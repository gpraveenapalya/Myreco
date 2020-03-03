package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;

public class screenshorts {
	
	public static void captureScreenshot(WebDriver d) throws IOException {

		Date date = new Date();
		String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		File screenshotName= new File(".//screenshot//" + fileName);
		FileUtils.copyFile(screenshot,screenshotName);
		Reporter.log("<br><img src='"+screenshotName+"'hight='400' width='400'/><br>");
		
//		String screen_shot_path = System.getProperty("user.dir") + screenshotName;
//
//		Reporter.log("<td><a href='" + screen_shot_path
//		                    + ".jpg'><img src='" + screen_shot_path
//		                    + ".jpg' height='100' width='100' /></a></td>");
		
	}
	 public static void onTestFailure(ITestResult result,WebDriver d) {
	        Calendar calendar = Calendar.getInstance();
	        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	        String methodName = result.getName();
	        if(!result.isSuccess()){
	            File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	            try {
	                String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/surefire-reports";
	                File destFile = new File((String) reportDirectory+"/failure_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
	                FileUtils.copyFile(scrFile, destFile);
	                Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
