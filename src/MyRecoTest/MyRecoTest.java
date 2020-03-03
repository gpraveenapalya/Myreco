package MyRecoTest;
import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Analytics.ABTesting;
import Analytics.ContentBasedPersonalization;
import Analytics.ContentBasedRecommendations;
import Analytics.Dashboard;
import Analytics.IndividualPersonalization;
import Analytics.MassPersonalization;
import Configure.APIKeys;
import Configure.user;
import ContentManagement.MetaEnrichment;
import Solutions.CBRecommendations;
import Solutions.CbPersonalization;
import Solutions.Ipersonalization;
import Solutions.MPersonalization;
import Solutions.Reco;
import Tenant.Properties;
import Tenant.Tenantuser;
import utils.InputDetails;

public class MyRecoTest extends InputDetails{
public static WebDriver d=null;
	
	@Test(priority=1)
	public static void startpage() {
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Apalya\\Desktop\\Automation\\library\\geckodriver.exe");
//		d=new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Apalya\\Downloads\\chromedriver.exe");
			d=new ChromeDriver();
		d.get(preurl);
		d.manage().window().maximize();
		Reporter.log("Browser opend Pass");
	}
	
	@Test(priority=2)
	public static void openpage() throws Exception {	
		Reco.login(d);
		//System.out.println(Color.RED+"Login Success"+ Color.WHITE);
		
		Thread.sleep(3000);
		Reco.Editproject(d);
		Thread.sleep(3000);
		Reco.NavigateToMenu(d);
		Thread.sleep(5000);
		Reco.changepassword(d);
		Thread.sleep(9000);
		
	}
	@Test(priority=3)
	public static void Solutionspage() throws Exception {	
		CbPersonalization.CbPersonalizationsub(d);
		Thread.sleep(5000);
		CbPersonalization.edit(d);
		Thread.sleep(5000);
		CbPersonalization.unpublished(d);
		Thread.sleep(5000);
		CbPersonalization.published(d);
		Thread.sleep(5000);
		CbPersonalization.CBPersonalizationSearchTab(d);
		Thread.sleep(5000);
		CbPersonalization.delete(d);
		Thread.sleep(5000);
		//CbPersonalization.BlackListedContent(d);
		Thread.sleep(5000);
		CBRecommendations.CbRecommendationssub(d);
		Thread.sleep(5000);
		CBRecommendations.edit(d);
		Thread.sleep(5000);
		CBRecommendations.unpublished(d);
		Thread.sleep(5000);
		CBRecommendations.published(d);
		Thread.sleep(5000);
		CBRecommendations.CbRecommendationsSearchTab(d);
		Thread.sleep(5000);
	//	CBRecommendations.BlackListedContent(d);
		Thread.sleep(5000);
		
	}
	@Test(priority=4)
	public static void Solutionspage2() throws Exception {	
		Ipersonalization.Ipersonalizationsub(d);
		Thread.sleep(5000);
		Ipersonalization.edit(d);
		Thread.sleep(5000);
		Ipersonalization.unpublished(d);
		Thread.sleep(5000);
		Ipersonalization.published(d);
		Thread.sleep(5000);
		Ipersonalization.IpersonalizationSearchTab(d);
		Thread.sleep(5000);	
		//Ipersonalization.BlackListedContent(d);
		Thread.sleep(5000);	
		MPersonalization.MPersonalizationsub(d);
		Thread.sleep(5000);
		MPersonalization.unpublished(d);
		Thread.sleep(5000);
		MPersonalization.published(d);
		Thread.sleep(5000);
		MPersonalization.MPersonalizationSearchTab(d);
		Thread.sleep(5000);
		MPersonalization.edit(d);
		Thread.sleep(5000);
		MPersonalization.delete(d);
		Thread.sleep(5000);
		//MPersonalization.BlackListedContent(d);
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public static void Analyticspage() throws Exception  {
		Dashboard.dashboard(d);
		Thread.sleep(3000);
		IndividualPersonalization.IPersonalization(d);
		Thread.sleep(3000);
		MassPersonalization.MPersonalization(d);
		Thread.sleep(3000);
		ContentBasedRecommendations.CBRecommendations(d);
		Thread.sleep(3000);
		ContentBasedPersonalization.CBPersonalization(d);
		Thread.sleep(3000);
		ABTesting.abTesting(d);
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public static void Configurepage() throws Exception{
		user.creatuser(d);
		Thread.sleep(3000);
		user.usersearch(d);
		Thread.sleep(3000);
		APIKeys.usersearch(d);
		Thread.sleep(3000);
	}
//	@Test(priority=7)
//	public static void ContentManagementpage() throws Exception{
//		//MetaEnrichment.Metaenrichment(d);
//		Thread.sleep(3000);
//		//MetaEnrichment.filters(d);
//		Thread.sleep(3000);
//	}
	@Test(priority=8)
	public static void logoutpage() throws Exception {
		
		Reco.logout(d);
		Thread.sleep(3000);
		Reco.invalidlogin(d);
	}
	/*@Test(priority=9)
	public static void Tenant() throws Exception {
		
		Reco.Tenant(d);
		Thread.sleep(3000);
		Tenantuser.TenantManagementSystem(d);
		Thread.sleep(5000);
		Tenantuser.Tenantuser(d);
		Thread.sleep(5000);
		Tenantuser.Tenantsearch(d);
		Thread.sleep(5000);
		Tenantuser.Tenantdelete(d);
		Thread.sleep(5000);
		
	}
	@Test(priority=10)
	public static void Propertiespage() throws Exception {
		
		Properties.createProperties(d);
		Thread.sleep(5000);
		Properties.EditProperties(d);
		Thread.sleep(5000);
		Properties.Value(d);
		Thread.sleep(5000);
	}
	@Test(priority=11)
	public static void Tenantlogout() throws Exception {
		
		d.findElement(By.xpath("//*[@id=\"dropdown-username\"]/a")).click();
		d.findElement(By.xpath("//*[@id=\"toggle-username\"]/li[2]/a")).click();
		System.out.println("Tenant logout Pass");
		Reporter.log("Tenant logout Pass");
		Thread.sleep(5000);
		Reco.Tenantinvalid(d);
		
	}*/
	

}
