Feature: Search

  Scenario: As a user I want to be able to Search for products

    Given the user is in the landing page
    When the user inserts keywords in the search bar
    And the user clicks the search button
    Then the SearchResults Page is displayed