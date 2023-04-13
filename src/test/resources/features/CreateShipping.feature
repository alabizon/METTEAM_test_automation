Feature: Shipping Steps

  @Create_Shipping @Alex 
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
      | Search_Value      | Shipper |Shipment_Value | Nomenclature | Model_Number | Serial_Number | Barcode |
      | My First Customer | FedEx   |Sample-10      |   Test_Nom   | Test_Model   | Test_Serial   | 12345   |
    
    
  @Verify_Shipping @Alex 
  Scenario Outline: Verify MET_TEAM Shipping
    Then Click Workflow and click Shipping
    And "Find Shipment" window is open
    Then Enter search value for the Shipment Name and click Find button
    #And Click OK button and "Edit Shipment" window opens
    #Then Verify "Ship From" is "My Lab"
    #And Verify "Ship To" is "My First Customer"
    #Then Verify "From" is "From Address"
    #And Verify "To" is "To Address"
    #Then Verify "Shipment Name" is Shipment_Name
    #And Verify "Location" is "Location"
    #Then Verify "Shipper" is "FedEx"
    #And Verify "Tracking Number" is "Tracking Number"
    #Then Verify "Required Date" is "Required Date"
    #And Verify "Authority" is "Authority"
    #Then Verify "Notes" is "Notes"
    #And Verify "Additional Info" is "Additional Info"
    #Then Verify "Issued By" is "Issued By"
    #And Click Shipping_Items tab
    #Then Verify the first item's barcode is "<Shipment_Value>"
    #And Verify Nomenclature is "<Nomenclature>"
    #Then Verify Model_Number is "<Model_Number>"
    #And Verify Serial_Number is "<Serial_Number>"
    #Then Verify second item's Barcode is "<Barcode>"
    
      
    
    