Feature: Search Functionality

  Scenario: Search for a valid product
    Given the user launches the application
    When the user enters a valid product into the search field
    And the user clicks on the Search button
    Then the valid product should be displayed in the search results

  Scenario: Search for a non-existing product
    Given the user launches the application
    When the user enters a non-existing product into the search field
    And the user clicks on the Search button
    Then a message should be displayed indicating no matching products were found

  Scenario: Search without entering any product
    Given the user launches the application
    When the user does not enter any product into the search field
    And the user clicks on the Search button
    Then a message should be displayed indicating no matching products were found
