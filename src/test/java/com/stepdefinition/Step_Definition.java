package com.stepdefinition;

import java.io.IOException;

import com.Base.Base_Class;
import com.Properties.File_Reader_Manager;
import com.sdp.Adactin_Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	
	public static Adactin_Page_Object_Manager APOM = new Adactin_Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario s) {
            
		String name = s.getName();
		
		System.out.println("Scenario Name:" + name);
	}
	@After
	public void afterHooks(Scenario s) throws IOException {

		String status = s.getStatus();
		
		System.out.println("Scenario Status:" + status);
		
		if(s.isFailed())

	    takesScreenShot("C:\\Users\\Madhankumar\\eclipse-workspace\\Maven_Project_1\\Screenshot_Adactin\\Adactin.png");
	}
	
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {


		String url = File_Reader_Manager.getFRM().getCR().getUrl();
		getURL(url);
		
	}	
		
	@When("^user Enter The \"([^\"]*)\" In The Username Filed$")
	public void user_Enter_The_In_The_Username_Filed(String arg1) throws Throwable {

		String un = File_Reader_Manager.getFRM().getCR().getUn();
		inputValueElement(APOM.getALP().getUn(), un);
	
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Filed$")
	public void user_Enter_The_In_The_Password_Filed(String arg1) throws Throwable {

		String pass = File_Reader_Manager.getFRM().getCR().getPass();
		inputValueElement(APOM.getALP().getPass(), pass);
		
	}

	@Then("^user Click The Login Button And It Navigates To The Hotel Search Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Hotel_Search_Page() throws Throwable {

		clickOnElement(APOM.getALP().getLogin());
	
	}

	@When("^user Select The \"([^\"]*)\" In The Select Location Filed$")
	public void user_Select_The_In_The_Select_Location_Filed(String arg1) throws Throwable {

		selectByIndex(APOM.getASP().getLocation(), 1);
	
	}

	@When("^user Select The \"([^\"]*)\" In The Hotels Filed$")
	public void user_Select_The_In_The_Hotels_Filed(String arg1) throws Throwable {

		 selectBYValue(APOM.getASP().getHotel(), "Hotel Sunshine");
	}

	@When("^user Select The \"([^\"]*)\" In The Room Type Filed$")
	public void user_Select_The_In_The_Room_Type_Filed(String arg1) throws Throwable {

		selectByVisibleText(APOM.getASP().getRt(), "Deluxe");
	}

	@When("^user Select The \"([^\"]*)\" IN The Number Of Rooms Filed$")
	public void user_Select_The_IN_The_Number_Of_Rooms_Filed(String arg1) throws Throwable {

		selectBYValue(APOM.getASP().getNr(), "1");
	}

	@When("^user Enter The \"([^\"]*)\" In The Check-In_Date Filed$")
	public void user_Enter_The_In_The_Check_In_Date_Filed(String arg1) throws Throwable {

		String cid = File_Reader_Manager.getFRM().getCR().getCid();
	    inputValueElement(APOM.getASP().getCid(), cid);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Check_Out_Date Filed$")
	public void user_Enter_The_In_The_Check_Out_Date_Filed(String arg1) throws Throwable {

		String cod = File_Reader_Manager.getFRM().getCR().getCod();
	    inputValueElement(APOM.getASP().getCod(), cod);
	    
	}

	@When("^user Select The \"([^\"]*)\" In The Adults per Room Filed$")
	public void user_Select_The_In_The_Adults_per_Room_Filed(String arg1) throws Throwable {

		selectBYValue(APOM.getASP().getNa(), "2");
	}

	@When("^user Select The \"([^\"]*)\" In The Children Per Room Filed$")
	public void user_Select_The_In_The_Children_Per_Room_Filed(String arg1) throws Throwable {

		selectBYValue(APOM.getASP().getNc(), "1");
	}

	@Then("^user Click The Search Butten And It Navigates To SelectHotel_Continue Page$")
	public void user_Click_The_Search_Butten_And_It_Navigates_To_SelectHotel_Continue_Page() throws Throwable {

		clickOnElement(APOM.getASP().getSearch());
	}

	@When("^user Must Click The Slect Radio Button$")
	public void user_Must_Click_The_Slect_Radio_Button() throws Throwable {

		clickOnElement(APOM.getACP().getSelect());
	}

	@Then("^user Click The Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {

		clickOnElement(APOM.getACP().getCon());
	}

	@When("^user Enter The \"([^\"]*)\" In The First Name Filed$")
	public void user_Enter_The_In_The_First_Name_Filed(String arg1) throws Throwable {

		String fn = File_Reader_Manager.getFRM().getCR().getFn();
	    inputValueElement(APOM.getABP().getFn(), fn);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Last Name Filed$")
	public void user_Enter_The_In_The_Last_Name_Filed(String arg1) throws Throwable {

		String ln = File_Reader_Manager.getFRM().getCR().getLn();
	    inputValueElement(APOM.getABP().getLn(), ln);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Address Filed$")
	public void user_Enter_The_In_The_Address_Filed(String arg1) throws Throwable {

		String address = File_Reader_Manager.getFRM().getCR().getAddress();
	    inputValueElement(APOM.getABP().getAddress(), address);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In The Credit card No Filed$")
	public void user_Enter_The_In_The_Credit_card_No_Filed(String arg1) throws Throwable {

		String ccn = File_Reader_Manager.getFRM().getCR().getCcn();
	    inputValueElement(APOM.getABP().getCcn(), ccn);
	    
	}

	@When("^user Select The \"([^\"]*)\" In The Credit Card Type Filed$")
	public void user_Select_The_In_The_Credit_Card_Type_Filed(String arg1) throws Throwable {

		selectByIndex(APOM.getABP().getCct(), 3);
	}

	@When("^user Selct The Month \"([^\"]*)\" In The Expiry Date Filed$")
    public void user_Selct_The_Month_In_The_Expiry_Date_Filed(String arg1) throws Throwable {

        selectByIndex(APOM.getABP().getExpmonth(), 5);

    }

    @When("^user Selct The Year \"([^\"]*)\" In The Expiry Date Filed$")
    public void user_Selct_The_Year_In_The_Expiry_Date_Filed(String arg1) throws Throwable {

        selectByVisibleText(APOM.getABP().getExpyear(), "2022");

    }

	@When("^user Enter The \"([^\"]*)\" In The Cvv Number Filed$")
	public void user_Enter_The_In_The_Cvv_Number_Filed(String arg1) throws Throwable {

		String cvv = File_Reader_Manager.getFRM().getCR().getCvv();
	    inputValueElement(APOM.getABP().getCvv(), cvv); 
	    
	}

	@Then("^user Click The Book Now Button And It Navigates To the Booking Confirmation$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_the_Booking_Confirmation() throws Throwable {

		clickOnElement(APOM.getABP().getBook());
	}

	@Then("^user Click The Logout Button And It Has To Logged Out Successfully$")
	public void user_Click_The_Logout_Button_And_It_Has_To_Logged_Out_Successfully() throws Throwable {

		clickOnElement(APOM.getALOP().getLogout());
	}


	
	
}
