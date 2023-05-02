$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ContractPricing.feature");
formatter.feature({
  "name": "Contract Pricing Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Contract Pricing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Contract_Pricing"
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
  "name": "\"Find Pricing\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Description\" by entering Description and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button on the \"Find Pricing\" screen",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Customer is \"\u003cCustomer\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Working Facility is \"\u003cWorking_Facility\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Effective Date is \"\u003cEffective_Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Expire Date is \"\u003cExpire_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Contract Price is \"\u003cPrice\u003e\"",
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
  "name": "Verify MET_TEAM Contract Pricing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Contract_Pricing"
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
  "name": "\"Find Pricing\" window is open",
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
  "name": "Click OK button on the \"Find Pricing\" screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.click_OK_button_on_the_screen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Customer is \"My First Customer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.verify_Customer_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Working Facility is \"My Lab\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.verify_Working_Facility_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Effective Date is \"03/25/2022\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.verify_Effective_Date_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Expire Date is \"04/25/2022\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.verify_Expire_Date_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contract Price is \"257.50\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContractPricing.verify_Contract_Price_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Contract Pricing");
formatter.after({
  "status": "passed"
});
});