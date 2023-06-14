Feature: Type Steps

  @Create_Type
  Scenario Outline: Create MET_TEAM Type
    Given Login With valid credentials
    When Click Maintenance and click Type
    Then "Find Type" findType_window is open and click Add button
    And "Add Type" window is open and enter Description
    Then Enter Item_Cost and enter Replace_Cost
    And Click ellipsis button next to the Manufacturer "Find Facility" window is open
    Then Enter "<Search_Value>" and click Find button
    And Click OK button and enter Model_Number
    Then Enter Weight and enter Dimensions
    And Enter Size and enter Stock_Number
    Then Enter Class and enter Family
    And Click Save buttn and click Close button

    Examples: 
      | Search_Value |
      |  Fluke       |
      
      
  @Verify_Type @Create_Type
  Scenario Outline: Verify MET_TEAM Type
    Given Login With valid credentials
    When Click Maintenance and click Type
    Then "Find Type" window is open
    And Find "Description" by entering Description and click Find button
    Then Click OK button and "Edit Type" window opens
    And Verify Type_Description is Type_Description
    Then Verify Item_Cost is "<Item_Cost>"
    And Verify Replace_Cost is "<Replace_Cost>"
    Then Verify Type_Manufacturer is "<Manufacturer>"
    And Verify Type_Model_Number is "<Model_Number>"
    Then Verify Type_Weight is "<Weight>"
    And Verify Type_Weight_UOM is "<Weight_UOM>"
    Then Verify Type_Size is "<Size>"
    And Verify Type_Stock_Number is "<Stock_Num>"
    Then Verify Type_Dimensions is "<Dimensions>"
    And Verify Type_Class is "<Class>"
    Then Verify Type_Family is "<Family>"
    And Verify Type_Authoirty is "<Authority>"

    Examples: 
      | Item_Cost | Replace_Cost | Manufacturer | Model_Number | Weight | Weight_UOM | Size | Stock_Num | Dimensions | Class     | Family     | Authority |
      | 5.00      | 7.00         | Fluke        | 2468         | 10     | lbs        | 2x2  | 369       | 5x5        | TestClass | TestFamily | Default   |

