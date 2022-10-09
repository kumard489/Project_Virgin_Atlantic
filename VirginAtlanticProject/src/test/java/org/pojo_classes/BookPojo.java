package org.pojo_classes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPojo extends HomePagePojo {

	public BookPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//span[text()='From']")
	private WebElement from;

	@FindBy(xpath = "//span[text()='To']")
	private WebElement to;

	@FindBy(xpath = "//input[@id='search_input']")
	private WebElement originSearch;

	@FindBy(xpath = "//a[text()=' Full Airport List ']")
	private WebElement fullAirportList;

	@FindBy(xpath = "//span[text()='US & CANADA']")
	private WebElement USAndCanada;

	@FindBy(xpath = "//li[@class='country-list ng-star-inserted']")
	private List<WebElement> USAndCanadaStates;

	@FindBy(xpath = "//span[text()='ALPHABETICALLY']")
	private WebElement alphabetically;

	@FindBy(xpath = "//li[@class='country-list airport-list alphabeticaly ng-star-inserted']")
	private List<WebElement> airportsAlphabetically;

	@FindBy(xpath = "//a[@id='country-tab-link']")
	private WebElement restOfWorld;

	@FindBy(xpath = "//li[@class='country-list ng-star-inserted']")
	private List<WebElement> restOfWorldcountries;

	@FindBy(xpath = "//button[@class='full-list-close float-right circle-outline icon-moreoptionsclose']")
	private WebElement closeAirPortList;

	@FindBy(xpath = "//select[@name='selectTripType']")
	private WebElement selectTripType;

	@FindBy(xpath = "//div[@class='calDispValueCont icon-Calendar  ']")
	private WebElement Calendar;

	@FindBy(xpath = "//a[@id='passenger']")
	private WebElement passenger;

	@FindBy(xpath = "//span[text()='Add Adults passenger']")
	private WebElement addAdultsPassenger;

	@FindBy(xpath = "(//div[@class='paxNum'])[1]")
	private WebElement adultPassengerSize;

	@FindBy(xpath = "//span[text()='Add Young adults passenger']")
	private WebElement addYoungAdultsPassenger;

	@FindBy(xpath = "//span[text()='Add Children passenger']")
	private WebElement addChildrenPassenger;

	@FindBy(xpath = "//span[text()='Add Lap infants passenger']")
	private WebElement addLapInfantsPassenger;

	@FindBy(xpath = "//span[text()=' Remove Adults passenger ']")
	private WebElement removeAdultsPassenger;

	@FindBy(xpath = "//span[text()=' Remove Young adults passenger ']")
	private WebElement removeYoungAdultsPassenger;

	@FindBy(xpath = "//span[text()=' Remove Children passenger ']")
	private WebElement removeChildrenPassenger;

	@FindBy(xpath = "//span[text()=' Remove Lap infants passenger ']")
	private WebElement removeLapInfantsPassenger;

	@FindBy(xpath = "//button[@id='btn-book-submit']")
	private WebElement bookSubmit;

	@FindBy(xpath = "//input[@name='refundableFlightsOnly']")
	private WebElement showFlexibleTickets;

	@FindBy(xpath = "//input[@name='chkFlexDate']")
	private WebElement showFlexibleDates;

	// Getter
	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getOriginSearch() {
		return originSearch;
	}

	public WebElement getFullAirportList() {
		return fullAirportList;
	}

	public WebElement getUSAndCanada() {
		return USAndCanada;
	}

	public List<WebElement> getUSAndCanadaStates() {
		return USAndCanadaStates;
	}

	public WebElement getAlphabetically() {
		return alphabetically;
	}

	public List<WebElement> getAirportsAlphabetically() {
		return airportsAlphabetically;
	}

	public WebElement getRestOfWorld() {
		return restOfWorld;
	}

	public List<WebElement> getRestOfWorldcountries() {
		return restOfWorldcountries;
	}

	public WebElement getSelectTripType() {
		return selectTripType;
	}

	public WebElement getCalendar() {
		return Calendar;
	}

	public WebElement getPassenger() {
		return passenger;
	}

	public WebElement getAddAdultsPassenger() {
		return addAdultsPassenger;
	}

	public WebElement getAddYoungAdultsPassenger() {
		return addYoungAdultsPassenger;
	}

	public WebElement getAddChildrenPassenger() {
		return addChildrenPassenger;
	}

	public WebElement getAddLapInfantsPassenger() {
		return addLapInfantsPassenger;
	}

	public WebElement getRemoveAdultsPassenger() {
		return removeAdultsPassenger;
	}

	public WebElement getRemoveYoungAdultsPassenger() {
		return removeYoungAdultsPassenger;
	}

	public WebElement getRemoveChildrenPassenger() {
		return removeChildrenPassenger;
	}

	public WebElement getRemoveLapInfantsPassenger() {
		return removeLapInfantsPassenger;
	}

	public WebElement getBookSubmit() {
		return bookSubmit;
	}

	public WebElement getShowFlexibleTickets() {
		return showFlexibleTickets;
	}

	public WebElement getShowFlexibleDates() {
		return showFlexibleDates;
	}

	public WebElement getCloseAirPortList() {
		return closeAirPortList;
	}

	public WebElement getAdultPassengerSize() {
		return adultPassengerSize;
	}

}
