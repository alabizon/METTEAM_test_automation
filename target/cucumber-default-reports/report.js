$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateType.feature");
formatter.feature({
  "name": "Create Type Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression2"
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
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.step({
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression2"
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
  "name": "Click Maintenance and click Type",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateType.click_Maintenance_and_click_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Type\" findType_window is open and click Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.findType_window_is_open_and_click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Type\" window is open and enter Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateType.window_is_open_and_enter_Description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Item_Cost and enter Replace_Cost",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateType.enter_Item_Cost_and_enter_Replace_Cost()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d/html/body/div[4]/div/form/div[1]/div/div/input[7]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WIN-11-EN\u0027, ip: \u0027192.168.78.248\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.clear(Unknown Source)\r\n\tat utils.CommonMethods.sendKeys(CommonMethods.java:45)\r\n\tat stepDefinitions.CreateType.enter_Item_Cost_and_enter_Replace_Cost(CreateType.java:40)\r\n\tat ✽.Enter Item_Cost and enter Replace_Cost(file:///C:/Users/Test_User/eclipse-workspace/METTEAM_Test_Automation/src/test/resources/features/CreateType.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : }\n  (Session info: chrome\u003d111.0.5563.147): {Alert text : \nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WIN-11-EN\u0027, ip: \u0027192.168.78.248\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.147, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\TEST_U~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51938}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 54dac47e5293b4ff5d2d6291ccc330a5\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat utils.CommonMethods.takeScreenshot(CommonMethods.java:166)\r\n\tat stepDefinitions.Hooks.endTest(Hooks.java:21)\r\n",
  "status": "failed"
});
});