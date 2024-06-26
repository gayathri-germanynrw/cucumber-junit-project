@regression @login
Feature: Library login feature functionality
  As a user, I should be able to login with correct credentials to different accounts.And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For all scenarios user is on the login page of the library application.
    Given user is on the login page of the library application

  @librarian @smoke
  Scenario: Login as librarian

    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student @smoke
  Scenario: Login as Student

    When user enters Student username
    And user enters Student password
    Then user should see the dashboard
    @admin
    Scenario: Login as Admin

      When user enters Admin username
      And user enters Admin password
      Then user should see the dashboard

