Feature: Contract Pricing Steps

  @Create_Contract_Pricing 
  Scenario Outline: Create MET_TEAM Contract Pricing
    Given Login With valid credentials
    When Click Management and click Contract Pricing
    Then "Find Pricing" window is open and click Add button
    And "Add Contract Pricing" window is open
    Then Click elipsis bytton next to the Custoner field 
    And "Find Facility" window is open 
    Then Enter "<Customer>" into search criteria and click Find button
    And Click OK button
    Then Click ellipsis button next to the Working Facility field
    And "Find Facility" window is open
    Then Enter "<Working_Facility>" into Facility Name search criteria and click Find button
    And Click OK button
    Then Click ellipsis button next to Type Procedure Default field
    And "Find Type Procedure Default" window is open
    Then Find "Description" by entering Types Description and click Find button
    And Click OK button
    Then Enter Contract Pricing "<Effective_Date>"
    And Click Save button and save Contract Pricing
    Then Enter Pricing "<Expire_Date>" 
    And Click Save button and save Contract Pricing
    Then Enter "<Price>" to the Price field
    And Click Save button and click Close button to close Contract Pricing screen
     
    

    Examples: 
      | Customer          | Working_Facility | Effective_Date | Expire_Date | Price  |
      | My First Customer | My Lab           | 03/25/2022     | 04/25/2022  | 257.50 |
      
      
  @Verify_Contract_Pricing
  Scenario Outline: Verify MET_TEAM Contract Pricing
    Given Login With valid credentials
    When Click Maintenance and click Assets
    Then "Find Asset" window is open
    And Find "Barcode" by entering Barcode and click Find button
    Then Verify ID is ID
    And Verify Barcode is Barcode
    Then Verify Serial Number is "<Serial_Number>"
    And Verify Customer is  is "<Customer>"
    Then Verify Department is "<Department>"
    And Verify Parent is  is "<Barcode>"
    Then Verify Standard Type is "<Standard_Type>"
    And Verify Physical Location is  is "<Physical_Location>"
    Then Verify Disposition is "<Disposition>"
    And Verify Purchase Date is  is "<Purchase_Date>"
    Then Verify In Service Date is "<In_Service_Date>"
    And Verify Warranty Date is  is "<Warranty_Date>"
    Then Verify Date Inventoried is "<Date_Inventoried>"
    And Verify Inventoried By is  is "<Inventoried_By>"
    Then Verify Type Description is Type_Description
    And Verify Group is  is "<Group>"
    Then Verify Assigned Contact is "<Assigned_Contact>"
    And Verify Assigned Number is  is "<Assigned_Number>"
    Then Verify Assigned Date is "<Assigned_Date>"
    And Verify Optional_1 is  is "<Optional_1>"
    

    Examples: 
      | Serial_Number    | Customer          | Department         | Barcode   | Standard_Type | Physical_Location    | Disposition | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Inventoried_By       | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | TestSerialNumber | My First Customer | Quality Department | SAMPLE-10 | Primary       | TestPhysicalLocation | In Service  | 04/25/2023    | 04/25/2023      | 04/25/2023    | 04/25/2023       | System Administrator | TestGroup | TestAssignedCont | 00001           | 04/24/2023   | Test_Opt   |
      
      
      
      