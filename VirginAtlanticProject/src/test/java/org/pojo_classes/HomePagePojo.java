package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class HomePagePojo extends BaseClass {

	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")
	private WebElement cookiesHomePage;

	@FindBy(xpath = "//img[@alt='Virgin Atlantic']")
	private WebElement vigirinAtlantic;

	@FindBy(xpath = "//a[@id='headPrimary1']")
	private WebElement book;

	@FindBy(xpath = "//a[@id='headPrimary2']")
	private WebElement myBooking;

	@FindBy(xpath = "//a[@id='headPrimary3']")
	private WebElement checkIn;

	@FindBy(xpath = "//a[@id='headPrimary4']")
	private WebElement flightStatus;

	@FindBy(xpath = "//a[@id='headSectab1']")
	private WebElement destinationsAndOnBoard;

	@FindBy(xpath = "//a[@id='headSectab2']")
	private WebElement help;

	@FindBy(xpath = "//a[@id='headSectab3']")
	private WebElement flyingClub;

	@FindBy(xpath = "//a[text()=' Join Flying Club ']")
	private WebElement joinFlyingClub;

	@FindBy(xpath = "//button[text()=' Log in ']")
	private WebElement logIn;

	@FindBy(xpath = "//span[text()='Search']//following::ngc-search")
	private WebElement search;

	@FindBy(xpath = "//a[@data-analytics-id='1234567890']")
	private WebElement findFlight;

	@FindBy(xpath = "//u[text()='Book with confidence']")
	private WebElement bookWithConfidence;

	@FindBy(xpath = "//u[text()='Refund policy']")
	private WebElement refundPolicy;

	@FindBy(xpath = "//u[text()='Travel advice']")
	private WebElement travelAdvice;

	@FindBy(xpath = "//u[text()='Testing for travel']")
	private WebElement testingForTravel;

	@FindBy(xpath = "//a[contains(@href,'flights-from-delhi')]")
	private WebElement flightsFromDelhi;

	@FindBy(xpath = "//a[contains(@href,'flights-from-mumbai')]")
	private WebElement flightsFromMumbai;

	@FindBy(xpath = "//a[contains(@href,'flights-from-goa')]")
	private WebElement flightsFromGoa;

	@FindBy(xpath = "//a[contains(@href,'flights-from-ahmedabad')]")
	private WebElement flightsFromAhmedabad;

	@FindBy(xpath = "//a[contains(@href,'flights-from-amritsar')]")
	private WebElement flightsFromAmritsar;

	@FindBy(xpath = "//a[contains(@href,'flights-from-kolkata')]")
	private WebElement flightsFromKolkata;

	@FindBy(xpath = "//a[contains(@href,'usa/texas/austin.html')]")
	private WebElement Austin;

	@FindBy(xpath = "//a[contains(@href,'flights-to-brazil')]")
	private WebElement brazil;

	@FindBy(xpath = "//a[contains(@href,'flights-to-new-york')]")
	private WebElement flightsToNewYork;

	@FindBy(xpath = "//a[contains(@href,'flights-to-los-angeles')]")
	private WebElement flightsToLosAngeles;

	@FindBy(xpath = "//a[contains(@href,'flights-to-boston')]")
	private WebElement flightsToBoston;

	@FindBy(xpath = "//a[contains(@href,'premium-cabin-and-seats.html')]")
	private WebElement flyPremiumEconomy;

	@FindBy(xpath = "//a[contains(@href,'upper-class-cabin-and-seats.html')]")
	private WebElement discoverUpperClass;

	@FindBy(xpath = "//a[contains(@href,'contact-us.html')]")
	private WebElement allContactDetails;

	@FindBy(xpath = "//a[contains(@href,'student-offer.html')]")
	private WebElement ourBestStudentOffer;

	@FindBy(xpath = "//a[contains(@href,'youre-in-safe-hands.html')]")
	private WebElement youAreInSafaHands;

	@FindBy(xpath = "//a[contains(@href,'coronavirus/travel-restrictions.html')]")
	private WebElement COVID19TravelAdvice;

	@FindBy(xpath = "//a[contains(@href,'inflight-entertainment.html')]")
	private WebElement inflightEntertainment;

	@FindBy(xpath = "//a[contains(@href,'baggage.html')]")
	private WebElement baggageUnpacked;

	@FindBy(xpath = "//a[contains(@href,'flying-club.html')]")
	private WebElement flyingClubAtFlyingWithUs;

	@FindBy(xpath = "//div[text()='Feedback']")
	private WebElement feedback;

	@FindBy(xpath = "//label[@for='departureAirportLink']")
	private WebElement checkInLabel;

	@FindBy(xpath = "//h1[@id='herosubtitle']")
	private WebElement africaLabel;
	
	@FindBy(xpath="//h3[text()='Flights to New York']")
	private WebElement flightToNewYorkLabel;

	// Getters
	public WebElement getVigirinAtlantic() {
		return vigirinAtlantic;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getMyBooking() {
		return myBooking;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getFlightStatus() {
		return flightStatus;
	}

	public WebElement getDestinationsAndOnBoard() {
		return destinationsAndOnBoard;
	}

	public WebElement getHelp() {
		return help;
	}

	public WebElement getFlyingClub() {
		return flyingClub;
	}

	public WebElement getJoinFlyingClub() {
		return joinFlyingClub;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFindFlight() {
		return findFlight;
	}

	public WebElement getBookWithConfidence() {
		return bookWithConfidence;
	}

	public WebElement getRefundPolicy() {
		return refundPolicy;
	}

	public WebElement getTravelAdvice() {
		return travelAdvice;
	}

	public WebElement getTestingForTravel() {
		return testingForTravel;
	}

	public WebElement getFlightsFromDelhi() {
		return flightsFromDelhi;
	}

	public WebElement getFlightsFromMumbai() {
		return flightsFromMumbai;
	}

	public WebElement getFlightsFromGoa() {
		return flightsFromGoa;
	}

	public WebElement getFlightsFromAhmedabad() {
		return flightsFromAhmedabad;
	}

	public WebElement getFlightsFromAmritsar() {
		return flightsFromAmritsar;
	}

	public WebElement getFlightsFromKolkata() {
		return flightsFromKolkata;
	}

	public WebElement getAustin() {
		return Austin;
	}

	public WebElement getBrazil() {
		return brazil;
	}

	public WebElement getFlightsToNewYork() {
		return flightsToNewYork;
	}

	public WebElement getFlightsToLosAngeles() {
		return flightsToLosAngeles;
	}

	public WebElement getFlightsToBoston() {
		return flightsToBoston;
	}

	public WebElement getFlyPremiumEconomy() {
		return flyPremiumEconomy;
	}

	public WebElement getDiscoverUpperClass() {
		return discoverUpperClass;
	}

	public WebElement getAllContactDetails() {
		return allContactDetails;
	}

	public WebElement getOurBestStudentOffer() {
		return ourBestStudentOffer;
	}

	public WebElement getYouAreInSafaHands() {
		return youAreInSafaHands;
	}

	public WebElement getCOVID19TravelAdvice() {
		return COVID19TravelAdvice;
	}

	public WebElement getInflightEntertainment() {
		return inflightEntertainment;
	}

	public WebElement getBaggageUnpacked() {
		return baggageUnpacked;
	}

	public WebElement getFlyingClubAtFlyingWithUs() {
		return flyingClubAtFlyingWithUs;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getCheckInLabel() {
		return checkInLabel;
	}

	public WebElement getAfricaLabel() {
		return africaLabel;
	}

	public WebElement getCookiesHomePage() {
		return cookiesHomePage;
	}

	public WebElement getFlightToNewYorkLabel() {
		return flightToNewYorkLabel;
	}


}
