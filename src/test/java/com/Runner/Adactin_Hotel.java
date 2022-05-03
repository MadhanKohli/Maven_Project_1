package com.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Base_Class;
import com.Pom.Adactin_Booking_Page;
import com.Pom.Adactin_Continue_Page;
import com.Pom.Adactin_Login_Page;
import com.Pom.Adactin_Logout_Page;
import com.Pom.Adactin_Search_Page;
import com.Properties.File_Reader_Manager;
import com.sdp.Adactin_Page_Object_Manager;

public class Adactin_Hotel extends Base_Class{

	public static WebDriver driver = getBrowser("chrome");
	
	public static Adactin_Page_Object_Manager APOM = new Adactin_Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Reader_Manager.getFRM().getCR().getUrl();
		getURL(url);
		
	//	Adactin_Login_Page ALP = new Adactin_Login_Page(driver);
		
		String un = File_Reader_Manager.getFRM().getCR().getUn();
		inputValueElement(APOM.getALP().getUn(), un);
		
		String pass = File_Reader_Manager.getFRM().getCR().getPass();
		inputValueElement(APOM.getALP().getPass(), pass);
		
		clickOnElement(APOM.getALP().getLogin());
	    
	//	Adactin_Search_Page ASP = new Adactin_Search_Page(driver);
		
		selectByIndex(APOM.getASP().getLocation(), 1);
	    selectBYValue(APOM.getASP().getHotel(), "Hotel Sunshine");
        selectByVisibleText(APOM.getASP().getRt(), "Deluxe");	
	    selectBYValue(APOM.getASP().getNr(), "1");
	    
	    String cid = File_Reader_Manager.getFRM().getCR().getCid();
	    inputValueElement(APOM.getASP().getCid(), cid);
	    
	    String cod = File_Reader_Manager.getFRM().getCR().getCod();
	    inputValueElement(APOM.getASP().getCod(), cod);
	    
	    selectBYValue(APOM.getASP().getNa(), "2");
	    selectBYValue(APOM.getASP().getNc(), "1");
	    clickOnElement(APOM.getASP().getSearch());
	
	//  Adactin_Continue_Page ACP = new Adactin_Continue_Page(driver);
	
	    clickOnElement(APOM.getACP().getSelect());
	    clickOnElement(APOM.getACP().getCon());
	
      //  Adactin_Booking_Page ABP = new Adactin_Booking_Page(driver);
	
	    String fn = File_Reader_Manager.getFRM().getCR().getFn();
	    inputValueElement(APOM.getABP().getFn(), fn);
	    
	    String ln = File_Reader_Manager.getFRM().getCR().getLn();
	    inputValueElement(APOM.getABP().getLn(), ln);
	    
	    String address = File_Reader_Manager.getFRM().getCR().getAddress();
	    inputValueElement(APOM.getABP().getAddress(), address);
	    
	    String ccn = File_Reader_Manager.getFRM().getCR().getCcn();
	    inputValueElement(APOM.getABP().getCcn(), ccn);
	    
	    selectByIndex(APOM.getABP().getCct(), 3);
	    selectByIndex(APOM.getABP().getExpmonth(), 5);
	    selectByVisibleText(APOM.getABP().getExpyear(), "2022");
	    
	    String cvv = File_Reader_Manager.getFRM().getCR().getCvv();
	    inputValueElement(APOM.getABP().getCvv(), cvv); 
	    
        clickOnElement(APOM.getABP().getBook());
	
   //   Adactin_Logout_Page ALP = new Adactin_Logout_Page(driver);
        
        clickOnElement(APOM.getALOP().getLogout()); 
        
	}
}
