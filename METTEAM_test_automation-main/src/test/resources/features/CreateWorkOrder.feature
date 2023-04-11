Feature: Create Work Order Steps

  @Progression @Denys
  Scenario Outline: MetTeam work Order
    Given Login With valid credentials
    When Click on Maintenance and click on the Asset
    Then Find Asset "Find Asset" is open and click Add button
    And "Add Asset" window is opened and click ellipsis button next to the Customer
    Then "Find Facility" window is open verify title and click Find button
    And find specific "<Customer>" from the grid and click OK button
    Then Click ellipsis button next to the Type Description "Find Type" window is open
    And Click Find button then find "<Specific type>" from the grid and click OK button
    Then click yes on the "Update all Asset data with current Type data?" window
    Then click Save button and click Receive Asset button
    And "Edit Work Order" window is opened verify title and click Add Result button
    And Open Chromidium

    Examples: 
      | Specific type | Customer          |
      |            11 | My First Customer |
