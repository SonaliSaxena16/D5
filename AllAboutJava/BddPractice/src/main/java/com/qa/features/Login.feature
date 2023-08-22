Background:
Given I am on the Opencart login page

Feature: Opencart login page test

Scenario: Successful login with valid credentials

Given I have entered valid username and password
Then I click on login button
Then I should be logged in successfully
