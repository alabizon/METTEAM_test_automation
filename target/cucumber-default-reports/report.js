$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateUser.feature");
formatter.feature({
  "name": "Create Part Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET/TEAM User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
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
  "name": "Click Setup and click Users",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find User\" window opens and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add User\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter First_Name and enter Last_Name",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Initials and enter Username",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password and enter Email1",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Phone1 and enter Phone2",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Stamp_Number and Employee_Number",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Pay_Grade and click Save button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK on the alert and \"Find New Lab\" windows is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Find button and double-click the first grid record",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Groups button and \"Assign Groups\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Click all checkboxes and click Save button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Logoff button",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Username and enter Password",
  "keyword": "And "
});
formatter.step({
  "name": "Click Log-in button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify you login in as \"jdoe\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "Password"
      ]
    },
    {
      "cells": [
        "jdoe",
        "jdoe"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET/TEAM User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
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
  "location": "stepDefinitions.LoginValidCredentials.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Setup and click Users",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Setup_and_click_Userss()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find User\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add User\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter First_Name and enter Last_Name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_First_Name_and_enter_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Initials and enter Username",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Initials_and_enter_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password and enter Email1",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Password_and_enter_Email1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Phone1 and enter Phone2",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Phone1_and_enter_Phone2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Stamp_Number and Employee_Number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Stamp_Number_and_Employee_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Pay_Grade and click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Pay_Grade_and_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK on the alert and \"Find New Lab\" windows is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_OK_on_the_alert_and_windows_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find button and double-click the first grid record",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Find_button_and_double_click_the_first_grid_record()"
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
  "name": "Click Groups button and \"Assign Groups\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Groups_button_and_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click all checkboxes and click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_all_checkboxes_and_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Logoff button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Logoff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.enter_Username_and_enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Log-in button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify you login in as \"jdoe\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginValidCredentials.verify_you_login_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET/TEAM User");
formatter.after({
  "status": "passed"
});
});