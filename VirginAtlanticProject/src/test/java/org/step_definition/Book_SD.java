package org.step_definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class Book_SD extends BaseClass{
	
	JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
	
	/*@Given("user opens the Browser and then launching the URL")
	public void user_opens_the_Browser_and_then_launching_the_URL() {
	   launchChrome();
	   chromeObject();
	   winMax();
	   launchUrl("https://www.virginatlantic.com/in/en");
	}*/
	
	@When("user clicks From text box")
	public void user_clicks_From_text_box() {
	   implicitWaiting();
	   jfc.getFrom().click();
	}

	@When("user clicks FullAirportList")
	public void user_clicks_FullAirportList() {
		implicitWaiting();
		jfc.getFullAirportList().click();
	}

	@When("user clicks ALPHABETICALLY")
	public void user_clicks_ALPHABETICALLY() {
		implicitWaiting();
		jfc.getAlphabetically().click();
	}

	@Then("user should validate and verify all the airport names are avalible")
	public void user_should_validate_and_verify_all_the_airport_names_are_avalible() {
		implicitWaiting();
		List<WebElement> airportsAlphabetically = jfc.getAirportsAlphabetically();
		
		for (int i = 0; i < airportsAlphabetically.size(); i++) {
			System.out.println(getData(1, i+1, 0)+"="+airportsAlphabetically.get(i).getText());
			Assert.assertEquals(airportsAlphabetically.get(i).getText(), getData(1, i+1, 0));
		}
		jfc.getCloseAirPortList().click();
	}

	@When("user clicks passengers option box")
	public void user_clicks_passengers_option_box() {
		implicitWaiting();
		jfc.getPassenger().click();
	}

	@When("user clicks the Adults Plus botton for NINE times")
	public void user_clicks_the_Adults_Plus_botton_for_NINE_times() {
		
		for (int i = 0; i < 8; i++) {
			implicitWaiting();
			moveCursorActions(jfc.getAddAdultsPassenger());
			SingleClkActions(jfc.getAddAdultsPassenger());
		}
		
	}

	@Then("user should verify the Adults size should not greater than NINE")
	public void user_should_verify_the_Adults_size_should_not_greater_than_NINE() {
	    implicitWaiting();
	    Assert.assertEquals("9", jfc.getAdultPassengerSize().getText());
	    closeBrowser();
	}
}
