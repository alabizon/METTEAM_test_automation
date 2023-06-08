$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EditWorkOrder.feature");
formatter.feature({
  "name": "Edit WO Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Edit Work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Edit_WO"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Workflow and click Work Orders",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Work Order\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cBarcode1\u003e\" into Barcode search criteria and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button on the screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Barcode1",
        "",
        ""
      ]
    },
    {
      "cells": [
        "SAMPLE-10",
        "",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Edit Work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Edit_WO"
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
  "name": "Click Workflow and click Work Orders",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.EditWorkOrder.click_Workflow_and_click_Work_Orders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Work Order\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"SAMPLE-10\" into Barcode search criteria and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_into_Barcode_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.click_OK_button_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Edit Work Order");
formatter.after({
  "status": "passed"
});
});