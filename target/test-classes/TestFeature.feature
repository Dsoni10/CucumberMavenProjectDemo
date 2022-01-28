Feature: Web login
  Scenario Outline: check login
  --Scenario: User should be able to login with valid credential
    Given  User is on login page
    When  The user enters valid credential
    And  Click on Submit
    Then user should be logged in sucessfully

    Examples:

    |username|
    |abc|
    |xyz|