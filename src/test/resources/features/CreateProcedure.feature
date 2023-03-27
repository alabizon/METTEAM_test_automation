Feature: Create Work Order Steps

  @Regression @Alex
  Scenario Outline: MetTeam Procedure
    Given Login With valid credentials
    When Click Maintenance and click Procedures
    Then "Find Procedure" window is open and click Add button
    And "Add Procedure" window is opened and enter Procedure Name
    Then Click ellipsis button next to the Data Sheet "Attach Data Sheet" window is open
    And Select "Procedure" for the "Search Value" and click Find button
    Then Click OK button
    And Click ellipsis button next to Category (proc) "Select Category (Proc)" window is open 
    Then Select specific "<Category>" from the grid and click OK button
    And Click Save button and click Close button

    Examples: 
      | Category | 
      |  MET/CAL | 