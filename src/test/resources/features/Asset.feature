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
    Then Click OK button on the Find Asset screen
    And Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox
    Then Verify Standard_Type is disabled
    And Click Standard checkbox and verify Standard_Type is enabled
    Then Click ellipsis button next to Type_Description field
    And "Find Type" window is open
    Then Find "Description" by entering Type_Description and click Find button
    And Click OK button
    Then Click Yes button on the alert window
    And Click Save button and verify Attention is displayed
    Then Click OK button on the Attention window 
    And Select "<Standard_Type>"    
    Then Enter location "<Physical_Location>" and enter "<Purchase_Date>" 
    And Click Save button on the Asset screen
    Then Enter "<In_Service_Date>" 
    And Click Save button on the Asset screen
    Then Enter "<Warranty_Date>" date and enter "<Date_Inventoried>" date
    And Click ellipsis button next to Inventoried_By field
    Then "Find User" window is open
    And Find "Administrator" by entering Last Name and then click Find button
    Then Click OK button  
    And Enter group "<Group>" and enter "<Assigned_Contact>"
    Then Enter Assigned Number "<Assigned_Number>" and enter "<Assigned_Date>" and enter "<Optional_1>"
    And Click Save button on the Asset screen
    Then Click Close button

    Examples: 
      | Customer          | Department         | Barcode   | Standard_Type | Physical_Location    | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | My First Customer | Quality Department | SAMPLE-10 | Primary       | TestPhysicalLocation | 04/25/2023    | 04/25/2023      | 04/25/2023    | 04/25/2023       | TestGroup | TestAssignedCont | 00001           | 04/25/2023   | Test_Opt   |
      
      
  @Verify_Asset @Create_Asset
  Scenario Outline: Verify MET_TEAM Asset
    Given Login With valid credentials
    When Click Maintenance and click Assets
    Then "Find Asset" window is open
    And Find "Barcode" by entering Barcode and click Find button
    Then Click OK button on the screen
    And Verify ID is ID
    Then Verify Barcode is Barcode
    And Verify Serial Number is "<Serial_Number>"
    Then Verify Customer is  is "<Customer>"
    And Verify Department is "<Department>"
    Then Verify Parent is  is "<Barcode>"
    And Verify Standard Type is "<Standard_Type>"
    Then Verify Physical Location is  is "<Physical_Location>"
    And Verify Disposition is "<Disposition>"
    Then Verify Purchase Date is  is "<Purchase_Date>"
    And Verify In Service Date is "<In_Service_Date>"
    Then Verify Warranty Date is  is "<Warranty_Date>"
    And Verify Date Inventoried is "<Date_Inventoried>"
    Then Verify Inventoried By is  is "<Inventoried_By>"
    And Verify Type Description is Type_Description
    Then Verify Group is  is "<Group>"
    And Verify Assigned Contact is "<Assigned_Contact>"
    Then Verify Assigned Number is  is "<Assigned_Number>"
    And Verify Assigned Date is "<Assigned_Date>"
    Then Verify Optional_1 is  is "<Optional_1>"
    

    Examples: 
      | Serial_Number    | Customer          | Department         | Barcode   | Standard_Type | Physical_Location    | Disposition | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Inventoried_By       | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | TestSerialNumber | My First Customer | Quality Department | SAMPLE-10 | Primary       | TestPhysicalLocation | In Service  | 04/25/2023    | 04/25/2023      | 04/25/2023    | 04/25/2023       | System Administrator | TestGroup | TestAssignedCont | 00001           | 04/24/2023   | Test_Opt   |
      
      
      
      