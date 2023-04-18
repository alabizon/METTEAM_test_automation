Feature: Create Accreditation Steps

  @Create_Accreditation 
  Scenario Outline: Create MET_TEAM Accreditation
    Given Login With valid credentials
    When Click Maintenance and click Accreditations 
    Then "Find Accreditation" window opens
    And Click Add button and "Add Accreditation" window is open
    Then Enter Code and enter Type and enter Description
    And Enter Start_Date and enter End_Date
    Then Click Save buttn and click Close button

    Examples: 
      |    |
      |    |
      
  @Verify_Accreditation 
  Scenario Outline: Verify MET_TEAM Accreditation
    #Given Login With valid credentials
    #When Click Maintenance and click Accreditations 
    #Then "Find Accreditation" window opens
    #And Enter search value for the Accreditation Code and click Find button
    #Then Click OK button and "Edit Accreditation" window opens
    #And Verify Code is Code
    #Then Verify Type is "<Type>"
    #And Verify Description is "<Description>"
    #Then Verify Start_Date is "<Start_Date>"
    #And Verify End_Date is "<End_Date>"

    Examples: 
      | Type   | Description | Start_Date | End_Date   |
      | 22     | Auto        | 07/15/2022 | 11/21/2022 |