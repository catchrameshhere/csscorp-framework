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
@login
Feature: Login feature
  This feature is used to test the login functionality

  @postive
  Scenario: valid username and valid password test
    Given I am on the login page
    When I enter "dan@gmail.com" and "test1234"
    Then I should successfully login

  @negative
  Scenario Outline: invalid username and invalid password test
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Then Login error should be dispalyed

    Examples: 
      | username              | password         |
      | invalid-dan@gmail.com | test1234         |
      | dan@gmail.com         | invalid-test1234 |
      | invalid-dan@gmail.com | invalid-test1234 |
      |                       | test1234         |
      | invalid-dan@gmail.com |                  |
      |                       |                  |
