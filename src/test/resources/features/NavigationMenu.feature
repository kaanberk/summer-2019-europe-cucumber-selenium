@NavigationMenu
Feature: Navigation Menu

  Scenario: Fleet --> Vehicles
    Given the user should be on the dashboard by entering sales manager credentials
    When the user navigate from Fleet to Vehicles module
    Then user should be on the https://qa3.vytrack.com/entity/fleet

  Scenario: Navigate from Marketing module to Campaings
    Given the user should be on the dashboard by entering sales manager credentials
    When the user navigate to Campaings through Marketing module
    Then user should be on the https://qa3.vytrack.com/campaig

  Scenario: Navigate from Activities to Calendar
    Given the user should be on the dashboard by entering sales manager credentials
    When the user navigate from activities to calendar module
    Then user should be on the https://qa3.vytrack.com/calendar/event