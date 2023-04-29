$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Facility.feature");
formatter.feature({
  "name": "Facility Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Facility"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Facilities",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Facility\" window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Facility Name and enter Tax Number and enter Facility Number and enter Fed Number",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Industry Code and enter Account Number and enter Company Code and enter Web Site",
  "keyword": "And "
});
formatter.step({
  "name": "Select \"\u003cShipping_Method\u003e\" for the Shipping Method and select \"\u003cRecall_Rule\u003e\" Recall Rule",
  "keyword": "Then "
});
formatter.step({
  "name": "Check Manufacturer checkbox and check Sub Contractor checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"Inspect All\" checkbox is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Lab checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"Inspect All\" checkbox is enabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify \"No Tax\" checkbox is disabled",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is disabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Customer checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"No Tax\" checkbox is enabled",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Check Optional1 checkbox and check Inspect All checkbox and check No Tax checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is disabled",
  "keyword": "And "
});
formatter.step({
  "name": "Uncheck No Tax checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Tax Rate \"\u003cTax_Rate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Hourly Rate \"\u003cHourly_Rate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Discount \"\u003cDiscount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Expedite Fee \"\u003cExpedite_Fee\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Shipping_Method",
        "Recall_Rule",
        "Tax_Rate",
        "Hourly_Rate",
        "Discount",
        "Expedite_Fee"
      ]
    },
    {
      "cells": [
        "FedEx",
        "End of Month",
        "9.8",
        "50.50",
        "5",
        "75.00"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Facility"
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
  "name": "Click Maintenance and click Facilities",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.click_Maintenance_and_click_Facilities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Facility\" window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateProcedure.window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Facility Name and enter Tax Number and enter Facility Number and enter Fed Number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Facility_Name_and_enter_Tax_Number_and_enter_Facility_Number_and_enter_Fed_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Industry Code and enter Account Number and enter Company Code and enter Web Site",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Industry_Code_and_enter_Account_Number_and_enter_Company_Code_and_enter_Web_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"FedEx\" for the Shipping Method and select \"End of Month\" Recall Rule",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.select_for_the_Shipping_Method_and_select_Recall_Rule(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Manufacturer checkbox and check Sub Contractor checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.check_Manufacturer_checkbox_and_check_Sub_Contractor_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Inspect All\" checkbox is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_checkbox_is_disabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Lab checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.click_Lab_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Inspect All\" checkbox is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_checkbox_is_enabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"No Tax\" checkbox is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_checkbox_is_disabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_field_is_disabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Customer checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.click_Customer_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"No Tax\" checkbox is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_checkbox_is_enabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_field_is_enabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Optional1 checkbox and check Inspect All checkbox and check No Tax checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.check_Optional1_checkbox_and_check_Inspect_All_checkbox_and_check_No_Tax_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Tax Rate\" field is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.verify_field_is_disabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Uncheck No Tax checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.uncheck_No_Tax_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Tax Rate \"9.8\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Tax_Rate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Hourly Rate \"50.50\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Hourly_Rate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Discount \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Discount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Expedite Fee \"75.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateFacility.enter_Expedite_Fee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Facility");
formatter.after({
  "status": "passed"
});
});