$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Asset.feature");
formatter.feature({
  "name": "Asset Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Asset"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Assets",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Asset\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Barcode\" by entering Barcode and click Find button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Type",
        "Description",
        "Start_Date",
        "End_Date"
      ]
    },
    {
      "cells": [
        "22",
        "Auto",
        "07/15/2022",
        "11/21/2022"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Asset"
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
  "name": "Click Maintenance and click Assets",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_Maintenance_and_click_Assets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Asset\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Barcode\" by entering Barcode and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.find_by_entering_Barcode_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Asset");
formatter.after({
  "status": "passed"
});
});