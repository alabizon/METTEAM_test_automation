Feature: Assign Procedure to a Type Steps

  @AssignProcedureToType
  Scenario Outline: Assign Procedure to Type
    Given Login With valid credentials
    When Click Maintenance and click Type
    Then "Find Type" window is open
    And Find "Description" by entering Description and click Find button
    Then Click Add Procedure Link button and "Add Type Default Procedure" window opens
    And Click ellipsis button next to Procedure Name field
    Then "Find Procedure" window is open
    And Find "Procedure Name" by entering Procedure Name and click Find button
    Then Click OK button
    And Enter "<Interval>"
    Then Click Save button
    And Click Close button on the Edit Types screen
    

    Examples: 
      | Interval  |  |
      | 12        |  |  
