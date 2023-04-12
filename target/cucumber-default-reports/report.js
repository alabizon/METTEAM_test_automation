$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateShipping.feature");
formatter.feature({
  "name": "Create Shipping Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET/TEAM Shipping",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Shipping"
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
  "name": "Click Workflow and click Shipping",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Shipment\" window opens and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Shipment\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to \"Ship To\" button and \"Find Facility Address\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value\u003e\" and click Find button and click OK button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search_Value",
        "Shipment_Value",
        "Nomenclature",
        "Model_Number",
        "Serial_Number",
        "Barcode"
      ]
    },
    {
      "cells": [
        "My First Customer",
        "Sample-10",
        "Test_Nom",
        "Test_Model",
        "Test_Serial",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET/TEAM Shipping",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Shipping"
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
  "name": "Click Workflow and click Shipping",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Workflow_and_click_Shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Shipment\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Shipment\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to \"Ship To\" button and \"Find Facility Address\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_ellipsis_button_next_to_button_and_window_opens(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"My First Customer\" and click Find button and click OK button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png", "Create MET/TEAM Shipping");
formatter.after({
  "status": "passed"
});
});