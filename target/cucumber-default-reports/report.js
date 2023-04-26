$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Asset.feature");
formatter.feature({
  "name": "Asset Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Asset"
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
  "name": "\"Find Asset\" window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Asset\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter ID",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Barcode",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Serial_Number",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to Customer field",
  "keyword": "And "
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cCustomer\u003e\" and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to Department field",
  "keyword": "And "
});
formatter.step({
  "name": "\"Select Department\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cDepartment\u003e\" to search criteria and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Customer",
        "Department",
        "Standard_Type",
        "Physical_Location",
        "Purchase_Date",
        "In_Service_Date",
        "Warranty_Date",
        "Date_Inventoried",
        "Group",
        "Assigned_Contact",
        "Assigned_Number",
        "Assigned_Date",
        "Optional_1"
      ]
    },
    {
      "cells": [
        "My First Customer",
        "Quality Department",
        "Primary",
        "TestPhysicalLocation",
        "04/24/2023",
        "04/26/2023",
        "04/24/2024",
        "04/25/2023",
        "TestGroup",
        "TestAssignedCont",
        "00001",
        "004/26/2023",
        "Test_Opt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Asset"
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
  "name": "\"Find Asset\" window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Asset\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter ID",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Barcode",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_Barcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Serial_Number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_Serial_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to Customer field",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_ellipsis_button_next_to_Customer_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"My First Customer\" and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to Department field",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_ellipsis_button_next_to_Department_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Select Department\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Quality Department\" to search criteria and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_to_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Asset");
formatter.after({
  "status": "passed"
});
});