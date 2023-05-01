$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Accreditation.feature");
formatter.feature({
  "name": "Accreditation Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Accreditation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Accreditation"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Accreditations",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Accreditation\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Add button and \"Add Accreditation\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Code and enter Type and enter Description",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Start_Date and enter End_Date",
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
        ""
      ]
    },
    {
      "cells": [
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Accreditation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Accreditation"
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
  "name": "Click Maintenance and click Accreditations",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.click_Maintenance_and_click_Accreditations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Accreditation\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add button and \"Add Accreditation\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.click_Add_button_and_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Code and enter Type and enter Description",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.enter_Code_and_enter_Type_and_enter_Description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Start_Date and enter End_Date",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.enter_Start_Date_and_enter_End_Date()"
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
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Accreditation");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Accreditation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Accreditation"
    },
    {
      "name": "@Create_Accreditation"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Accreditations",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Accreditation\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Number\" by entering Accreditation Code and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button and \"Edit Accreditation\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Code is Code",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Type is \"\u003cType\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Description is \"\u003cDescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Start_Date is \"\u003cStart_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify End_Date is \"\u003cEnd_Date\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Type",
        "Description",
        "Start_Date",
        "End_Date"
      ]
    },
    {
      "cells": [
        "22",
        "Auto",
        "07/15/2022",
        "11/21/2022"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Accreditation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Accreditation"
    },
    {
      "name": "@Create_Accreditation"
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
  "name": "Click Maintenance and click Accreditations",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.click_Maintenance_and_click_Accreditations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Accreditation\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Number\" by entering Accreditation Code and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.find_by_entering_Accreditation_Code_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and \"Edit Accreditation\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Code is Code",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_Code_is_Code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Type is \"22\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_Type_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Description is \"Auto\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_Description_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Start_Date is \"07/15/2022\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_Start_Date_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify End_Date is \"11/21/2022\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_End_Date_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Verify MET_TEAM Accreditation");
formatter.after({
  "status": "passed"
});
});