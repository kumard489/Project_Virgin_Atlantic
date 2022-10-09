@joinflyingclub
Feature: check whether the funtionality of Join Flying Club is working fine

 
  Scenario: Check whether all the country codes are available in PhoneCountryCode dropdown
    Given user opens the Browser and then launching the URL
   
  Scenario: Check whether all the country codes are available in PhoneCountryCode dropdown  
    When user clicks the JoinFlyingclub link on homepage and it will navigate to respective page
    And user clicks the PhoneCountryCode dropdown
    Then user should verify all the country codes are available in that dropdown
    
  Scenario: Check whether createMyAccount button is disable when the above details are not filled
    #Given user opens the Browser and then launching the URL
    #When user clicks the JoinFlyingclub link on homepage and it will navigate to respective page
    Then user should verify the createMyAccount button is disable

