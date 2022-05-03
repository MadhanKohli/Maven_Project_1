package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement un;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement login;
	
	public Adactin_Login_Page(WebDriver driver1) {

	this.driver = driver1;
	
	PageFactory.initElements(driver , this);
	
	}

	public WebElement getUn() {
		return un;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
}
