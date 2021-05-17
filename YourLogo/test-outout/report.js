$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "YourLogo Registration and Login feature",
  "description": "I want to use this template for my feature file",
  "id": "yourlogo-registration-and-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "YourLogo Registration and Login Test scenario",
  "description": "",
  "id": "yourlogo-registration-and-login-feature;yourlogo-registration-and-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User is on YourLogo Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Landing Page SignIn Link is Available",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User clicks on SignIn Link",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User Click on Create Account using new emailID",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User Registers by providing personal details",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User is on HomePage to verify his name",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Logsout of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_in_LandingPage()"
});
formatter.result({
  "duration": 29231076323,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.SignIn_Link_Prsence()"
});
formatter.result({
  "duration": 232898938,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Click_on_SignIn_Link()"
});
formatter.result({
  "duration": 4065780424,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_on_LoginPage()"
});
formatter.result({
  "duration": 179763383,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Click_on_CreateAccount()"
});
formatter.result({
  "duration": 513451727,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_Registration()"
});
formatter.result({
  "duration": 10067090284,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_HomePageValidation()"
});
formatter.result({
  "duration": 142703896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Application_Logout()"
});
formatter.result({
  "duration": 10003136067,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "YourLogo Add Product and verify Product Details Test scenario",
  "description": "",
  "id": "yourlogo-registration-and-login-feature;yourlogo-add-product-and-verify-product-details-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User is on YourLogo Landing Page_AddProductTestScenario",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "Landing Page SignIn Link is Available_AddProductTestScenario",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User clicks on SignIn Link_AddProductTestScenario",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User is on Login Page_AddProductTestScenario",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User enters mailid and password to login to application_AddProductTestScenario",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User navigates to Tshirt section and adds Tshirt to cart_AddProductTestScenario",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User proceeds with Cart Pages_AddProductTestScenario",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "in Cart Payments Page user verifies the product details with actual product details_AddProductTestScenario",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Logsout of the application_AddProductTestScenario",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductStepDefinition.User_in_LandingPage()"
});
formatter.result({
  "duration": 17898264640,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.SignIn_Link_Prsence()"
});
formatter.result({
  "duration": 176869065,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.Click_on_SignIn_Link()"
});
formatter.result({
  "duration": 9251035774,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.User_on_LoginPage()"
});
formatter.result({
  "duration": 170595904,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.User_Login_to_Application()"
});
formatter.result({
  "duration": 10651007545,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.User_Add_TShirt_to_Cart()"
});
formatter.result({
  "duration": 29276249551,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.User_Proceed_with_CartPage()"
});
formatter.result({
  "duration": 25529672535,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.VerifyProductDetails_inCartPaymentsPage()"
});
formatter.result({
  "duration": 415994970,
  "status": "passed"
});
formatter.match({
  "location": "AddProductStepDefinition.Application_Logout()"
});
formatter.result({
  "duration": 5404180054,
  "status": "passed"
});
});