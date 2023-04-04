$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "MetTeam user story login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Denys"
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
  "name": "Verify you login in as \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginValidCredentials.verify_you_login_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam user story login");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "MetTeam user story with login Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Denys"
    }
  ]
});
formatter.step({
  "name": "Login With invalid login \"\u003cLogin\u003e\" and valid password \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "verify error message \"\u003ctext from page\u003e\" from the page and header \"\u003cHeader\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Login",
        "Password",
        "text from page",
        "Header"
      ]
    },
    {
      "cells": [
        "admin1",
        "admin",
        "Invalid User Name or Password",
        "Login Error"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam user story with login Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Denys"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login With invalid login \"admin1\" and valid password \"admin\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginInvalidCredentials.login_With_ivalid_login_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message \"Invalid User Name or Password\" from the page and header \"Login Error\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginInvalidCredentials.verify_error_message_from_the_page_and_header(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "MetTeam user story with login Invalid Credentials");
formatter.after({
  "status": "passed"
});
});