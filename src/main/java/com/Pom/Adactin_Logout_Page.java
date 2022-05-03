package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Logout_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "logout")
    private WebElement logout;

	public Adactin_Logout_Page(WebDriver driver5) {

	 this.driver = driver5;
	 PageFactory.initElements(driver, this);
	 
	}

	public WebElement getLogout() {
		return logout;
	}
}
