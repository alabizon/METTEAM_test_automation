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
formatter.step({
  "name": "Click ellipsis button next to Parent field",
  "keyword": "And "
});
formatter.step({
  "name": "\"Find Asset\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cBarcode\u003e\" to the search criteria and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Standard_Type is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Standard checkbox and verify Standard_Type is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to Type_Description field",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Find \"Description\" by entering Type_Description and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Yes button on the alert window",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and verify Attention is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button on the Attention window",
  "keyword": "Then "
});
formatter.step({
  "name": "Select \"\u003cStandard_Type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cPhysical_Location\u003e\" and enter \"\u003cPurchase_Date\u003e\" and enter \"\u003cIn_Service_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cWarranty_Date\u003e\" date and enter \"\u003cDate_Inventoried\u003e\" date",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to Inventoried_By field",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find User\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Find \"Administrator\" by entering Last Name and then click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Enter group \"\u003cGroup\u003e\" and enter \"\u003cAssigned_Contact\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Assigned Number \"\u003cAssigned_Number\u003e\" and enter \"\u003cAssigned_Date\u003e\" and enter \"\u003cOptional_1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Save buttn and click Close button",
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
        "Barcode",
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
        "SAMPLE-10",
        "Primary",
        "TestPhysicalLocation",
        "04/24/2023",
        "04/26/2023",
        "04/24/2024",
        "04/25/2023",
        "TestGroup",
        "TestAssignedCont",
        "00001",
        "04/26/2023",
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
formatter.step({
  "name": "Click ellipsis button next to Parent field",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_ellipsis_button_next_to_Parent_field()"
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
  "name": "Enter \"SAMPLE-10\" to the search criteria and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_to_the_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_On_Site_checkbox_and_click_Not_Tracked_checkbox_and_click_Optional_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Standard_Type is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.verify_Standard_Type_is_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Standard checkbox and verify Standard_Type is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_Standard_checkbox_and_verify_Standard_Type_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to Type_Description field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_ellipsis_button_next_to_Type_Description_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Description\" by entering Type_Description and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.find_by_entering_Type_Description_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yes button on the alert window",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_Yes_button_on_the_alert_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and verify Attention is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_Save_button_and_verify_Attention_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button on the Attention window",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_OK_button_on_the_Attention_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Primary\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"TestPhysicalLocation\" and enter \"04/24/2023\" and enter \"04/26/2023\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_and_enter_and_enter_and_enter(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"04/24/2024\" date and enter \"04/25/2023\" date",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_date_and_enter_date(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to Inventoried_By field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.click_ellipsis_button_next_to_Inventoried_By_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find User\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Administrator\" by entering Last Name and then click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.find_by_entering_Last_Name_and_then_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter group \"TestGroup\" and enter \"TestAssignedCont\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_group_and_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Assigned Number \"00001\" and enter \"04/26/2023\" and enter \"Test_Opt\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAsset.enter_Assigned_Number_and_enter_and_enter(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save buttn and click Close button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_save_buttn_and_click_close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Asset");
formatter.after({
  "status": "passed"
});
});