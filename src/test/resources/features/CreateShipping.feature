Feature: Create Shipping Steps

  @Contact @Alex 
  Scenario Outline: Create MET/TEAM Shipping
    Given Login With valid credentials
    When Click Workflow and click Shipping
    Then "Find Shipment" window opens and click Add button
    And "Add Shipment" window is open
    Then Click ellipsis button next to "Ship To" button and "Find Facility Address" window opens
    And Enter "<Search_Value>" and click Find button and click OK button
    Then Click Yes on the Attention window
    And Enter Shipment name and enter Location
    
    
    Examples: 
      | Search_Value      |  |
      | My First Customer |  |
