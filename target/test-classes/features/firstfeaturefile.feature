
Feature: First Feature File


  Scenario: First Scenario
    Given user is on the google page
    When user search for Iphone on google
    Then verify the page title contains iPhone
    And close the application
