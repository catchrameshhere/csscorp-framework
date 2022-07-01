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
@validation
Feature: Basic validation testing
  This feature file is used for testing the basic validations

  @positive
  Scenario: Page title validation
    Given I am on the login page
    Then I should be able to see the page title

  @positive
  Scenario: Url validation
    Given I am on the login page
    Then I should be able to see the page url
