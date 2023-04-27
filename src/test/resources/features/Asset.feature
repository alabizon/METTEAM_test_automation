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
    And Enter location "<Physical_Location>" and enter "<Purchase_Date>" 
    Then Click Save button on the Asset screen
    And Enter "<In_Service_Date>" 
    Then Click Save button on the Asset screen
    And Enter "<Warranty_Date>" date and enter "<Date_Inventoried>" date
    Then Click ellipsis button next to Inventoried_By field
    And "Find User" window is open
    Then Find "Administrator" by entering Last Name and then click Find button
    And Click OK button  
    Then Enter group "<Group>" and enter "<Assigned_Contact>"
    And Enter Assigned Number "<Assigned_Number>" and enter "<Assigned_Date>" and enter "<Optional_1>"
    Then Click Save button on the Asset screen
    And Click Close button

    Examples: 
      | Customer          | Department         | Barcode   | Standard_Type | Physical_Location    | Purchase_Date | In_Service_Date | Warranty_Date | Date_Inventoried | Group     | Assigned_Contact | Assigned_Number | Assigned_Date | Optional_1 |
      | My First Customer | Quality Department | SAMPLE-10 | Primary       | TestPhysicalLocation | 04/25/2023    | 04/25/2023      | 04/25/2023    | 04/25/2023       | TestGroup | TestAssignedCont | 00001           | 04/25/2023   | Test_Opt   |
      
      
  @Verify_Asset @Create_Asset
  Scenario Outline: Verify MET_TEAM Asset
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
      
      
      
      