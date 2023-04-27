$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Asset.feature");
formatter.feature({
  "name": "Asset Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Asset"
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
  "name": "\"Find Asset\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Barcode\" by entering Barcode and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify ID is ID",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Barcode is Barcode",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Serial Number is \"\u003cSerial_Number\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Customer is  is \"\u003cCustomer\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Department is \"\u003cDepartment\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Parent is  is \"\u003cBarcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Standard Type is \"\u003cStandard_Type\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Physical Location is  is \"\u003cPhysical_Location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Disposition is \"\u003cDisposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Purchase Date is  is \"\u003cPurchase_Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify In Service Date is \"\u003cIn_Service_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Warranty Date is  is \"\u003cWarranty_Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Date Inventoried is \"\u003cDate_Inventoried\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Inventoried By is  is \"\u003cInventoried_By\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type Description is Type_Description",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Group is  is \"\u003cGroup\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Assigned Contact is \"\u003cAssigned_Contact\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Assigned Number is  is \"\u003cAssigned_Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Assigned Date is \"\u003cAssigned_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Optional_1 is  is \"\u003cOptional_1\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Serial_Number",
        "Customer",
        "Department",
        "Barcode",
        "Standard_Type",
        "Physical_Location",
        "Disposition",
        "Purchase_Date",
        "In_Service_Date",
        "Warranty_Date",
        "Date_Inventoried",
        "Inventoried_By",
        "Group",
        "Assigned_Contact",
        "Assigned_Number",
        "Assigned_Date",
        "Optional_1"
      ]
    },
    {
      "cells": [
        "TestSerialNumber",
        "My First Customer",
        "Quality Department",
        "SAMPLE-10",
        "Primary",
        "TestPhysicalLocation",
        "In Service",
        "04/25/2023",
        "04/25/2023",
        "04/25/2024",
        "04/25/2023",
        "System Administrator",
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
  "name": "Verify MET_TEAM Asset",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Asset"
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
  "name": "Find \"Barcode\" by entering Barcode and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.find_by_entering_Barcode_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify ID is ID",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_ID_is_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Barcode is Barcode",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Barcode_is_Barcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Serial Number is \"TestSerialNumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Serial_Number_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Customer is  is \"My First Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Customer_is_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Department is \"Quality Department\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Department_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Parent is  is \"SAMPLE-10\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Parent_is_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Standard Type is \"Primary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Standard_Type_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Physical Location is  is \"TestPhysicalLocation\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Physical_Location_is_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Disposition is \"In Service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Disposition_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Purchase Date is  is \"04/25/2023\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Purchase_Date_is_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify In Service Date is \"04/25/2023\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_In_Service_Date_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Warranty Date is  is \"04/25/2024\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Warranty_Date_is_is(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c04/2[5]/2024\u003e but was:\u003c04/2[4]/2024\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.VerifyAsset.verify_Warranty_Date_is_is(VerifyAsset.java:125)\r\n\tat ✽.Verify Warranty Date is  is \"04/25/2024\"(file:///C:/Users/Test_User/git/METTEAM_test_automation/src/test/resources/features/Asset.feature:66)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Date Inventoried is \"04/25/2023\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Date_Inventoried_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Inventoried By is  is \"System Administrator\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Inventoried_By_is_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Type Description is Type_Description",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Type_Description_is_Type_Description()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Group is  is \"TestGroup\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Group_is_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Assigned Contact is \"TestAssignedCont\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Assigned_Contact_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Assigned Number is  is \"00001\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Assigned_Number_is_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Assigned Date is \"04/26/2023\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Assigned_Date_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Optional_1 is  is \"Test_Opt\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAsset.verify_Optional__is_is(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Verify MET_TEAM Asset");
formatter.after({
  "status": "passed"
});
});