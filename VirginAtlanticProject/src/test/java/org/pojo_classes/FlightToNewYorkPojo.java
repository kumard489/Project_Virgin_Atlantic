package org.pojo_classes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightToNewYorkPojo extends LogInPojo {

	public FlightToNewYorkPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters

	// index0=round trip, index1=travel class, index1=passenger add&remove,
	// index2=voucher
	@FindBy(xpath = "//i[text()='expand_more']")
	private List<WebElement> roundtripPassengerVoucher;

	@FindBy(xpath = "//button[text()='Done']")
	private WebElement doneBtn;

	// FTNY=Flight To New York
	@FindBy(xpath = "//input[@id='flights-booking-id-1-input']")
	private WebElement fromFTNYTxt;

	@FindBy(xpath = "//input[@id='flights-booking-id-2-input']")
	private WebElement toFTNYTxt;

	@FindBy(xpath = "//input[@id='flights-booking-id-3']")
	private WebElement departureDate;

	@FindBy(xpath = "//div[@data-att='day-2022-11-15']")
	private WebElement nov15;

	@FindBy(xpath = "//input[@id='flights-booking-id-4']")
	private WebElement returnDate;

	@FindBy(xpath = "//div[@data-att='day-2022-11-22']")
	private WebElement nov22;

	@FindBy(xpath = "//button[text()='Book now']")
	private WebElement bookNowBtn;

	@FindBy(xpath = "(//a[@class='farecellinkcontainer ng-star-inserted'])[1]")
	private WebElement ticketone;

	@FindBy(xpath = "//button[text()=' Next, review and pay ']")
	private WebElement NextReviewAndPay;

	@FindBy(xpath = "//button[text()=' Choose seats ']")
	private WebElement chooseSeats;

	@FindBy(xpath = "//button[@id='seat-24H']")
	private WebElement seat1;

	@FindBy(xpath = "//button[text()=' Next flight ']")
	private WebElement nextFlight;

	@FindBy(xpath = "//button[text()=' Save & exit ']")
	private WebElement saveAndExit;

	@FindBy(xpath = "//button[text()=' Complete purchase ']")
	private WebElement compeletePurchase;

	@FindBy(xpath = "//span[text()=' To continue, please check these ']")
	private WebElement compeletePurchaseInvalidLabel;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement accept;
	
	@FindBy(xpath="(//i[text()='expand_more'])[2]")
	private WebElement travelClass;



	// Setters
	public List<WebElement> getRoundtripPassengerVoucher() {
		return roundtripPassengerVoucher;
	}

	public WebElement getFromFTNYTxt() {
		return fromFTNYTxt;
	}

	public WebElement getToFTNYTxt() {
		return toFTNYTxt;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getNov15() {
		return nov15;
	}

	public WebElement getNov22() {
		return nov22;
	}

	public WebElement getDoneBtn() {
		return doneBtn;
	}

	public WebElement getTicketone() {
		return ticketone;
	}

	public WebElement getNextReviewAndPay() {
		return NextReviewAndPay;
	}

	public WebElement getChooseSeats() {
		return chooseSeats;
	}

	public WebElement getSeat1() {
		return seat1;
	}

	public WebElement getNextFlight() {
		return nextFlight;
	}

	public WebElement getSaveAndExit() {
		return saveAndExit;
	}

	public WebElement getCompeletePurchase() {
		return compeletePurchase;
	}

	public WebElement getCompeletePurchaseInvalidLabel() {
		return compeletePurchaseInvalidLabel;
	}
	
	public WebElement getAccept() {
		return accept;
	}
	
	public WebElement getTravelClass() {
		return travelClass;
	}

}
