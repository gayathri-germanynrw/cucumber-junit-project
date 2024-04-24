@wikiSearch_functionality
Feature: Wikipedia search functionality
  Agile Story : As a user,When i am in Wikipedia home page i should be able
    to enter Steve Jobs in search and sees Steve Jobs in Wiki title

  @wikiSearch
Scenario: Search in Wikipedia and title verification
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box and click button
  Then User sees "Steve Jobs" is in the wiki title

  @wikiSearch_header
  Scenario: Search in Wikipedia and see main header
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box and click button
    Then User sees "Steve Jobs" is in the main header

  @wikiSearch_image
  Scenario: Search in Wikipedia and see main header
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box and click button
    Then User sees "Steve Jobs" image  is in the image header


