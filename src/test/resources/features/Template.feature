Feature: Template Steps

  @Create_Template
  Scenario Outline: Create MET_TEAM Template
    Given Login With valid credentials
    When Click Maintenance and click Manual Templates
    Then "Find Manual Template" window opens and click Add button
    And Add Manual Template window is open and enter Template Name and click Template_Design tab
    Then drag right border, extend and drop it
    And Right-click and select "Step Wizard" from context menu
    Then Enter Start, End, Step Size and select "<Unit>" Unit
    And Enter %Reading, %FS, Floor and Resolution
    Then Click Save wizard, click Save template and click Close
   

    Examples: 
      | Unit |    |
      | mV   |    |
