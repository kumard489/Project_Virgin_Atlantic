@book
Feature: check whether the funtionality of home is working fine

 
  Scenario: check whether all the airport names are available in from text box
    Given user opens the Browser and then launching the URL
    When user clicks From text box
    And user clicks FullAirportList 
    And user clicks ALPHABETICALLY
    Then user should validate and verify all the airport names are avalible
    

  
  Scenario: check whether Adults maximum size is Nine  
    #Given user opens the Browser and then launching the URL
    When user clicks passengers option box
    And user clicks the Adults Plus botton for NINE times
    Then user should verify the Adults size should not greater than NINE

    
