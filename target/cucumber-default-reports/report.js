$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateProcedure.feature");
formatter.feature({
  "name": "Create Procedure Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Procedure",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Alex"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Procedures",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Procedure\" window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Procedure\" window is open and enter Procedure Name",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Number and enter Version",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Revision",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Procedure_Date and enter Revision_Date",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to the Data Sheet \"Attach Data Sheet\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Select \"\u003cSearch_Value\u003e\" for the search value and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Select \"\u003cSelect_Results\u003e\" and click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to the Category \"Select Category\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Select \"\u003cCategory\u003e\" from the grid and click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Save button and click Close button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search_Value",
        "Category",
        "Select_Results"
      ]
    },
    {
      "cells": [
        "Procedure",
        "MET/CAL",
        "Test of PXE with 3 Test points (Pass).pxe"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam Procedure",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Alex"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginPageStepDefinitions.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Maintenance and click Procedures",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.click_Maintenance_and_click_Procedures()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Procedure\" window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Procedure\" window is open and enter Procedure Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_open_and_enter_Procedure_Name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Number and enter Version",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.enter_Number_and_enter_Version()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Revision",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.enter_Revision()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Procedure_Date and enter Revision_Date",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.enter_Procedure_Date_and_enter_Revision_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to the Data Sheet \"Attach Data Sheet\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.click_ellipsis_button_next_to_the_Data_Sheet_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Procedure\" for the search value and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.select_for_the_Search_Value_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Test of PXE with 3 Test points (Pass).pxe\" and click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.select_procedure_and_click_Ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to the Category \"Select Category\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.click_ellipsis_button_next_to_the_Category_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"MET/CAL\" from the grid and click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.select_category_and_click_Ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and click Close button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.click_Save_button_and_click_Close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Procedure");
formatter.after({
  "status": "passed"
});
});