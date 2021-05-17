#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: YourLogo Registration and Login feature
  I want to use this template for my feature file

  @tag1
  Scenario: YourLogo Registration and Login Test scenario
    Given User is on YourLogo Landing Page
    When Landing Page SignIn Link is Available
    Then User clicks on SignIn Link
    Then User is on Login Page
    Then User Click on Create Account using new emailID
    Then User Registers by providing personal details
    Then User is on HomePage to verify his name
    Then User Logsout of the application
    
    
    @tag2
   Scenario: YourLogo Add Product and verify Product Details Test scenario
    Given User is on YourLogo Landing Page_AddProductTestScenario
    When Landing Page SignIn Link is Available_AddProductTestScenario
    Then User clicks on SignIn Link_AddProductTestScenario
    Then User is on Login Page_AddProductTestScenario
    Then User enters mailid and password to login to application_AddProductTestScenario
    Then User navigates to Tshirt section and adds Tshirt to cart_AddProductTestScenario
    Then User proceeds with Cart Pages_AddProductTestScenario
    And in Cart Payments Page user verifies the product details with actual product details_AddProductTestScenario
    Then User Logsout of the application_AddProductTestScenario


  
