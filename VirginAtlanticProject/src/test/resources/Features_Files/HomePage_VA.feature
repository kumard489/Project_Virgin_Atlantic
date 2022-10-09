@homepage
Feature: Check whether few moudles in homepage are navigate to correct page


  
  
  Scenario Outline: check whether MyBooking page is avalible
    Given user opens the Browser and then launching the URL "<url>"
    
    Examples:
    |url                                 |
    |https://www.virginatlantic.com/in/en|
    
  Scenario: check whether MyBooking page is avalible
    #Given user opens the Browser and then launching the URL
    When user clicks MyBooking link
    Then user should navigate to MyBooking page
    
  Scenario: check whether FlightStatus page is avalible
    #Given user opens the Browser and then launching the URL
    When user clicks FlightStatus link
    Then user should navigate to FlightStatus page

  Scenario: check whether JoinFlyingClub page is avalible
    #Given user opens the Browser and then launching the URL
    When user clicks JoinFlyingClub link
    Then user should navigate to JoinFlyingClub page
  
  Scenario: check whether LogIn page is avalible
    #Given user opens the Browser and then launching the URL
    When user clicks LogIn link
    Then user should navigate to LogIn page

  Scenario: check whether Africa page is avalible
    #Given user opens the Browser and then launching the URL
    When user drags the mouse over DestinationAndOnBoard dropdown and clicks Africa link
    Then user should navigate to Africa page
  
  

 