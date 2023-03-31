$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreatePart.feature");
formatter.feature({
  "name": "Create Part Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Parts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression3"
    },
    {
      "name": "@Alex"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Maintenance and click Parts",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Part\" window opens and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Part\" wnd is open and enter Description",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Part_Number and enter On_Hand and enter Re_Order and enter Last_Qty",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button nxt to the Manufacturer \"Find Manufacturer\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value_Manufacturer\u003e\" and click Find buttn",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button and enter Class and enter Purchase_Units and enter Price",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Stock_Number and enter Group",
  "keyword": "Then "
});
formatter.step({
  "name": "Click ellipsis button next to the InventoriedBy \"Find Inventoried By\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value_Last\u003e\" and click Find btn",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button and enter Date_Inventoried and enter Cost",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Location and enter Supplier and enter Last_Ordered and enter Last_Cost",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Save btn and click Close button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search_Value_Manufacturer",
        "Search_Value_Last"
      ]
    },
    {
      "cells": [
        "Fluke",
        "Administrator"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam Parts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression3"
    },
    {
      "name": "@Alex"
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
  "location": "stepDefinitions.LoginPageStepDefinitions.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Maintenance and click Parts",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_Maintenance_and_click_Parts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Part\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Part\" wnd is open and enter Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.wnd_is_open_and_enter_Description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Part_Number and enter On_Hand and enter Re_Order and enter Last_Qty",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.enter_Part_Number_and_enter_On_Hand_and_enter_Re_Order_and_enter_Last_Qty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button nxt to the Manufacturer \"Find Manufacturer\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_ellipsis_button_nxt_to_the_Manufacturer_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Fluke\" and click Find buttn",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.enter_and_click_Find_buttn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and enter Class and enter Purchase_Units and enter Price",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_OK_button_and_enter_Class_and_enter_Purchase_Units_and_enter_Price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Stock_Number and enter Group",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.enter_Stock_Number_and_enter_Group()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ellipsis button next to the InventoriedBy \"Find Inventoried By\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_ellipsis_button_next_to_the_InventoriedBy_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Administrator\" and click Find btn",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.enter_and_click_Find_btn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button and enter Date_Inventoried and enter Cost",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_OK_button_and_enter_Date_Inventoried_and_enter_Cost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Location and enter Supplier and enter Last_Ordered and enter Last_Cost",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.enter_Location_and_enter_Supplier_and_enter_Last_Ordered_and_enter_Last_Cost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save btn and click Close button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.click_Save_btn_and_click_Close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Parts");
formatter.after({
  "status": "passed"
});
});