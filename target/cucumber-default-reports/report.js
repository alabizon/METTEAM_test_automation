$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Type.feature");
formatter.feature({
  "name": "Type Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Type"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to the Manufacturer \"Find Facility\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value\u003e\" and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button and enter Model_Number",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Weight and enter Dimensions",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Size and enter Stock_Number",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Class and enter Family",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save buttn and click Close button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search_Value"
      ]
    },
    {
      "cells": [
        "Fluke"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Type"
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
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_Maintenance_and_click_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.findType_window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.window_is_open_and_enter_Description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Item_Cost_and_enter_Replace_Cost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to the Manufacturer \"Find Facility\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_ellipsis_button_next_to_the_Manufacturer_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Fluke\" and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and enter Model_Number",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_OK_button_and_enter_Model_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Weight and enter Dimensions",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Weight_and_enter_Dimensions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Size and enter Stock_Number",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Size_and_enter_Stock_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Class and enter Family",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Class_and_enter_Family()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save buttn and click Close button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_save_buttn_and_click_close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Type");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Type"
    },
    {
      "name": "@Create_Type"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Description\" by entering Description and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button and \"Edit Type\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Description is Type_Description",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Item_Cost is \"\u003cItem_Cost\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Replace_Cost is \"\u003cReplace_Cost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type_Manufacturer is \"\u003cManufacturer\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Model_Number is \"\u003cModel_Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type_Weight is \"\u003cWeight\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Weight_UOM is \"\u003cWeight_UOM\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type_Size is \"\u003cSize\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Stock_Number is \"\u003cStock_Num\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type_Dimensions is \"\u003cDimensions\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Class is \"\u003cClass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type_Family is \"\u003cFamily\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Type_Authoirty is \"\u003cAuthority\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Item_Cost",
        "Replace_Cost",
        "Manufacturer",
        "Model_Number",
        "Weight",
        "Weight_UOM",
        "Size",
        "Stock_Num",
        "Dimensions",
        "Class",
        "Family",
        "Authority"
      ]
    },
    {
      "cells": [
        "5.00",
        "7.00",
        "Fluke",
        "2468",
        "10",
        "lbs",
        "2x2",
        "369",
        "5x5",
        "TestClass",
        "TestFamily",
        "Default"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Type"
    },
    {
      "name": "@Create_Type"
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
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_Maintenance_and_click_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Description\" by entering Description and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.find_by_entering_Description_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and \"Edit Type\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Description is Type_Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Description_is_Type_Description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Item_Cost is \"5.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Item_Cost_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Replace_Cost is \"7.00\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Replace_Cost_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Manufacturer is \"Fluke\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Manufacturer_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Model_Number is \"2468\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Model_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Weight is \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Weight_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Weight_UOM is \"lbs\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Weight_UOM_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Size is \"2x2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Size_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Stock_Number is \"369\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Stock_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Dimensions is \"5x5\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Dimensions_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Class is \"TestClass\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Class_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Family is \"TestFamily\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Family_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type_Authoirty is \"Default\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyType.verify_Type_Authoirty_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Verify MET_TEAM Type");
formatter.after({
  "status": "passed"
});
});