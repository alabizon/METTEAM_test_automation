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
      
  @Verify_Facility @Create_Facility
  Scenario Outline: Verify MET_TEAM Facility
    Given Login With valid credentials
    When Click Maintenance and click Facilities 
    Then "Find Facility" window opens
    And Find "Facility Name" by entering Facility Name and click Find button
    Then Click OK button and "Edit Facility" window opens
    And Verify Facility_Name is Facility Name
    Then Verify Tax Number is "<Tax_Number>"
    And Verify Facility Number is "<Facility_Num>"
    Then Verify Fed Number is "<Fed_Num>"
    And Verify Industry Code is "<Industry_Code>"
    Then Verify Account Number is "<Acc_Num>"
    And Verify Company Code is "<Company_Code>"
    Then Verify Shipping Method is "<Ship_Method>"
    And Verify Facility Web Site is "<Web_Site>"
    Then Verify Recall Rule is "<Recall_Rule>"
    And Verify Tax Rate is "<Tax_Rate>"
    Then Verify Hourly Rate is "<Hourly_Rate>"
    And Verify Discount is "<Discount>"
    Then Verify Expedite Fee is "<Expedite_Fee>"
    And Verify Customet checkbox is checked
    Then Verify Inspect All checkbox is checked
    And Verify Manufacturer checkbox is checked
    Then Verify Sub Contractor checkbox is checked
    And Verify Lab checkbox is checked
    Then Verify Optional 1 checkbox is checked

    Examples: 
      | Tax_Number   | Facility_Num | Fed_Num | Industry_Code | Acc_Num | Company_Code | Ship_Method | Web_Site           | Recall_Rule  | Tax_Rate | Hourly_Rate | Discount | Expedite_Fee |
      | 33333        | 12345        | 44444   | 66666         | 77777   | 88888        | FedEx       | www.MyFacility.com | End of Month | 9.8      | 50.50       | 5        | 75.00        |
      
      
   @Create_Many_Facilities 
  Scenario: Create MET_TEAM Facility
    Given Login With valid credentials
    When Click Maintenance and click Facilities 
    Then "Find Facility" window is open and click Add button
    Then Enter Customer2 Facility Name and check Customer checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Customer3 Facility Name and check Customer checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Manufacturer Facility Name and check Manufacturer checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Sub Contractor Facility Name and check Sub Contractor checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Lab1 Facility Name and check Customer checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Lab2 Facility Name and check Customer checkbox
    And Click Save facility button
    Then Click Add button
    Then Enter Lab3 Facility Name and check Customer checkbox
    And Click Save facility button
    And Click Close button
    
      