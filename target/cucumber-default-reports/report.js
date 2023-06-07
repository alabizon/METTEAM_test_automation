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
formatter.step({
  "name": "Click Department elipsis button and select \"Quality Department\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cLocation\u003e\" and enter \"\u003cQuantity\u003e\" and enter \"\u003cContact Info\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select \"Mechanical\" for Work Area",
  "keyword": "Then "
});
formatter.step({
  "name": "Select \"One Time Only\" for Reason for Service",
  "keyword": "And "
});
formatter.step({
  "name": "Select \"In Tolerance\" for Initial Condition",
  "keyword": "Then "
});
formatter.step({
  "name": "Check On Site checkbox and check Expedite checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Select second asset and verify the Department is blank",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Location is blank",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Work Area is \"Electronic\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Reason of Service is \"Normal Cycle\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Initial Condition is blank",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Quantity is \"1\" and Contact Info is blank",
  "keyword": "And "
});
formatter.step({
  "name": "Verify On Site checkbox is unchecked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Expedite checkbox is unchecked",
  "keyword": "And "
});
formatter.step({
  "name": "Select first asset and check Location checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Select second asset and verify Location is \"\u003cLocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select first asset and uncheck Location checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Select second asset and verify Location is \"\u003cLocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select first asset and click Select button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Department relative checkbox is checked and Location relative checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Work Area relative checkbox is checked and Reason for Service relative checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Initial Condition relative checkbox is checked and Priority relative checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Quantity relative checkbox is checked and Job Number relative checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify On Site relative checkbox is checked and Expedite relative checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify ISOCert relative checkbox is checked and Service Type relative checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Status relative checkbox is checked and Open Date relative checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Required Date relative checkbox is checked and Category relative checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Sub Category relative checkbox is checked and Contact Info relative checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Required Date is Open Date plus 14 days",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cPriority1\u003e\" to Priority and verify Required Date is Open Date plus 3 days",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cPriority2\u003e\" to Priority and Verify Required Date is Open Date plus 7 days",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cPriority3\u003e\" to Priority and click Process button",
  "keyword": "And "
});
formatter.step({
  "name": "cick OK on the Attention message and click Close button",
  "keyword": "Then "
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
        "Contact Info",
        "Priority1",
        "Priority2",
        "Priority3"
      ]
    },
    {
      "cells": [
        "Test_Location",
        "3",
        "Test_Contact",
        "1",
        "2",
        "3"
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
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.double_click_search_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search criteria and enter \"SAMPLE-11\" into Barcode search criteria and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.click_Search_criteria_and_enter_into_Barcode_search_criteria_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Double-click search result again",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.double_click_search_result_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button on the Find Assets to Receive screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.click_OK_button_on_the_Find_Assets_to_Receive_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Department elipsis button and select \"Quality Department\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.click_Department_elipsis_button_and_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Test_Location\" and enter \"3\" and enter \"Test_Contact\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_and_enter_and_enter(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Mechanical\" for Work Area",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_for_Work_Area(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"One Time Only\" for Reason for Service",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_for_Reason_for_Service(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"In Tolerance\" for Initial Condition",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_for_Initial_Condition(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check On Site checkbox and check Expedite checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.check_On_Site_checkbox_and_check_Expedite_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select second asset and verify the Department is blank",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_second_asset_and_verify_the_Department_is_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Location is blank",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Location_is_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Work Area is \"Electronic\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Work_Area_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Reason of Service is \"Normal Cycle\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Reason_of_Service_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Initial Condition is blank",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Initial_Condition_is_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Quantity is \"1\" and Contact Info is blank",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Quantity_is_and_Contact_Info_is_blank(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify On Site checkbox is unchecked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_On_Site_checkbox_is_unchecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Expedite checkbox is unchecked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Expedite_checkbox_is_unchecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select first asset and check Location checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_first_asset_and_check_Location_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select second asset and verify Location is \"Test_Location\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_second_asset_and_verify_Location_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select first asset and uncheck Location checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_first_asset_and_uncheck_Location_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select second asset and verify Location is \"Test_Location\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_second_asset_and_verify_Location_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select first asset and click Select button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.select_first_asset_and_click_Select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Department relative checkbox is checked and Location relative checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Department_relative_checkbox_is_checked_and_Location_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Work Area relative checkbox is checked and Reason for Service relative checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Work_Area_relative_checkbox_is_checked_and_Reason_for_Service_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Initial Condition relative checkbox is checked and Priority relative checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Initial_Condition_relative_checkbox_is_checked_and_Priority_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Quantity relative checkbox is checked and Job Number relative checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Quantity_relative_checkbox_is_checked_and_Job_Number_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify On Site relative checkbox is checked and Expedite relative checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_On_Site_relative_checkbox_is_checked_and_Expedite_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify ISOCert relative checkbox is checked and Service Type relative checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_ISOCert_relative_checkbox_is_checked_and_Service_Type_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Status relative checkbox is checked and Open Date relative checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Status_relative_checkbox_is_checked_and_Open_Date_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Required Date relative checkbox is checked and Category relative checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Required_Date_relative_checkbox_is_checked_and_Category_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Sub Category relative checkbox is checked and Contact Info relative checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Sub_Category_relative_checkbox_is_checked_and_Contact_Info_relative_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Required Date is Open Date plus 14 days",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.verify_Required_Date_is_Open_Date_plus_days(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"1\" to Priority and verify Required Date is Open Date plus 3 days",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_to_Priority_and_verify_Required_Date_is_Open_Date_plus_days(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"2\" to Priority and Verify Required Date is Open Date plus 7 days",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_to_Priority_and_Verify_Required_Date_is_Open_Date_plus_days(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"3\" to Priority and click Process button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.enter_to_Priority_and_click_Process_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cick OK on the Attention message and click Close button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ReceiveAssets.cick_OK_on_the_Attention_message_and_click_Close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam work Order");
formatter.after({
  "status": "passed"
});
});