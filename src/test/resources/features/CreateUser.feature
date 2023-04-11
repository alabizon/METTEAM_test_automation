Feature: Create Part Steps

  @User @Alex
  Scenario Outline: Create MET/TEAM User
    Given Login With valid credentials
    When Click Setup and click Users
    Then "Find User" window opens and click Add button
    And "Add User" window is open
    Then Enter First_Name and enter Last_Name
    And Enter Initials and enter Username
    Then Enter Password and enter Email1
    And Enter Phone1 and enter Phone2
    Then Enter Stamp_Number and Employee_Number
    And Enter Pay_Grade and click Save button
    Then Click OK on the alert and "Find New Lab" windows is open
    And Click Find button and double-click the first grid record
    Then Click OK button
    And Click Groups button and "Assign Groups" window is open
    Then Click all checkboxes and click Save button
    Then Click Logoff button
    And Enter Username and enter Password
    Then Click Log-in button
    And Verify you login in as "jdoe" 

    Examples: 
      | Login  | Password |
      | jdoe   | jdoe     |  
