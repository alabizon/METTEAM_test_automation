$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Shipping.feature");
formatter.feature({
  "name": "Shipping Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Shipping",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Shipping"
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
  "name": "\"Find Shipment\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter search value for the Shipment Name and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button and \"Edit Shipment\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Ship_From is \"\u003cShip_From\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Ship_From",
        "Ship_To",
        "Location",
        "Shipper",
        "Tracking_Number",
        "Authority",
        "Notes",
        "Add_Info",
        "Issued_By",
        "Nomenclature",
        "Model_Number",
        "Serial_Number",
        "Barcode1",
        "Barcode2"
      ]
    },
    {
      "cells": [
        "My Lab",
        "My First Customer",
        "TestLocation",
        "FedEx",
        "DO NOT CHALLENGE",
        "TestAuthority",
        "TestNotes",
        "TestAdditionalInfo",
        "TestUser",
        "Test_Nom",
        "Test_Model",
        "Test_Serial",
        "12345",
        "SAMPLE-10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Shipping",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Shipping"
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
  "name": "\"Find Shipment\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter search value for the Shipment Name and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.enter_search_value_for_the_Shipment_Name_and_click_Find_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and \"Edit Shipment\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Ship_From is \"My Lab\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Ship_From_is(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[My Lab]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.VerifyShipping.verify_Ship_From_is(VerifyShipping.java:62)\r\n\tat ✽.Verify Ship_From is \"My Lab\"(file:///C:/Users/Test_User/eclipse-workspace/METTEAM_Test_Automation/src/test/resources/features/Shipping.feature:38)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Shipping");
formatter.after({
  "status": "passed"
});
});