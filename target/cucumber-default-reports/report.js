$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateProcedure.feature");
formatter.feature({
  "name": "Create Work Order Steps",
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
  "name": "Click on Maintenance and click Procedures",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Procedure\" window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Procedure\" window is opened and enter Procedure Name",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to the Data Sheet \"Attach Data Sheet\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Select \"Procedure\" for the \"Search Value\" and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to Category (proc) \"Select Category (Proc)\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Select specific \"\u003cCategory\u003e\" from the grid and click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and click Close button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Category"
      ]
    },
    {
      "cells": [
        "MET/CAL"
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
  "name": "Click on Maintenance and click Procedures",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.click_on_Maintenance_and_click_Procedures()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Procedure\" window is open and click Add button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Add Procedure\" window is opened and enter Procedure Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_opened_and_enter_procedure_name(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click ellipsis button next to the Data Sheet \"Attach Data Sheet\" window is open",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select \"Procedure\" for the \"Search Value\" and click Find button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click ellipsis button next to Category (proc) \"Select Category (Proc)\" window is open",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select specific \"MET/CAL\" from the grid and click OK button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Save button and click Close button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Procedure");
formatter.after({
  "status": "passed"
});
});