$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateShipping.feature");
formatter.feature({
  "name": "Shipping Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET/TEAM Shipping",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Shipping"
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
formatter.step({
  "name": "Click Yes on the Attention window",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Shipment name and enter Location",
  "keyword": "And "
});
formatter.step({
  "name": "Select \"\u003cShipper\u003e\" and enter Tracking_Number",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Required_Date and enter Authority",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Notes and enter Additional_Info and enter Issued_By",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Shipping_Items tab and click Add_Asset button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Select Shipment Items\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cShipment_Value\u003e\" and then click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Double-click search result and click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Add_Non_Asset button and \"Add Shipment Item\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cNomenclature\u003e\" and enter \"\u003cModel_Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSerial_Number\u003e\" and then enter \"\u003cBarcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and then click Close button",
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
        "Shipper",
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
        "FedEx",
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
      "name": "@Create_Shipping"
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
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_and_click_Find_button_and_click_OK_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yes on the Attention window",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Yes_on_the_Attention_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Shipment name and enter Location",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_Shipment_name_and_enter_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"FedEx\" and enter Tracking_Number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.select_and_enter_Tracking_Number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Required_Date and enter Authority",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_Required_Date_and_enter_Authority()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Notes and enter Additional_Info and enter Issued_By",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_Notes_and_enter_Additional_Info_and_enter_Issued_By()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Shipping_Items tab and click Add_Asset button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Shipping_Items_tab_and_click_Add_Asset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Select Shipment Items\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Sample-10\" and then click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_and_then_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Double-click search result and click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.double_click_search_result_and_click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add_Non_Asset button and \"Add Shipment Item\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Add_Non_Asset_button_and_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Test_Nom\" and enter \"Test_Model\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_and_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Test_Serial\" and then enter \"12345\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.enter_and_then_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and then click Close button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateShipping.click_Save_button_and_then_click_Close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET/TEAM Shipping");
formatter.after({
  "status": "passed"
});
});