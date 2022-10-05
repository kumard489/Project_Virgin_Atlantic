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

	// index0=round trip, index1=travel class, index2=passenger add&remove,
	// index3=voucher
	@FindBy(xpath = "//i[text()='expand_more']")
	private List<WebElement> roundtripPassengerVoucher;

	// FTNY=Flight To New York
	@FindBy(xpath = "//input[@id='flights-booking-id-1-input']")
	private WebElement fromFTNYTxt;

	@FindBy(xpath = "//input[@id='flights-booking-id-2-input']")
	private WebElement toFTNYTxt;

	@FindBy(xpath = "//input[@id='flights-booking-id-3']")
	private WebElement departureDate;

	@FindBy(xpath = "//input[@id='flights-booking-id-4']")
	private WebElement returnDate;

	@FindBy(xpath = "//button[text()='Book now']")
	private WebElement bookNowBtn;

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

}
