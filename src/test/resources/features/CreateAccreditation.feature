Feature: Create Accreditation Steps

  @Create_Accreditation @Alex
  Scenario Outline: Create MET_TEAM Accreditation
    Given Login With valid credentials
    When Click Maintenance and click Accreditations 
    Then "Find Accreditation" window opens
    And Click Add button and "Add Accreditation" window is open
    Then Enter Code and enter Type and enter Description
    And Enter Start_Date and enter End_Date
    Then Click Save buttn and click Close button

    Examples: 
      |    |
      |    |