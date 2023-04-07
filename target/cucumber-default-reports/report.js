$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateGroup.feature");
formatter.feature({
  "name": "Create Group Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Group",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Group"
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
  "name": "Click Configure and click Groups",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Groups\" window opens",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Add button and \"Add Group\" window is open",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Group_Name and click Save",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Add New Member button and \"Find User\" window opens",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003cSearch_Value\u003e\" and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Close button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Setup and click Users",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Find User\" window opens",
  "keyword": "And "
});
formatter.step({
  "name": "Fill Search_Value with \"\u003cSearch_Value\u003e\" and click Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "Click OK button",
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
        "Administrator"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam Group",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Group"
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
  "name": "Click Configure and click Groups",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateGroup.click_Configure_and_click_Groups()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Groups\" window opens",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add button and \"Add Group\" window is open",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.click_Add_button_and_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Group_Name and click Save",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateGroup.enter_Group_Name_and_click_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add New Member button and \"Find User\" window opens",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateGroup.click_Add_New_Member_button_and_window_opens(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Administrator\" and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Close button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateGroup.click_Close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Setup and click Users",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateUser.click_Setup_and_click_Userss()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find User\" window opens",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.window_opens(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#frame_1\"}\n  (Session info: chrome\u003d111.0.5563.147)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WIN-11-EN\u0027, ip: \u0027192.168.78.248\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.147, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\TEST_U~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51668}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ae36db13c842dde18469803641ed4b27\n*** Element info: {Using\u003did, value\u003dframe_1}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy20.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:891)\r\n\tat utils.CommonMethods.swithToFrame(CommonMethods.java:278)\r\n\tat stepDefinitions.CreateAccreditation.window_opens(CreateAccreditation.java:25)\r\n\tat ✽.\"Find User\" window opens(file:///C:/Users/Test_User/eclipse-workspace/METTEAM_Test_Automation/src/test/resources/features/CreateGroup.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Fill Search_Value with \"Administrator\" and click Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateGroup.fill_Search_Value_with_and_click_Find_button(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click OK button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateContact.click_OK_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Group");
formatter.after({
  "status": "passed"
});
});