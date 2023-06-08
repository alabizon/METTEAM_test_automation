Feature: Edit WO Steps

  @Edit_WO 
  Scenario Outline: Edit Work Order
    Given Login With valid credentials
    When Click Workflow and click Work Orders
    Then "Find Work Order" window opens
    And Enter "<Barcode1>" into Barcode search criteria and click Find button
    Then Click OK button on the screen
        

    Examples: 
      | Barcode1  |  |  |
      | SAMPLE-10 |  |  |
      
      
      
      