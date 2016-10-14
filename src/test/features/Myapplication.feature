Feature: Smoke testing Amazon

  Scenario: Test login with valid credentials
    Given Open Firefox and start application
    When I enter valid credentials
    Then user should be able to login succesfully