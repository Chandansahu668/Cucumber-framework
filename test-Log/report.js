$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Yankee Candle Feature",
  "description": "",
  "id": "yankee-candle-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Yankee Candle Login Test Scenario",
  "description": "",
  "id": "yankee-candle-feature;yankee-candle-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User in on Home Page.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The Page Title is Yankee Candle.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on sign in link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User is get sign in.",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "yankee-candle-feature;yankee-candle-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 14,
      "id": "yankee-candle-feature;yankee-candle-login-test-scenario;;1"
    },
    {
      "cells": [
        "cts147@gmail.com",
        "Test123"
      ],
      "line": 15,
      "id": "yankee-candle-feature;yankee-candle-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Yankee Candle Login Test Scenario",
  "description": "",
  "id": "yankee-candle-feature;yankee-candle-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User in on Home Page.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The Page Title is Yankee Candle.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on sign in link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"cts147@gmail.com\" and \"Test123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User is get sign in.",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefination.user_in_on_Home_Page()"
});
formatter.result({
  "duration": 40607522936,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.the_Page_Title_is_Yankee_Candle()"
});
formatter.result({
  "duration": 16983914939,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_clicks_on_sign_in_link()"
});
formatter.result({
  "duration": 16173660251,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_is_on_sign_in_page()"
});
formatter.result({
  "duration": 23176564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cts147@gmail.com",
      "offset": 16
    },
    {
      "val": "Test123",
      "offset": 39
    }
  ],
  "location": "loginStepDefination.user_enter_the_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 1732307664,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.click_on_Login_button()"
});
formatter.result({
  "duration": 10899822995,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_is_get_sign_in()"
});
formatter.result({
  "duration": 27933413,
  "status": "passed"
});
formatter.after({
  "duration": 1168694455,
  "status": "passed"
});
formatter.after({
  "duration": 1453794263,
  "status": "passed"
});
});