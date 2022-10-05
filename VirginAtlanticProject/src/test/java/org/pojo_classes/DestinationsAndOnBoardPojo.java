package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestinationsAndOnBoardPojo extends FlightStatusPojo {

	public DestinationsAndOnBoardPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//a[contains(@href,'destinations/usa.html')]")
	private WebElement usa;

	@FindBy(xpath = "//a[contains(@href,'destinations/caribbean.html')]")
	private WebElement caribbean;

	@FindBy(xpath = "//a[contains(@href,'destinations/uk.html')]")
	private WebElement uk;

	@FindBy(xpath = "//a[contains(@href,'destinations/africa.html')]")
	private WebElement africa;

	@FindBy(xpath = "//a[contains(@href,'destinations/asia.html')]")
	private WebElement asia;

	@FindBy(xpath = "//a[contains(@href,'destinations/route-map.html')]")
	private WebElement destinationMap;

	@FindBy(xpath = "//a[contains(@href,'viewFlightSchedulesSetup.action')]")
	private WebElement fligthShedules;

	@FindBy(xpath = "//a[contains(@href,'destinations.html')]")
	private WebElement exploreAllDestinations;

	// Getters
	public WebElement getUsa() {
		return usa;
	}

	public WebElement getCaribbean() {
		return caribbean;
	}

	public WebElement getUk() {
		return uk;
	}

	public WebElement getAfrica() {
		return africa;
	}

	public WebElement getAsia() {
		return asia;
	}

	public WebElement getDestinationMap() {
		return destinationMap;
	}

	public WebElement getFligthShedules() {
		return fligthShedules;
	}

	public WebElement getExploreAllDestinations() {
		return exploreAllDestinations;
	}

}
