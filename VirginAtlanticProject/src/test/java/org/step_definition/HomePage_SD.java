package org.step_definition;

import org.junit.Assert;
import org.pojo_classes.FlightStatusPojo;
import org.pojo_classes.FlightToNewYorkPojo;
import org.pojo_classes.HomePagePojo;
import org.pojo_classes.JoinFlyingClubPojo;
import org.pojo_classes.MyBookingPojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePage_SD extends BaseClass{
	JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
	
	@Given("user opens the Browser and then launching the URL {string}")
	public void user_opens_the_Browser_and_then_launching_the_URL(String url) {
	   launchChrome();
	   chromeObject();
	   winMax();
	   implicitWaiting();
	   launchUrl(url);  
	}

	@When("user clicks MyBooking link")
	public void user_clicks_MyBooking_link() {
		jfc.getCookiesHomePage().click();
		jfc.getMyBooking().click();
	}

	@Then("user should navigate to MyBooking page")
	public void user_should_navigate_to_MyBooking_page() {
		implicitWaiting();
	    Assert.assertTrue(jfc.getMyBookingLabel().getText().contains("Find"));
	}

	@When("user clicks FlightStatus link")
	public void user_clicks_FlightStatus_link() {
		implicitWaiting();
		jfc.getFlightStatus().click();
	}

	@Then("user should navigate to FlightStatus page")
	public void user_should_navigate_to_FlightStatus_page() {
		implicitWaiting();
	   Assert.assertTrue(jfc.getFlightStatusLabel().getText().contains("Search"));
	}

	@When("user clicks JoinFlyingClub link")
	public void user_clicks_JoinFlyingClub_link() {
		implicitWaiting();
		jfc.getJoinFlyingClub().click();
	}

	@Then("user should navigate to JoinFlyingClub page")
	public void user_should_navigate_to_JoinFlyingClub_page() {
		implicitWaiting();
	    Assert.assertTrue(jfc.getJoinFlyingClubLabel().getText().contains("About"));
	    jfc.getVigirinAtlantic().click();
	}

	@When("user clicks LogIn link")
	public void user_clicks_LogIn_link() {
		implicitWaiting();
	    jfc.getLogIn().click();
	}

	@Then("user should navigate to LogIn page")
	public void user_should_navigate_to_LogIn_page() {
		implicitWaiting();
	    Assert.assertTrue(jfc.getLogInLabel().getText().contains("Log"));
	    jfc.getVigirinAtlantic().click();
	}

	@When("user drags the mouse over DestinationAndOnBoard dropdown and clicks Africa link")
	public void user_drags_the_mouse_over_DestinationAndOnBoard_dropdown_and_clicks_Africa_link() {
		implicitWaiting();
		moveCursorActions(jfc.getDestinationsAndOnBoard());
	    SingleClkActions(jfc.getAfrica());
	}

	@Then("user should navigate to Africa page")
	public void user_should_navigate_to_Africa_page() {
		implicitWaiting();
	    Assert.assertTrue(driver.getCurrentUrl().contains("africa"));
	    closeBrowser();
	}
	
	
	
	
	
	
	
	
	

}
