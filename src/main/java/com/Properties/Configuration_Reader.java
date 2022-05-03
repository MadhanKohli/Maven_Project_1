package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration_Reader {

	public WebDriver driver;

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File("C:\\Users\\Madhankumar\\eclipse-workspace\\Maven_Project_1\\src\\main\\java\\com\\Properties\\Adactin.Properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUrl() throws Throwable {

		String Url = p.getProperty("Url");
		return Url;
	}

	public String getUn() {
		
		String Un = p.getProperty("Un");
         return Un;
	}

	public String getPass() {
    
	  String Pass = p.getProperty("Pass");
		return Pass;
	}
	
	public String getCid() {

		String Cid = p.getProperty("Cid");
		return Cid;
	}
	
	public String getCod() {

		String Cod = p.getProperty("Cod");
		return Cod;
	}
	
	public String getFn() {

		String Fn = p.getProperty("Fn");
		return Fn;
	}
	
	public String getLn() {

		String Ln = p.getProperty("Ln");
		return Ln;
	}
	
	public String getAddress() {

		String Address = p.getProperty("Address");
		return Address;
	}
	
	public String getCcn() {

		String Ccn = p.getProperty("Ccn");
		return Ccn;
	}
	
	public String getCvv() {

		String Cvv = p.getProperty("Cvv");
		return Cvv;
	}
	
	

}
