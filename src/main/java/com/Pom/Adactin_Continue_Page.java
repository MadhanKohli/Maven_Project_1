package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Continue_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
    private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement con;

	public Adactin_Continue_Page(WebDriver driver3) {

	  this.driver = driver3;
	  
	  PageFactory.initElements(driver, this);
		
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCon() {
		return con;
	} 
	
	
}
