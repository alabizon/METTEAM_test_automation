$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateType.feature");
formatter.feature({
  "name": "Create Type Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression2"
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
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to the Manufacturer \"Find Facility\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value\u003e\" and click Find button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search_Value"
      ]
    },
    {
      "cells": [
        "Fluke"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression2"
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
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.findType_window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.window_is_open_and_enter_Description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Item_Cost_and_enter_Replace_Cost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to the Manufacturer \"Find Facility\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_ellipsis_button_next_to_the_Manufacturer_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Fluke\" and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Type");
formatter.after({
  "status": "passed"
});
});