@flighttonewyork
Feature: check whether the fuctionality of Fight To NewYork is working fine


  Scenario: check end to end functionality of booking ticket to Newyork
    Given user opens the Browser and then launching the URL
    When user sroll down and clicks ShowFlightDeals link of FightToNewYork
    And user fills Passengers dropdown, From textbox, To textbox, Dates calender
    And user clicks the BookNow button it will navigate to ticket booking page
    And user clicks the ticket for outbound and return based on timing
    And user reviews the tickets and then clicks  Next,ReviewAndPay button
    And user clicks ChooseSeat and then chooses the seat and then clicks SaveAndExit button 
    Then user should verify and validate payment page is avalible
    
    
    
  
