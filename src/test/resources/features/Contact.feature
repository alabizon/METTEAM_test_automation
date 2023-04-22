Feature: Contact Steps

  @Create_Contact 
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
      | Search_Value |
      | My Lab       |

      
  @Verify_Contact @Create_Contact
  Scenario Outline: Verify MET_TEAM Contact
    Given Login With valid credentials
    When Click Setup and click Contacts 
    Then "Find Contact" window opens
    And Find "Last Name" by entering Last Name and click Find button
    Then Click OK button and "Edit Contact" window opens
    And Verify Contact_ID is Contact_ID
    Then Verify First_Name is "<First_Name>"
    And Verify Middle_Name is "<Mid_Name>"
    Then Verify Last_Name is Last_Name
    And Verify Suffix is "<Suffix>"
    Then Verify Description is "<Description>" 
    And Verify Fax is "<Fax>"
    Then Verify Phone_1 is "<Phone1>"
    And Verify Phone_Two is "<Phone_Two>"
    Then Verify Cell_Phone is "<Cell_Phone>"
    And Verify Email is "<Email>"
    Then Verify Notes is "<Notes>"
    
    Examples: 
      | First_Name | Mid_Name | Suffix | Description | Fax  | Phone1     | Phone_Two  | Cell_Phone | Email           | Notes      |
      | John       | Bill     | Jr.    | Employee    | 1234 | 9298875430 | 9287763287 | 9292287645 | email1@test.com | Test_Notes |