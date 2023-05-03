Feature: Contract Pricing Steps

  @Create_Contract_Pricing 
  Scenario Outline: Create MET_TEAM Contract Pricing
    Given Login With valid credentials
    When Click Management and click Contract Pricing
    Then "Find Pricing" window is open and click Add button
    And "Add Contract Pricing" window is open
    Then Click elipsis bytton next to the Custoner field 
    And "Find Facility" window is open 
    Then Enter "<Customer>" into search criteria and click Find button
    And Click OK button
    Then Click ellipsis button next to the Working Facility field
    And "Find Facility" window is open
    Then Enter "<Working_Facility>" into Facility Name search criteria and click Find button
    And Click OK button
    Then Click ellipsis button next to Type Procedure Default field
    And "Find Type Procedure Default" window is open
    Then Find "Description" by entering Types Description and click Find button
    And Click OK button
    Then Enter Contract Pricing "<Effective_Date>"
    And Click Save button and save Contract Pricing
    Then Enter Pricing "<Expire_Date>" 
    And Click Save button and save Contract Pricing
    Then Enter "<Price>" to the Price field
    And Click Save button and click Close button to close Contract Pricing screen
     
    

    Examples: 
      | Customer          | Working_Facility | Effective_Date | Expire_Date | Price  |
      | My First Customer | My Lab           | 03/25/2022     | 04/25/2022  | 257.50 |
      
      
  @Verify_Contract_Pricing @Create_Contract_Pricing
  Scenario Outline: Verify MET_TEAM Contract Pricing
    Given Login With valid credentials
    When Click Management and click Contract Pricing
    Then "Find Pricing" window is open
    And Find "Description" by entering Description and click Find button
    Then Click OK button on the "Find Pricing" screen
    Then Verify Customer is "<Customer>"
    Then Verify Working Facility is "<Working_Facility>"
    And Verify Effective Date is "<Effective_Date>"
    Then Verify Expire Date is "<Expire_Date>"
    And Verify Contract Price is "<Price>"
    

    Examples: 
      | Customer          | Working_Facility | Effective_Date | Expire_Date | Price    |
      | My First Customer | My Lab           | 03/25/2022     | 04/25/2022  | 257.50   |      
      
      
      