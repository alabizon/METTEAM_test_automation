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
formatter.step({
  "name": "Verify Ship_To is \"\u003cShip_To\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Shipment_Name is Shipment_Name",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Location is \"\u003cLocation\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Shipper is \"\u003cShipper\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Tracking_Number is \"\u003cTracking_Number\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Required_Date is Required_Date",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Authority is \"\u003cAuthority\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Notes is \"\u003cNotes\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Additional_Info is \"\u003cAdd_Info\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Issued_By is \"\u003cIssued_By\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Shipping_Items tab",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Nomenclature is \"\u003cNomenclature\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Model_Number is \"\u003cModel_Number\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Serial_Number is \"\u003cSerial_Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify first item Barcode is \"\u003cBarcode1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify second item Barcode is \"\u003cBarcode2\u003e\"",
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
  "status": "passed"
});
formatter.step({
  "name": "Verify Ship_To is \"My First Customer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Ship_To_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Shipment_Name is Shipment_Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Shipment_Name_is_Shipment_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Location is \"TestLocation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Location_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Shipper is \"FedEx\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Shipper_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Tracking_Number is \"DO NOT CHALLENGE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Tracking_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Required_Date is Required_Date",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Required_Date_is_Required_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Authority is \"TestAuthority\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Authority_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Notes is \"TestNotes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Notes_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Additional_Info is \"TestAdditionalInfo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Additional_Info_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Issued_By is \"TestUser\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Issued_By_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Shipping_Items tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_Shipping_Items_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Nomenclature is \"Test_Nom\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Nomenclature_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Model_Number is \"Test_Model\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Model_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Serial_Number is \"Test_Serial\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Serial_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify first item Barcode is \"12345\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_first_item_Barcode_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify second item Barcode is \"SAMPLE-10\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_second_item_Barcode_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Shipping");
formatter.after({
  "status": "passed"
});
});