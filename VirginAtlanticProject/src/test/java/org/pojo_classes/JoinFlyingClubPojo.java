package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinFlyingClubPojo extends FlightToNewYorkPojo {

	public JoinFlyingClubPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//h3[text()='About you']")
	private WebElement joinFlyingClubLabel;

	@FindBy(xpath = "//select[@id='phoneCountryCode']")
	private WebElement phoneCountryCode;

	@FindBy(xpath = "//button[text()='Create my account']")
	private WebElement createMyAccount;

	@FindBy(xpath = "//h3[text()='Accept and create account']")
	private WebElement AcceptAndCreateAccountlabel;

	// Getters
	public WebElement getJoinFlyingClubLabel() {
		return joinFlyingClubLabel;
	}

	public WebElement getPhoneCountryCode() {
		return phoneCountryCode;
	}

	public WebElement getCreateMyAccount() {
		return createMyAccount;
	}

	public WebElement getAcceptAndCreateAccountlabel() {
		return AcceptAndCreateAccountlabel;
	}

}
