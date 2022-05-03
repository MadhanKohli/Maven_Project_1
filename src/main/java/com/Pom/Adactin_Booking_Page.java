package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booking_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fn;
	
	@FindBy(id = "last_name")
	private WebElement ln;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccn;
	
	@FindBy(id = "cc_type")
	private WebElement cct;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	public Adactin_Booking_Page(WebDriver driver4) {

	   this.driver = driver4;
	
	   PageFactory.initElements(driver, this);
	   
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcn() {
		return ccn;
	}

	public WebElement getCct() {
		return cct;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
}
