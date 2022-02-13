Feature: Login Functionality
  Scenario: Login With Valid Credentials
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks login button
    Then the user should be logged in