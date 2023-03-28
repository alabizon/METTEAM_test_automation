Feature: Create Procedure Steps

  @Regression @Alex
  Scenario Outline: MetTeam Procedure
    Given Login With valid credentials
    When Click Maintenance and click Procedures
    Then "Find Procedure" window is open and click Add button
    And "Add Procedure" window is open and enter Procedure Name
    Then Click ellipsis button next to the Data Sheet "Attach Data Sheet" window is open
    And Select "<Search_Value>" for the "Search Value" and click Find button
    #Then Click OK button
    #And Click ellipsis button next to Category (proc) "Select Category (Proc)" window is open 
    #Then Select specific "<Category>" from the grid and click OK button
    #And Click Save button and click Close button

    Examples: 
      | Search_Value | Category | 
      | Procedure    | MET/CAL  | 