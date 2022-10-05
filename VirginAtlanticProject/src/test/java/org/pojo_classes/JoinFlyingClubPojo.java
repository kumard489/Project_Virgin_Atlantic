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

	// Getters
	public WebElement getJoinFlyingClubLabel() {
		return joinFlyingClubLabel;
	}

}
