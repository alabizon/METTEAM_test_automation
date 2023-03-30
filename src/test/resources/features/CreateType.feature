Feature: Create Type Steps

  @Regression2 @Alex
  Scenario Outline: MetTeam Type
    Given Login With valid credentials
    When Click Maintenance and click Type
    Then "Find Type" findType_window is open and click Add button
    And "Add Type" window is open and enter Description
    Then Enter Item_Cost and enter Replace_Cost
    And Enter Manufacturer and enter Model_Number
    Then Enter Weight and enter Dimensions
    And Enter Size and enter Stock_Number
    Then Enter Class and enter Family
    #And Click Save button and click Close button

    Examples: 
      |  |           |
      |  | |
