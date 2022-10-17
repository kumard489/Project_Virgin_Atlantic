package org.step_definition;

import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class FlightToNewYork_SD extends BaseClass {

	JoinFlyingClubPojo jfc = new JoinFlyingClubPojo();
	
	/*@Given("user opens the Browser and then launchingg the URL")
	public void user_opens_the_Browser_and_then_launchingg_the_URL() {
	   launchChrome();
	   chromeObject();
	   winMax();
	   implicitWaiting();
	   ChromeOptions co=new ChromeOptions();
	   co.addArguments("--disable-notifications");
	   launchUrl("https://www.virginatlantic.com/in/en");
	}*/

	@When("user sroll down and clicks ShowFlightDeals link of FightToNewYork")
	public void user_sroll_down_and_clicks_ShowFlightDeals_link_of_FightToNewYork() {
		implicitWaiting();
		jfc.getCookiesHomePage().click();
		jsScroll(jfc.getFlightToNewYorkLabel());
		jsClick(jfc.getFlightsToNewYork());
	}

	@When("user fills Passengers dropdown, From textbox, To textbox, Dates calender")
	public void user_fills_Passengers_dropdown_From_textbox_To_textbox_Dates_calender() {
		implicitWaiting();
		jfc.getAccept().click();
		List<WebElement> passenger = jfc.getRoundtripPassengerVoucher();
		passenger.get(1).click();

		jfc.getTravelClass().click();
		keyPrsAndrlseRobot(KeyEvent.VK_DOWN);
		keyPrsAndrlseRobot(KeyEvent.VK_ENTER);
		jfc.getDoneBtn().click();

		moveCursorActions(jfc.getFromFTNYTxt());
		SingleClkActions(jfc.getFromFTNYTxt());
		txtBoxActions(jfc.getFromFTNYTxt(), "Heathrow");
		staticWait(3000);
		keyPrsAndrlseRobot(KeyEvent.VK_ENTER);
		
		Assert.assertTrue(jfc.getToFTNYTxt().getAttribute("value").contains("New York"));
		jfc.getDepartureDate().click();
		moveCursorActions(jfc.getNov15());
		SingleClkActions(jfc.getNov15());
		moveCursorActions(jfc.getNov22());
		SingleClkActions(jfc.getNov22());

	}

	@When("user clicks the BookNow button it will navigate to ticket booking page")
	public void user_clicks_the_BookNow_button_it_will_navigate_to_ticket_booking_page() {
		implicitWaiting();
		moveCursorActions(jfc.getBookNowBtn());
		SingleClkActions(jfc.getBookNowBtn());
		Assert.assertTrue(driver.getCurrentUrl().contains("search-results"));
	}

	@When("user clicks the ticket for outbound and return based on timing")
	public void user_clicks_the_ticket_for_outbound_and_return_based_on_timing() {
		
		staticWait(10000);
		jfc.getTicketone().click();
		staticWait(10000);
	    jfc.getTicketone().click();

	}

	@When("user reviews the tickets and then clicks  Next,ReviewAndPay button")
	public void user_reviews_the_tickets_and_then_clicks_Next_ReviewAndPay_button() {
		implicitWaiting();
		jfc.getNextReviewAndPay().click();
	}

	@When("user clicks ChooseSeat and then chooses the seat and then clicks SaveAndExit button")
	public void user_clicks_ChooseSeat_and_then_chooses_the_seat_and_then_clicks_SaveAndExit_button() {
		implicitWaiting();
		jfc.getChooseSeats().click();
		jfc.getNextFlight().click();
		jfc.getSaveAndExit().click();
	}

	@Then("user should verify and validate payment page is avalible")
	public void user_should_verify_and_validate_payment_page_is_avalible() {
		implicitWaiting();
		jfc.getCompeletePurchase().click();
		Assert.assertTrue(jfc.getCompeletePurchaseInvalidLabel().getText().contains("continue"));
	}

}
