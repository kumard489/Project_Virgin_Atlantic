package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class FlightStatusPojo extends MyBookingPojo {

	public FlightStatusPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//div[@id='input_departureDate_1']")
	private WebElement calenderFlightStatus;

	@FindBy(xpath = "//input[@id='flightNo']")
	private WebElement flightNoTxt;

	@FindBy(xpath = "//a[@id='departcitylink']")
	private WebElement fromFlightStatus;

	@FindBy(xpath = "//a[@id='arrivalcitylink']")
	private WebElement toFlightStatus;

	@FindBy(xpath = "Submit")
	private WebElement submitFlightStatus;

	@FindBy(xpath = "//label[@for='searchBydate']")
	private WebElement flightStatusLabel;

	// Getters
	public WebElement getCalenderFlightStatus() {
		return calenderFlightStatus;
	}

	public WebElement getFlightNoTxt() {
		return flightNoTxt;
	}

	public WebElement getFromFlightStatus() {
		return fromFlightStatus;
	}

	public WebElement getToFlightStatus() {
		return toFlightStatus;
	}

	public WebElement getSubmitFlightStatus() {
		return submitFlightStatus;
	}

	public WebElement getFlightStatusLabel() {
		return flightStatusLabel;
	}

}
