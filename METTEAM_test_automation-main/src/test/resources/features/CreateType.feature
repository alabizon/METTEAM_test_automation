Feature: Create Type Steps

  @Type @Alex
  Scenario Outline: MetTeam Type
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
      |  Fluke |
