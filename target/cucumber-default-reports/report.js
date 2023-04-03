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
formatter.step({
  "name": "Enter Type and enter Description",
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
formatter.step({
  "name": "Enter Type and enter Description",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateAccreditation.enter_Type_and_enter_Description()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027cType\u0027 and @class \u003d \u0027x-form-text x-form-field x-abs-layout-item\u0027]\"}\n  (Session info: chrome\u003d111.0.5563.147)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WIN-11-EN\u0027, ip: \u0027192.168.78.248\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.147, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\TEST_U~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:64787}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 22f641e34ef4ceddec44a2405b3663da\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027cType\u0027 and @class \u003d \u0027x-form-text x-form-field x-abs-layout-item\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy20.clear(Unknown Source)\r\n\tat utils.CommonMethods.sendKeys(CommonMethods.java:45)\r\n\tat stepDefinitions.CreateAccreditation.enter_Type_and_enter_Description(CreateAccreditation.java:36)\r\n\tat ✽.Enter Type and enter Description(file:///C:/Users/Test_User/eclipse-workspace/METTEAM_Test_Automation/src/test/resources/features/CreateAccreditation.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam Parts");
formatter.after({
  "status": "passed"
});
});