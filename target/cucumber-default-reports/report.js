$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Facility.feature");
formatter.feature({
  "name": "Facility Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Facility"
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
  "name": "\"Find Facility\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Facility Name\" by entering Facility Name and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button and \"Edit Facility\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Facility_Name is Facility Name",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Tax Number is \"\u003cTax_Number\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Facility Number is \"\u003cFacility_Num\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Fed Number is \"\u003cFed_Num\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Industry Code is \"\u003cIndustry_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Account Number is \"\u003cAcc_Num\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Company Code is \"\u003cCompany_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Shipping Method is \"\u003cShip_Method\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Facility Web Site is \"\u003cWeb_Site\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Recall Rule is \"\u003cRecall_Rule\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Tax Rate is \"\u003cTax_Rate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Hourly Rate is \"\u003cHourly_Rate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Discount is \"\u003cDiscount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Expedite Fee is \"\u003cExpedite_Fee\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Customet checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Inspect All checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Manufacturer checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Sub Contractor checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Lab checkbox is checked",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Optional 1 checkbox is checked",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Tax_Number",
        "Facility_Num",
        "Fed_Num",
        "Industry_Code",
        "Acc_Num",
        "Company_Code",
        "Ship_Method",
        "Web_Site",
        "Recall_Rule",
        "Tax_Rate",
        "Hourly_Rate",
        "Discount",
        "Expedite_Fee"
      ]
    },
    {
      "cells": [
        "33333",
        "12345",
        "44444",
        "66666",
        "77777",
        "88888",
        "FedEx",
        "www.MyFacility.com",
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
  "name": "Verify MET_TEAM Facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Facility"
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
  "name": "\"Find Facility\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Facility Name\" by entering Facility Name and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.find_by_entering_Facility_Name_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and \"Edit Facility\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Facility_Name is Facility Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Facility_Name_is_Facility_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Tax Number is \"33333\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Tax_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Facility Number is \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Facility_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Fed Number is \"44444\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Fed_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Industry Code is \"66666\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Industry_Code_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Account Number is \"77777\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Account_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Company Code is \"88888\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Company_Code_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Shipping Method is \"FedEx\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Shipping_Method_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Facility Web Site is \"www.MyFacility.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Facility_Web_Site_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Recall Rule is \"End of Month\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Recall_Rule_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Tax Rate is \"9.8\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Tax_Rate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Hourly Rate is \"50.50\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Hourly_Rate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Discount is \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Discount_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Expedite Fee is \"75.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Expedite_Fee_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Customet checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Customet_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Inspect All checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Inspect_All_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Manufacturer checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Manufacturer_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Sub Contractor checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Sub_Contractor_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Lab checkbox is checked",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Lab_checkbox_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Optional 1 checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyFacility.verify_Optional_checkbox_is_checked(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Facility");
formatter.after({
  "status": "passed"
});
});