$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Type.feature");
formatter.feature({
  "name": "Type Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Type"
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
  "name": "Click OK button and \"Edit Type\" window opens",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Item_Cost",
        "Replace_Cost",
        "Manufacturer",
        "Model_Number",
        "Weight",
        "Weight_UOM",
        "Size",
        "Stock_Num",
        "Dimensions",
        "Class",
        "Family",
        "Authority"
      ]
    },
    {
      "cells": [
        "5.00",
        "7.00",
        "Fluke",
        "2468",
        "10",
        "lbs",
        "2x2",
        "369",
        "5x5",
        "TestClass",
        "TestFamily",
        "Default"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Type"
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
  "name": "Click OK button and \"Edit Type\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Type");
formatter.after({
  "status": "passed"
});
});