package com.sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.Adactin_Booking_Page;
import com.Pom.Adactin_Continue_Page;
import com.Pom.Adactin_Login_Page;
import com.Pom.Adactin_Logout_Page;
import com.Pom.Adactin_Search_Page;

public class Adactin_Page_Object_Manager {

	public WebDriver driver;
	
	private Adactin_Login_Page ALP;
	
	private Adactin_Search_Page ASP;
	
	private Adactin_Continue_Page ACP;
	
	private Adactin_Booking_Page ABP;
	
	private Adactin_Logout_Page ALOP;
	
	
	public Adactin_Page_Object_Manager(WebDriver driver5) {

	this.driver = driver5;
		
	}

	public Adactin_Login_Page getALP() {
		
		if(ALP == null) {
		ALP = new Adactin_Login_Page(driver);
		}	
		return ALP;
	}
	
	public Adactin_Search_Page getASP() {
		
		if(ASP == null) {
			ASP = new Adactin_Search_Page(driver);
		}
		return ASP;
	}
	
	public Adactin_Continue_Page getACP() {
	
		if(ACP == null) {
			ACP = new Adactin_Continue_Page(driver);
		}
		
		return ACP;
	}
	
	public Adactin_Booking_Page getABP() {
	
		if(ABP == null) {
			ABP = new Adactin_Booking_Page(driver);	
		}
		
		return ABP;
	}
	
	public Adactin_Logout_Page getALOP() {
		
		if(ALOP == null) {
			ALOP = new Adactin_Logout_Page(driver);
		}
		
		return ALOP;
	}

	
}
