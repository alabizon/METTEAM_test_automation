Feature: Facility Steps

  @Create_Facility 
  Scenario Outline: Create MET_TEAM Facility
    Given Login With valid credentials
    When Click Maintenance and click Facilities 
    Then "Find Facility" window is open and click Add button
    #And Click Add button and "Add Facility" window is open
    Then Enter Facility Name and enter Tax Number and enter Facility Number and enter Fed Number
    And Enter Industry Code and enter Account Number and enter Company Code and enter Web Site
    Then Select "<Shipping_Method>" for the Shipping Method and select "<Recall_Rule>" Recall Rule
    And Check Manufacturer checkbox and check Sub Contractor checkbox
    Then Verify "Inspect All" checkbox is disabled
    And Click Lab checkbox
    Then Verify "Inspect All" checkbox is enabled
    And Verify "No Tax" checkbox is disabled
    Then Verify "Tax Rate" field is disabled
    And Click Customer checkbox
    Then Verify "No Tax" checkbox is enabled
    And Verify "Tax Rate" field is enabled
    Then Check Optional1 checkbox and check Inspect All checkbox and check No Tax checkbox
    And Verify "Tax Rate" field is disabled
    Then Uncheck No Tax checkbox
    And Enter Tax Rate "<Tax_Rate>" 
    Then Enter Hourly Rate "<Hourly_Rate>" 
    And Enter Discount "<Discount>" 
    Then Enter Expedite Fee "<Expedite_Fee>"
    Then Click Save buttn and click Close button

    Examples: 
      | Shipping_Method | Recall_Rule  | Tax_Rate | Hourly_Rate | Discount | Expedite_Fee |
      | FedEx           | End of Month | 9.8      | 50.50       | 5        | 75.00        |
      
  @Verify_Facility
  Scenario Outline: Verify MET_TEAM Facility
    Given Login With valid credentials
    When Click Maintenance and click Facilities 
    Then "Find Facility" window opens
    And Find "Number" by entering Accreditation Code and click Find button
    Then Click OK button and "Edit Facility" window opens
    And Verify Code is Code
    Then Verify Type is "<Type>"
    And Verify Description is "<Description>"
    Then Verify Start_Date is "<Start_Date>"
    And Verify End_Date is "<End_Date>"

    Examples: 
      | Type   | Description | Start_Date | End_Date   |
      | 22     | Auto        | 07/15/2022 | 11/21/2022 |
      
      
      
      