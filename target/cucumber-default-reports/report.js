$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Template.feature");
formatter.feature({
  "name": "Template Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create MET_TEAM Template",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Template"
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
  "name": "Click Maintenance and click Manual Templates",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Manual Template\" window opens and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Manual Template\" window is open and enter Template Name and click Template_Design tab",
  "keyword": "And "
});
formatter.step({
  "name": "drag right border, extend and drop it",
  "keyword": "Then "
});
formatter.step({
  "name": "Right-click and select \"Step Wizard\" from context menu",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Start, End, Step Size and select \"\u003cUnit\u003e\" Unit",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter %Reading, %FS, Floor and Resolution",
  "keyword": "And "
});
formatter.step({
  "name": "Click Save wizard, click Save template and click Close",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Unit",
        ""
      ]
    },
    {
      "cells": [
        "mV",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create MET_TEAM Template",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Template"
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
  "location": "stepDefinitions.LoginValidCredentials.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Maintenance and click Manual Templates",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.click_Maintenance_and_click_Manual_Templates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Manual Template\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Manual Template\" window is open and enter Template Name and click Template_Design tab",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.window_is_open_and_enter_Template_Name_and_click_Template_Design_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "drag right border, extend and drop it",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.drag_right_border_extend_and_drop_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Right-click and select \"Step Wizard\" from context menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.right_click_and_select_from_context_menu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Start, End, Step Size and select \"mV\" Unit",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.enter_Start_End_Step_Size_and_select_Unit(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter %Reading, %FS, Floor and Resolution",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.enter_Reading_FS_Floor_and_Resolution()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save wizard, click Save template and click Close",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateTemplate.click_Save_wizard_click_Save_template_and_click_Close()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create MET_TEAM Template");
formatter.after({
  "status": "passed"
});
});