Feature: Shipping Steps

  @Create_Shipping 
  Scenario Outline: Create MET_TEAM Shipping
    Given Login With valid credentials
    When Click Workflow and click Shipping
    Then "Find Shipment" window opens and click Add button
    And "Add Shipment" window is open
    Then Click ellipsis button next to "Ship To" button and "Find Facility Address" window opens
    And Enter "<Search_Value>" and click Find button and click OK button
    Then Click Yes on the Attention window
    And Enter Shipment name and enter Location
    Then Select "<Shipper>" and enter Tracking_Number
    And Enter Required_Date and enter Authority
    Then Enter Notes and enter Additional_Info and enter Issued_By
    And Click Save button
    Then Click Shipping_Items tab and click Add_Asset button
    And "Select Shipment Items" window is open
    Then Enter "<Shipment_Value>" and then click Find button
    And Double-click search result and click OK button
    Then Click Add_Non_Asset button and "Add Shipment Item" window is open
    And Enter "<Nomenclature>" and enter "<Model_Number>"
    Then Enter "<Serial_Number>" and then enter "<Barcode>"
    And Click Save button and then click Close button
    
    Examples: 
      | Search_Value      | Shipper | Shipment_Value | Nomenclature | Model_Number | Serial_Number | Barcode |
      | My First Customer | FedEx   | Sample-10      |   Test_Nom   | Test_Model   | Test_Serial   | 12345   |
    
    
  @Verify_Shipping 
  Scenario Outline: Verify MET_TEAM Shipping
    Given Login With valid credentials
    When Click Workflow and click Shipping
    Then "Find Shipment" window is open
    And Enter search value for the Shipment Name and click Find button
    Then Click OK button and "Edit Shipment" window opens
    And Verify Ship_From is "<Ship_From>"
    Then Verify Ship_To is "<Ship_To>"
    And Verify Shipment_Name is Shipment_Name
    Then Verify Location is "<Location>"
    And Verify Shipper is "<Shipper>"
    Then Verify Tracking_Number is "<Tracking_Number>"
    And Verify Required_Date is Required_Date
    Then Verify Authority is "<Authority>"
    And Verify Notes is "<Notes>"
    Then Verify Additional_Info is "<Add_Info>"
    And Verify Issued_By is "<Issued_By>"
    Then Click Shipping_Items tab
    And Verify Nomenclature is "<Nomenclature>"
    Then Verify Model_Number is "<Model_Number>"
    And Verify Serial_Number is "<Serial_Number>"
    Then Verify first item Barcode is "<Barcode1>"
    And Verify second item Barcode is "<Barcode2>"

    
    
    Examples: 
    	| Ship_From | Ship_To           | Location     | Shipper | Tracking_Number  | Authority     | Notes     | Add_Info           | Issued_By | Nomenclature | Model_Number | Serial_Number | Barcode1 | Barcode2  |
    	| My Lab    | My First Customer | TestLocation | FedEx   | DO NOT CHALLENGE | TestAuthority | TestNotes | TestAdditionalInfo | TestUser  | Test_Nom     | Test_Model   | Test_Serial   | 12345    | SAMPLE-10 |
    
    