Feature: Edit WO Steps

  @Edit_WO 
  Scenario Outline: Edit Work Order
    Given Login With valid credentials
    When Click Workflow and click Work Orders
    Then "Find Work Order" window opens
    And Enter "<Barcode1>" into Barcode search criteria and click Find button
    Then Click OK button on the screen
    #And Select "System Administrator" for QC Approved By
    #Then Enter today date to QC Approved Date
    #And Click Log Notes tab and verify log note with Status "received" is present in the grid
    Then Click Labor tab
    #Then Click Labor tab and click Add Labor button
    #And "Add Labor" screen opens
    #Then Enter "2" to Duration and click Save button 
    #And Verify Time is "2"
    Then Click Edit Labor button 
    #And Verify Duration is "2"
    Then Click Close button on Edit Labor screen
        

    Examples: 
      | Barcode1  |  |  |
      | SAMPLE-10 |  |  |
      
      
      
      