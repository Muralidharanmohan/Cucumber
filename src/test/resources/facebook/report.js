$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "Verify Facebook Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Facebook login for valid username and invalid password.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Verify the user is on Facebook page.",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters valid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.step({
  "name": "Error page for invalid password is displayed.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "muralidharan2471995@gmail.com",
        "9894250818"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Facebook login for valid username and invalid password.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Verify the user is on Facebook page.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_is_on_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"muralidharan2471995@gmail.com\" and invalid \"9894250818\".",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error page for invalid password is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_for_invalid_password_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});