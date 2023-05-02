$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ContractPricing.feature");
formatter.feature({
  "name": "Contract Pricing Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Contract Pricing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Contract_Pricing"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Management and click Contract Pricing",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Pricing\" window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Contract Pricing\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Click elipsis bytton next to the Custoner field",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cCustomer\u003e\" into search criteria and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to the Working Facility field",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cWorking_Facility\u003e\" into Facility Name search criteria and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click ellipsis button next to Type Procedure Default field",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find Type Procedure Default\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Find \"Description\" by entering Types Description and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Contract Pricing \"\u003cEffective_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and save Contract Pricing",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Pricing \"\u003cExpire_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and save Contract Pricing",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cPrice\u003e\" to the Price field",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and click Close button to close Contract Pricing screen",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Customer",
        "Working_Facility",
        "Effective_Date",
        "Expire_Date",
        "Price"
      ]
    },
    {
      "cells": [
        "My First Customer",
        "My Lab",
        "03/25/2022",
        "04/25/2022",
        "257.50"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Contract Pricing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Contract_Pricing"
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
  "name": "Click Management and click Contract Pricing",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_Management_and_click_Contract_Pricing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Pricing\" window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Contract Pricing\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click elipsis bytton next to the Custoner field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_elipsis_bytton_next_to_the_Custoner_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"My First Customer\" into search criteria and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.enter_into_search_criteria_and_click_Find_button(java.lang.String)"
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
  "name": "Click ellipsis button next to the Working Facility field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_ellipsis_button_next_to_the_Working_Facility_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"My Lab\" into Facility Name search criteria and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.enter_into_Facility_Name_search_criteria_and_click_Find_button(java.lang.String)"
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
  "name": "Click ellipsis button next to Type Procedure Default field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_ellipsis_button_next_to_Type_Procedure_Default_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type Procedure Default\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Description\" by entering Types Description and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.find_by_entering_Types_Description_and_click_Find_button(java.lang.String)"
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
  "name": "Enter Contract Pricing \"03/25/2022\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.enter_Contract_Pricing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and save Contract Pricing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_Save_button_and_save_Contract_Pricing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Pricing \"04/25/2022\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.enter_Pricing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and save Contract Pricing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_Save_button_and_save_Contract_Pricing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"257.50\" to the Price field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.enter_to_the_Price_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and click Close button to close Contract Pricing screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContractPricing.click_Save_button_and_click_Close_button_to_close_Contract_Pricing_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Contract Pricing");
formatter.after({
  "status": "passed"
});
});