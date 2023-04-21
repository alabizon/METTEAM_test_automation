Feature: Create Part Steps

  @Contact @Alex 
  Scenario Outline: Create MET_TEAM Contact
    Given Login With valid credentials
    When Click Setup and click Contacts
    Then "Find Contact" window opens and click Add button
    And "Add Contact" window is open
    Then Enter Contact_Id and enter First_Name and enter Middle_Name
    And Enter Last_Name and Enter Suffix and enter Description
    Then Enter Fax and enter Phone1
    And Enter Phone2 and enter Cell_Phone
    Then Enter Email1 and enter Notes
    And Click Save button and click Add button next to Facilities grid
    Then "Find Facility" window is open 
    And Enter "<Search_Value>" and click Find button
    Then Click OK button
    And Click OK button on the Contacts screen
    
    Examples: 
      | Search_Value |  |
      | My Lab       |  |
