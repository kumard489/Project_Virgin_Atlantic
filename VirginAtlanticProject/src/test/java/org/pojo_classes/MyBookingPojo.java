package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBookingPojo extends BookPojo {

	public MyBookingPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters

	@FindBy(xpath = "//select[@id='searchOption']")
	private WebElement bookingReference;

	@FindBy(xpath = "//input[@id='tab']")
	private WebElement bookingReferenceTxt;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstNameTxt;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement secNameTxt;

	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submitMyBooking;

	@FindBy(xpath = "//label[@id='searchOption-label']")
	private WebElement myBookingLabel;

	// Getters
	public WebElement getBookingReference() {
		return bookingReference;
	}

	public WebElement getBookingReferenceTxt() {
		return bookingReferenceTxt;
	}

	public WebElement getFirstNameTxt() {
		return firstNameTxt;
	}

	public WebElement getSecNameTxt() {
		return secNameTxt;
	}

	public WebElement getSubmitMyBooking() {
		return submitMyBooking;
	}

	public WebElement getMyBookingLabel() {
		return myBookingLabel;
	}

}
