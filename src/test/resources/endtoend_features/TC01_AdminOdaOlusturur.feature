@e2e
Feature: Medunna Room Creation

  Background: Sign In Medunna
    Given go to "https://medunna.com"
    When click on user icon
    And click on sign in option
    And send username into username input
    And send password into password input
    And click on sign in submit button

  Scenario: Create Room
    When Click on ItemsAndTitles