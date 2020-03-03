package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InputDetails extends screenshorts{

	public static String CarouselTitleMP;
	public static String Batchsizeforshuffling;
	public static String carouselSearchTerm;
	public static String CarouselTitleIP;
	public static String CbRecommendationssub;
	public static String CarouselTitleCBR;
	public static String CarouselTitleCBP;
	public static String searchUserTerm;
	public static String username;
	public static String password;
	public static String invaliduser;
	public static String invalidpassword;
	public static String Horror;
	public static String Ratting;
	public static String ReleaseYear;
	public static String userpassword;
	public static String Mobile;
	public static String FirstName;
	public static String LastName;
	public static String Tenantuserid;
	public static String Tenantpassword;
	public static String invalidTenantuser;
	public static String invalidTenantpassword;
	public static String TenantName;
	public static String ContactName;
	public static String ContactEmail;
	public static String NewPassword;
	public static String ContactNumber;
	public static String changeName;
	public static String discription;
	public static String PropertiesName;
	public static String propertyDesc;
	public static String defaultValue;
	public static String updatepropertyDesc;
	public static String defaultValueadd;
	public static String validpassword;
	public static String validuser;
	public static String produser;
	public static String prodpassword;
	public static String produrl;
	public static String preurl;
	public static String AbTesting;
	public static String CarouselTitle;
	
	
	static {
		
		
		//prod user
		/*produrl="http://prodmc.myreco.in/login";
		user="vfplayprod_qa@apalya.com";
		password="Myplex@123";*/
		
		//pre user
		preurl="http://dev.console.myreco.in:8080/login";
		username="qa@apalya.com";
		password="Apalya@123";
		
		//create user
		searchUserTerm="TestuserName1@g.com";
		userpassword="Apalya@1";
		Mobile="9876543210";
		FirstName="Name";
		LastName="Last";
		
		
		//MPersonalizationsub
		CarouselTitleMP="QA_Planing20";
		Batchsizeforshuffling="10";
		//Ipersonalizationsub
		CarouselTitleIP="QA_Testing23";
		AbTesting="AB Testing_QA1";
		//CbRecommendationssub
		CarouselTitleCBR="QA_testing21";
		//CbPersonalizationsub
		CarouselTitleCBP="Qa_Testing22";
		//invalidlogin
		invaliduser="qa@apalya.com";
		validpassword="Apalya@123";
		validuser="qa@apalya.com";
		invalidpassword="Myplex@123";
		//AB Testing
		carouselSearchTerm="Recommanded New";
		//MetaEnrichment
		Horror="Horror";
		ReleaseYear="1991-2000";
		Ratting="3.0";
		
				//Tenent login
				Tenantuserid="myplex_admin@myplex2.com";
				Tenantpassword="Myplex@123";
				//Tenant invalid login
				invalidTenantuser="myplex_admin@myplex2.com";
				invalidTenantpassword="Myplex@1";
				//Tenant details
				TenantName="qateam1";
				ContactName="Kiran";
				ContactEmail="qateam@apalya.com";
				NewPassword="Apalya@123";
				ContactNumber="9398133138";
				changeName="qateam";
				discription="Hi Team";
				//Properties
				PropertiesName="QA test1";
				propertyDesc="Description";
				defaultValue="30";
				updatepropertyDesc="updated";
				defaultValueadd="50";
				
				
				//custom Carousel
				CarouselTitle="";
	}


}
