$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateAccreditation.feature");
formatter.feature({
  "name": "Create Accreditation Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Parts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression4"
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
  "name": "Click Maintenance and click Accreditations",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Accreditation\" window opens and click Add button",
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
  "name": "MetTeam Parts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression4"
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
  "name": "\"Find Accreditation\" window opens and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreatePart.window_opens_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Parts");
formatter.after({
  "status": "passed"
});
});