$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contact.feature");
formatter.feature({
  "name": "Contact Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Contact"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Setup and click Contacts",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Contact\" window opens and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Contact\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Contact_Id and enter First_Name and enter Middle_Name",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Last_Name and Enter Suffix and enter Description",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Fax and enter Phone1",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter Phone2 and enter Cell_Phone",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Email1 and enter Notes",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save button and click Add button next to Facilities grid",
  "keyword": "And "
});
formatter.step({
  "name": "\"Find Facility\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value\u003e\" and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button on the Contacts screen",
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
        "My Lab"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Contact"
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
  "name": "Click Setup and click Contacts",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_Setup_and_click_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Contact\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Contact\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Contact_Id and enter First_Name and enter Middle_Name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.enter_Contact_Id_and_enter_First_Name_and_enter_Middle_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Last_Name and Enter Suffix and enter Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.enter_Last_Name_and_Enter_Suffix_and_enter_Description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Fax and enter Phone1",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.enter_Fax_and_enter_Phone1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Phone2 and enter Cell_Phone",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.enter_Phone2_and_enter_Cell_Phone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email1 and enter Notes",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.enter_Email1_and_enter_Notes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button and click Add button next to Facilities grid",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_Save_button_and_click_Add_button_next_to_Facilities_grid()"
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
  "name": "Enter \"My Lab\" and click Find button",
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
  "name": "Click OK button on the Contacts screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button_on_the_Contacts_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Contact");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify MET_TEAM Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Contact"
    },
    {
      "name": "@Create_Contact"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Setup and click Contacts",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Contact\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Find \"Last Name\" by entering Last Name and click Find button",
  "keyword": "And "
});
formatter.step({
  "name": "Click OK button and \"Edit Contact\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Contact_ID is Contact_ID",
  "keyword": "And "
});
formatter.step({
  "name": "Verify First_Name is \"\u003cFirst_Name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Middle_Name is \"\u003cMid_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Last_Name is Last_Name",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Suffix is \"\u003cSuffix\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Description is \"\u003cDescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Fax is \"\u003cFax\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Phone_1 is \"\u003cPhone1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Phone_Two is \"\u003cPhone_Two\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Cell_Phone is \"\u003cCell_Phone\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Email is \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Notes is \"\u003cNotes\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First_Name",
        "Mid_Name",
        "Suffix",
        "Description",
        "Fax",
        "Phone1",
        "Phone_Two",
        "Cell_Phone",
        "Email",
        "Notes"
      ]
    },
    {
      "cells": [
        "John",
        "Bill",
        "Jr.",
        "Employee",
        "1234",
        "9298875430",
        "9287763287",
        "9292287645",
        "email1@test.com",
        "Test_Notes"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify MET_TEAM Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_Contact"
    },
    {
      "name": "@Create_Contact"
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
  "name": "Click Setup and click Contacts",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_Setup_and_click_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Contact\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find \"Last Name\" by entering Last Name and click Find button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.find_by_entering_Last_Name_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and \"Edit Contact\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.click_OK_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contact_ID is Contact_ID",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Contact_ID_is_Contact_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify First_Name is \"John\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_First_Name_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Middle_Name is \"Bill\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Middle_Name_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Last_Name is Last_Name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Last_Name_is_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Suffix is \"Jr.\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Suffix_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Description is \"Employee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyAccreditation.verify_Description_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Fax is \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Fax_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Phone_1 is \"9298875430\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Phone__is(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Phone_Two is \"9287763287\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Phone_Two_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Cell_Phone is \"9292287645\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Cell_Phone_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Email is \"email1@test.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.VerifyContact.verify_Email_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Notes is \"Test_Notes\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.VerifyShipping.verify_Notes_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Verify MET_TEAM Contact");
formatter.after({
  "status": "passed"
});
});