Feature: Assign Procedure to a Type Steps

  @AssignProcedureToType
  Scenario Outline: Assign Procedure to Type
    Given Login With valid credentials
    When Click Maintenance and click Type
    Then "Find Type" window is open
    And Find "Description" by entering Description and click Find button
    Then click OK button 
    And Click Add Procedure Link button and "Add Type Default Procedure" window opens
    Then click Refresh button
    And Click ellipsis button next to Procedure Name field
    Then "Find Procedure" window is open
    And Find "Procedure Name" by entering Procedure Name into search criteria and click Find button
    Then Click OK button
    And Enter intrval "<Interval>"
    Then Click Save button
    And Click Close button on the Edit Types screen
    

    Examples: 
      | Interval  |  |
      | 12        |  |  
