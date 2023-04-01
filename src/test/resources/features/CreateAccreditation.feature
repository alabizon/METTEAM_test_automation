Feature: Create Type Steps

  @Regression4 @Alex
  Scenario Outline: MetTeam Type
    Given Login With valid credentials
    When Click Maintenance and click Accreditations
    Then "Find Accreditation" wind is open and click Add button
    And "Add Accreditation" window opens and enter Code
    #Then Enter Type and enter Description
    #And Enter Start_Date and enter End_Date
    

    Examples: 
      |  |
      |  |
