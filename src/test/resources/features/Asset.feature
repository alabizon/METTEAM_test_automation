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
    #And Click ellipsis button next to Parent field
    #Then "Find Asset" window opens
    #And find "Barcode" by entering Barcode and click Find button
    #Then Click OK button 
    #And Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox
    #Then Verify Standard_Type is disabled
    #And Click Standard checkbox and verify Standard_Type is enabled
    #Then Click Save button and verify Attention is displayed
    #And Click OK button on the Attention window 
    #Then Select "<Standard_Type>"
    #And Enter "<Physical_Location>" and enter "<Purchase_Date>"
    #Then Enter "<In_Service_Date>" and enter "<Warranty_Date>"
    #And Enter "<Date_Inventoried>"
    #Then Click ellipsis button next to Inventoried_By field
    #And "Find User" window opens
    #Then find "Last" by entering Last Name and click Find button
    #And Click OK button  
    #Then Click ellipsis button next to Type_Description field
    #And "Find Type" window opens
    #Then find "Description" by entering Type_Description and click Find button
    #And Click OK button
    #Then Click Yes button on the alert window
    #And Enter "<Group>" and enter "<Assigned_Contact>"
    #Then Enter "<Assigned_Number>" and enter "<Assigned_Date>" and enter "<Optional_1>"
    #Then Click Save buttn and click Close button

    Examples: 
      | Customer          | Department         | Standard_Type | Physical_Location    | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | My First Customer | Quality Department | Primary       | TestPhysicalLocation | 04/24/2023    | 04/26/2023      | 04/24/2024    | 04/25/2023       | TestGroup | TestAssignedCont | 00001           | 004/26/2023   | Test_Opt   |
      
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
      
      
      
      