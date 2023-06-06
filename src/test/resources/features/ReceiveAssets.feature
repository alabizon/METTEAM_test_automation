Feature: Receive Assets Steps

  @Receive_Assets
  Scenario Outline: MetTeam work Order
    Given Login With valid credentials
    When Click Workflow and click Receiving
    Then Enter "SAMPLE-10" into Barcode search criteria and click Find button
    Then Double-click search result
    And Click Search criteria and enter "SAMPLE-11" into Barcode search criteria and click Find button
    Then Double-click search result again
    And Click OK button on the Find Assets to Receive screen
    Then Click Department elipsis button and select "Quality Department"
    And Enter "<Location>" and enter "<Quantity>" and enter "<Contact Info>"
    Then Select "Mechanical" for Work Area
    And Select "One Time Only" for Reason for Service 
    Then Select "In Tolerance" for Initial Condition 
    And Check On Site checkbox and check Expedite checkbox
    Then Select second asset and verify the Department is blank
    And Verify Location is blank
    Then Verify Work Area is "Electronic"
    And Verify Reason of Service is "Normal Cycle"
    Then Verify Initial Condition is blank
    And Verify Quantity is "1" and Contact Info is blank
    Then Verify On Site checkbox is unchecked
    #And Verify Expedite checkbox is unchecked
    #Then Select first asset and check Location checkbox
    #And Select second asset and verify Location is "<Location>"
    #Then Select first asset and uncheck Location checkbox
    #And Select second asset and verify Location is blank
    #Then Select first asset and click Select button
    #And Verify Department relative checkbox is checked and Location relative checkbox is checked
    #Then Verify Work Area relative checkbox is checked and Reason for Service relative checkbox is checked
    #And Verify Initial Condition relative checkbox is checked and Priority relative checkbox is checked
    #Then Verify Quantity relative checkbox is checked and Job Number relative checkbox is checked
    #And Verify On Site relative checkbox is checked and Expedite relative checkbox is checked
    #Then Verify ISOCert relative checkbox is checked and Service Type relative checkbox is checked
    #And Verify Status relative checkbox is checked and Open Date relative checkbox is checked
    #Then Verify Required Date relative checkbox is checked and Category relative checkbox is checked
    #And Verify Sub Category relative checkbox is checked and Contact Info relative checkbox is checked
    #Then Select second asset and verify the Department is "Quality Department"
    #And Verify Location is "<Location>" and Work Area is "Mechanical"
    #Then Verify Reason for Service is "One Time Only" and Initial Condition is "In Tolerance"
    #And Verify Priority is "3" and Quantity is "<Quantity>"
    #Then Verify Contact Info is "<Contact Info>"
    #And Verify On Site checkbox is checked and Expedite checkbox is checked
    #Then Click Select button and Verify Required Date is Open Date + 14 days
    #And Enter "1" to Priority and verify Required Date is Open Date + 3 days
    #Then Enter "2" to Priority and Verify Required Date is Open Date + 7 days
    #And Enter "3" to Priority and click Process button
    #Then cick OK on the Attention message and click Close button
    

    Examples: 
      | Location      | Quantity | Contact Info |
      | Test_Location | 3        | Test_Contact |
