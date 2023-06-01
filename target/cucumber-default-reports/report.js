$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AssignProcedureToType.feature");
formatter.feature({
  "name": "Assign Procedure to a Type Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Assign Procedure to Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AssignProcedureToType"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Description\" by entering Description and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Add Procedure Link button and \"Add Type Default Procedure\" window opens",
  "keyword": "And "
});
formatter.step({
  "name": "click Refresh button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to Procedure Name field",
  "keyword": "And "
});
formatter.step({
  "name": "\"Find Procedure\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Procedure Name\" by entering Procedure Name into search criteria and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter intrval \"\u003cInterval\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Save button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Close button on the Edit Types screen",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Interval",
        ""
      ]
    },
    {
      "cells": [
        "12",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Assign Procedure to Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AssignProcedureToType"
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
  "location": "stepDefinitions.LoginValidCredentials.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_Maintenance_and_click_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Description\" by entering Description and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.find_by_entering_Description_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add Procedure Link button and \"Add Type Default Procedure\" window opens",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.click_Add_Procedure_Link_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Refresh button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.click_Refresh_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to Procedure Name field",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.click_ellipsis_button_next_to_Procedure_Name_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Procedure\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Procedure Name\" by entering Procedure Name into search criteria and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.find_by_entering_Procedure_Name_into_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter intrval \"12\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.enter_intrval(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Close button on the Edit Types screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignProcedureToType.click_Close_button_on_the_Edit_Types_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Assign Procedure to Type");
formatter.after({
  "status": "passed"
});
});