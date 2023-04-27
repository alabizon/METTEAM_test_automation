Feature: Part Steps

  @Create_Part
  Scenario Outline: Create MET_TEAM Part
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

      
  @Verify_Part @Create_Part
  Scenario Outline: Verify MET_TEAM Part
    Given Login With valid credentials
    When Click Maintenance and click Parts 
    Then "Find Part" window opens
    And Find "Part Number" by entering Part Number and click Find button
    Then Click OK button and "Edit Part" window opens
    And Verify Description is Description
    Then Verify Part_Number is Part_Number
    And Verify Manufacturer is "<Manufacturer>"
    Then Verify Class is "<Class>"
    And Verify Stock_Number is "<Stock_Num>"
    And Verify Group is "<Group>"
    Then Verify Location is like "<Location>"
    And Verify On_Hand is "<On_Hand>"
    And Verify Re_Order is "<Re_Order>"
    Then Verify Last_Qty is "<Last_Qty>"
    And Verify Purchase_Unit is "<Purch_Unit>"
    And Verify Price is "<Price>"
    Then Verify Inventoried_By is "<Inventoried_By>"
    And Verify Date_Inventoried is "<Date_Inv>"
    Then Verify Cost is "<Cost>"
    And Verify Supplier is "<Supplier>"
    And Verify Last_Ordered is "<Last_Ord>"
    Then Verify Last_Cost is "<Last_Cost>"

    Examples: 
      | Part_Number | Manufacturer | Class     | Stock_Num | Group     | Location     | On_Hand | Re_Order | Last_Qty | Purch_Unit | Price | Inventoried_By       | Date_Inv   | Cost | Supplier     | Last_Ord   | Last_Cost |
      | 456         | Fluke        | TestClass | 123       | TestGroup | TestLocation | 10      | 7        | 6        | EA         | 3.00  | System Administrator | 05/27/2005 | 5.00 | TestSupplier | 05/26/2005 | 3.50      | 