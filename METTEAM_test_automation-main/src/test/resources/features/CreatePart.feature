Feature: Create Part Steps

  @Part @Alex
  Scenario Outline: MetTeam Parts
    Given Login With valid credentials
    When Click Maintenance and click Parts
    Then "Find Part" window opens and click Add button
    And "Add Part" wnd is open and enter Description
    Then Enter Part_Number and enter On_Hand and enter Re_Order and enter Last_Qty
    And Click ellipsis button nxt to the Manufacturer "Find Manufacturer" window is open
    Then Enter "<Search_Value_Manufacturer>" and click Find buttn
    And Click OK button and enter Class and enter Purchase_Units and enter Price
    Then Enter Stock_Number and enter Group
    And Click ellipsis button next to the InventoriedBy "Find Inventoried By" window is open
    Then Enter "<Search_Value_Last>" and click Find btn
    And Click OK button and enter Date_Inventoried and enter Cost
    Then Enter Location and enter Supplier and enter Last_Ordered and enter Last_Cost
    And Click Save btn and click Close button

    Examples: 
      | Search_Value_Manufacturer | Search_Value_Last    |
      |        Fluke              |    Administrator     |
