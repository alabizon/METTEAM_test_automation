Feature: Template Steps

  @Create_Template @Alex
  Scenario Outline: Create MET_TEAM Template
    Given Login With valid credentials
    When Click Maintenance and click Manual Templates
    Then "Find Manual Template" window opens and click Add button
    And "Add Manual Template" window is open and enter Template Name and click Template_Design tab
    Then drag right border, extend and drop it
    And Right-click and select "Step Wizard" from context menu
    Then Enter Start, End, Step Size and select "<Unit>" Unit
    And Enter %Reading, %FS, Floor and Resolution
    Then Click Save wizard, click Save template and click Close
    
    #Then Click Description Line5 and enter "Test_Description_5"
    #And Click Label Line5 and enter "Test_Label_5"
    #Then Click Row Type Line5 and select "Y=Pass" and click Nominal field
    #And Click Description Line6 and enter "Test_Description_6"
    #Then Click Label Line6 and enter "Test_Label_6"
    #And Click Row Type Line6 and select "Y=Fail" and click Nominal field
    #Then Click Description Line7 and enter "Test_Description_7"
    #And Click Label Line7 and enter "Test_Label_7"
    #Then Click Row Type Line7 and select "Checkbox" and click Nominal field
    #And Click Description Line8 and enter "Test_Description_8"
    #Then Click Label Line8 and enter "Test_Label_8"
    #And Click Row Type Line8 and select "Report Label" and click Nominal field
    #Then Click Description Line9 and enter "Test_Description_9"
    #And Click Label Line9 and enter "Test_Label_9"
    #Then Click Row Type Line9 and select "Bold Label" and click Nominal field
    #And Click Description Line10 and enter "Test_Description_10"
    #Then Click Label Line10 and enter "Test_Label_10"
    #And Click Row Type Line10 and select "Enter Text" and click Nominal field
    #Then Click Save button and click Close button
    
    
    
    
    
    
    

    Examples: 
      | Unit |    |
      | mV   |    |
