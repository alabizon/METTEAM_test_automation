Feature: Run PXE Procedure Steps

  @Run_PXE
  Scenario Outline: Run PXE Procedure
    Given Login With valid credentials
    When Click Maintenance and click Assets
    Then "Find Asset" window is open
    And Find "Barcode" by entering Barcode and click Find button
    Then Click Receive button "Edit Work Order" window is open
    And Click Add Result button 
    Then Open Chromidium
    And Click Save button on the "Pre_Prompt" screen
    Then Click OK button on the "METCAL info" screen
    And Click Save button on the "Post_Prompt" screen
    Then Capture Work Order number
    And Click Close button on the "Edit Work Order" screen
    Then Click Maintenance and click Work Orders
    And Find "Barcode" by entering Barcode and click Find button
    Then Click OK button "Edit Work Order" window is open
    And Click Results tab and verify results record
    Then Click Service tab and select "<Status>"
    And Click Save button
    Then Click Return button and click Yes button on Attention window
    And "Returning" window is open
    Then Click Process button and click OK button on Success window
    And Click Close button on "Returning" screen
    Then Click Close button on "Edit Work Order" screen

    Examples: 
      | Status   |  |
      | Complete |  |
