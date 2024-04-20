
Feature: Bing Search functionality
  Agile story : As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  @wip
  Scenario: Search Bing result title verification
    Given user is on the Bing search page
    When user searches for Flowers
    Then user should see orange in the title


  Scenario: Search Bing result title verification
    Given user is on the Bing search page
    When user searches for "Tesla"
    Then user should see "Tesla - Google Suche" in the titlee


