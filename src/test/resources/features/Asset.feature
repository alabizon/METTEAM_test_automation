Feature: Asset Steps

  @Create_Asset 
  Scenario Outline: Create MET_TEAM Asset
    Given Login With valid credentials
    When Click Maintenance and click Assets
    Then "Find Asset" window is open and click Add button
    And "Add Asset" window is open
    Then Enter ID 
    And Enter Barcode 
    Then Enter Serial_Number
    And Click ellipsis button next to Customer field
    Then "Find Facility" window is open
    And Enter "<Customer>" and click Find button
    Then Click OK button
    And Click ellipsis button next to Department field
    Then "Select Department" window is open
    And Enter "<Department>" to search criteria and click Find button
    Then Click OK button  
    And Click ellipsis button next to Parent field
    Then "Find Asset" window is open
    And Enter "<Barcode>" to the search criteria and click Find button
    Then Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox
    And Verify Standard_Type is disabled
    Then Click Standard checkbox and verify Standard_Type is enabled
    And Click ellipsis button next to Type_Description field
    Then "Find Type" window is open
    And Find "Description" by entering Type_Description and click Find button
    Then Click OK button
    And Click Yes button on the alert window
    Then Click Save button and verify Attention is displayed
    And Click OK button on the Attention window 
    Then Select "<Standard_Type>"    
    And Enter "<Physical_Location>" and enter "<Purchase_Date>" and enter "<In_Service_Date>" 
    Then Enter "<Warranty_Date>" date and enter "<Date_Inventoried>" date
    And Click ellipsis button next to Inventoried_By field
    Then "Find User" window is open
    And Find "Administrator" by entering Last Name and then click Find button
    Then Click OK button  
    And Enter group "<Group>" and enter "<Assigned_Contact>"
    Then Enter Assigned Number "<Assigned_Number>" and enter "<Assigned_Date>" and enter "<Optional_1>"
    And Click Save buttn and click Close button

    Examples: 
      | Customer          | Department         | Barcode   | Standard_Type | Physical_Location    | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | My First Customer | Quality Department | SAMPLE-10 | Primary       | TestPhysicalLocation | 04/24/2023    | 04/26/2023      | 04/24/2024    | 04/25/2023       | TestGroup | TestAssignedCont | 00001           | 04/26/2023   | Test_Opt   |
      
  @Verify_Asset 
  Scenario Outline: Verify MET_TEAM Asset
    Given Login With valid credentials
    When Click Maintenance and click Asset 
    Then "Find Asset" window opens
    And Find "Barcode" by entering Barcode and click Find button
    Then Click OK button and "Edit Asset" window opens
    And Verify Code is Code
    Then Verify Type is "<Type>"
    And Verify Description is "<Description>"
    Then Verify Start_Date is "<Start_Date>"
    And Verify End_Date is "<End_Date>"

    Examples: 
      | Type   | Description | Start_Date | End_Date   |
      | 22     | Auto        | 07/15/2022 | 11/21/2022 |
      
      
      
      