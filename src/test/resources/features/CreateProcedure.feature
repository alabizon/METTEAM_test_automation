Feature: Create Procedure Steps

  @Procedure @Alex
  Scenario Outline: Create MET_TEAM Procedure
    Given Login With valid credentials
    When Click Maintenance and click Procedures
    Then "Find Procedure" window is open and click Add button
    And "Add Procedure" window is open and enter Procedure Name
    Then Enter Number and enter Version
    And Enter Revision
    Then Enter Procedure_Date and enter Revision_Date
    And Click ellipsis button next to the Data Sheet "Attach Data Sheet" window is open
    Then Select "<Search_Value>" for the search value and click Find button
    And Select "<Select_Results>" and click OK button
    Then Click ellipsis button next to the Category "Select Category" window is open 
    And Select "<Category>" from the grid and click OK button
    Then Click Save button and click Close button
    

    Examples: 
      | Search_Value | Category | Select_Results                            |
      | Procedure    | MET/CAL  | Test of PXE with 3 Test points (Pass).pxe |