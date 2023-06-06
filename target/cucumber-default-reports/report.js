$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ReceiveAssets.feature");
formatter.feature({
  "name": "Receive Assets Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Receive_Assets"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Workflow and click Receiving",
  "keyword": "When "
});
formatter.step({
  "name": "Enter \"SAMPLE-10\" into Barcode search criteria and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Double-click search result",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Search criteria and enter \"SAMPLE-11\" into Barcode search criteria and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Double-click search result again",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button on the Find Assets to Receive screen",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Quantity",
        "Contact Info"
      ]
    },
    {
      "cells": [
        "Test_Location",
        "3",
        "Test_Contact"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Receive_Assets"
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
  "name": "Click Workflow and click Receiving",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.click_Workflow_and_click_Receiving()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"SAMPLE-10\" into Barcode search criteria and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_into_Barcode_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Double-click search result",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Search criteria and enter \"SAMPLE-11\" into Barcode search criteria and click Find button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Double-click search result again",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click OK button on the Find Assets to Receive screen",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam work Order");
formatter.after({
  "status": "passed"
});
});