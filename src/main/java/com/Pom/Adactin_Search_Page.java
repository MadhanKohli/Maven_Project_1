package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Search_Page {

	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement rt;
	
	@FindBy(id = "room_nos")
	private WebElement nr;
	
	@FindBy(id = "datepick_in")
	private WebElement cid;
	
	@FindBy(id = "datepick_out")
	private WebElement cod;
	
	@FindBy(id = "adult_room")
	private WebElement na;
	
	@FindBy(id = "child_room")
	private WebElement nc;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	
	public Adactin_Search_Page(WebDriver driver2) {
      
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRt() {
		return rt;
	}

	public WebElement getNr() {
		return nr;
	}

	public WebElement getCid() {
		return cid;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getNa() {
		return na;
	}

	public WebElement getNc() {
		return nc;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
}