
Feature: Login with parameters

  Scenario: Login as a driver
    Given the user is on the login page
    When user logs in using "user11" and "UserUser123"
    Then the user should be able to login
    And the title should be contains "Dashboard"

    #create the scenario for storemanager and salaesmanager
  Scenario: Login as a store manager
    Given the user is on the login page
    When user logs in using "salesmanager123" and "UserUser123"
    Then the user should be able to login

    Scenario: Login as a sales manager]
      Given the user is on the login page
      When user logs in using "salaesmanager123" and "UserUser123"
      Then the user should be able to login