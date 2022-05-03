package com.Base;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	
	public static Select s;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver2\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		return driver;
	}
	public static void getURL(String url) {

		driver.get(url);
	}
	public static void getText(WebElement element) {
	     String text = element.getText();
		  System.out.println(text);
		}
	public static void getAttribute(WebElement element, String name) {
	      String attribute = element.getAttribute(name);
	      System.out.println(attribute);
		}
		public static void getTitle() {
         String title = driver.getTitle();
         System.out.println(title);
		}	
		public static void getCurrentUrl() {
          String currentUrl = driver.getCurrentUrl();
          System.out.println(currentUrl);
		}
	public static void clickOnElement(WebElement w) {

		w.click();

	}
	public static void inputValueElement(WebElement element, String name) {

		element.sendKeys(name);

	}
	public static void takesScreenShot(String path) throws IOException {

		TakesScreenshot s = (TakesScreenshot)driver;
		File Source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(Source, dest);
	}
	public static void close() {

		driver.close();
	}
	public static void quit() {

		driver.quit();
	}
	
	public static void navigate(String webpage) {

		driver.navigate().to(webpage);
	}
	public static void navigateBack() {

		driver.navigate().back();
	}
	public static void navigateForward() {
      driver.navigate().forward();
      
	}
	public static void navigateRefresh() {
      driver.navigate().refresh();
      
	}
	public static void selectBYValue(WebElement element, String type) {

		 s = new Select(element);

		 s.selectByValue(type);
		}
       public static void selectByVisibleText(WebElement element, String type) {

    	   s = new Select(element);
    	   
    	   s.selectByVisibleText(type);
	}
	 public static void selectByIndex(WebElement element, int type) {
 
		 s = new Select(element);
		 
		 s.selectByIndex(type);
	}
	public static void conditionCheck(WebElement element, String type) {

		s = new Select(element);
		
		if (type.equalsIgnoreCase("isenable")) {
			boolean e = element.isEnabled();
			System.out.println(e);
		}
		
		else if (type.equalsIgnoreCase("isdisplayed")) {
			boolean d = element.isDisplayed();
			System.out.println(d);
		}
	}
	public static void multipleOptions(WebElement element) {

		s = new Select(element);
		boolean m = s.isMultiple();
		System.out.println(m);
	}
	public static void firstSelectedOption(WebElement element) {
      s = new Select(element);
      WebElement fso = s.getFirstSelectedOption();
      System.out.println(fso.getText());
	}
	public static void getAllSelectedOptions(WebElement element) {
       s = new Select(element);
       List<WebElement> aso = s.getAllSelectedOptions();
       for (int i = 0; i < aso.size(); i++) {
		System.out.println(aso.get(i).getText());
	}       
	}
	public static void getOptions(WebElement element) {
     s = new Select(element);
     List<WebElement> options = s.getOptions();
     for (int i = 0; i < options.size(); i++) {
		System.out.println(options.get(i).getText());
	}
	}

	public static void alert(String s,WebElement w) throws InterruptedException {

		if (s.equalsIgnoreCase("Alert")) {
			w.click();
			driver.switchTo().alert().accept();	
		}
		else if (s.equalsIgnoreCase("Confirm")) {
			w.click();
			driver.switchTo().alert().dismiss();
		}
		else if (s.equalsIgnoreCase("Prompt")) {
			w.click();
			Alert a = driver.switchTo().alert();
			a.sendKeys("Confirm Alert");
			a.accept();
			//driver.switchTo().alert().sendKeys("Confirm Alert");
            //driver.switchTo().alert().accept();		
		}
	}
	public static void frames(WebElement element) {

		driver.switchTo().frame(element);
	}
	public static void defaultFrame() {

		driver.switchTo().defaultContent();
	}
	public static void parentFrame() {
     
		driver.switchTo().parentFrame();
	}
	public static void implicitWait(int time) {

     driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);		

	}
	
	
}
