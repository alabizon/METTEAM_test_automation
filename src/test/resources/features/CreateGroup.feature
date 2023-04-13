Feature: Create Group Steps

  @Create_Group @Alex
  Scenario Outline: Create MET_TEAM Group
    Given Login With valid credentials
    When Click Configure and click Groups 
    Then "Find Groups" window opens
    And Click Add button and "Add Group" window is open
    Then Enter Group_Name and click Save
    And Click Add New Member button and "Find User" window opens
    Then Enter "<Search_Value>" and click Find button
    And Click OK button
    Then Click Close button  
    Then Click Setup and click Users
    And "Find User" window is open
    Then Fill Search_Value with "<Search_Value>" and click Find button 
    And Click OK button from "Find User" screen
    Then "Edit User" window opens and click Groups button
    And "Assign Groups" window is up
    Then Verify added group is assigned to the user and is selected

    Examples: 
      |  Search_Value  |
      |  Administrator |