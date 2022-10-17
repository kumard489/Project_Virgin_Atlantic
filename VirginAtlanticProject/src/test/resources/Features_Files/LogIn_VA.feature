@login
Feature: Check whether login funtionality is working fine
  
  Scenario: Check whether the login funtionality is working with valid username and valid password
    Given user opens the Browser and then launching the URL
    When user clicks the login link and it will navigate to login page
    And user fills valid username and valid password in respective textbox
     |username  |password  |
     |1089410201|Zasdf(0987|
     |1234354543|Adsfa@4214|
    And user clicks the login button
    Then verifying user should navigate to homepage

 
