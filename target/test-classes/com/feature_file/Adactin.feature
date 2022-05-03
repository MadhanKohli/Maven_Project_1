Feature: Checking the Hotel Booking functionality in the Adactinapplication
@SmokeTest
Scenario Outline: Login functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Filed
And user Enter The "<password>" In The Password Filed
Then user Click The Login Button And It Navigates To The Hotel Search Page

Examples:
|Mani|Madhan@123|
|MaddyMadhan|456|
|Hari|12345|
|MaddyMadhan|Madhan@123|

@Search
Scenario: Search Hotel functionality
When user Select The "Sydney" In The Select Location Filed
And user Select The "Hotel Sunshine" In The Hotels Filed
And user Select The "Deluxe" In The Room Type Filed
And user Select The "1-One" IN The Number Of Rooms Filed
And user Enter The "28/04/2022" In The Check-In_Date Filed
And user Enter The "29/04/2022" In The Check_Out_Date Filed
And user Select The "2-Two" In The Adults per Room Filed
And user Select The "1-One" In The Children Per Room Filed
Then user Click The Search Butten And It Navigates To SelectHotel_Continue Page

@Continue
Scenario: SelectHotel_Continue functionality
When user Must Click The Slect Radio Button
Then user Click The Continue Button And It Navigates To The Book A Hotel Page

@Book
Scenario: Book A Hotel functionality
When user Enter The "Vijay" In The First Name Filed
And user Enter The "Kumar" In The Last Name Filed
And user Enter The "No:1, AL Street, ABC" In The Address Filed
And user Enter The "1234567891011121" In The Credit card No Filed
And user Select The "Master Card" In The Credit Card Type Filed
And user Selct The Month "May" In The Expiry Date Filed
And user Selct The Year "2022" In The Expiry Date Filed
And user Enter The "581" In The Cvv Number Filed
Then user Click The Book Now Button And It Navigates To the Booking Confirmation

@Logout
Scenario: Logout functionality
Then user Click The Logout Button And It Has To Logged Out Successfully