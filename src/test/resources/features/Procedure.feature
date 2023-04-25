Feature: Procedure Steps

  @Create_Procedure 
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
      
      
  @Verify_Procedure @Create_Procedure
  Scenario Outline: Verify MET_TEAM Procedure
    Given Login With valid credentials
    When Click Maintenance and click Procedures 
    Then "Find Procedure" window opens
    And Find "Procedure Name" by entering Procedure Name and click Find button
    Then Click OK button and "Edit Procedure" window opens
    And Verify Procedure_Name is Procedure_Name
    Then Verify Number is "<Number>"
    And Verify Version is "<Version>"
    Then Verify Procedure_Date is "<Procedure_Date>"
    And Verify Data_Sheet is "<Data_Sheet>"
    Then Verify Authority is "<Authority>"
    And Verify Revision is "<Revision>"
    Then Verify Revision_Date is "<Revision_Date>"
    And Verify Service_Type is "<Service_Type>"
    Then Verify Category is "<Category>"

    Examples: 
      | Number | Version | Procedure_Date | Data_Sheet                                | Authority | Revision | Revision_Date | Service_Type | Category |
      | 12345  | V.01    | 03/27/2023     | Test of PXE with 3 Test points (Pass).pxe | Default   | Rev.03   | 03/30/2023    | Calibration  | MET/CAL  |
