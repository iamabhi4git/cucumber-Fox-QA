Feature: User Registration

  Scenario: Register with Mandatory Fields
    Given the user navigates to the Register Account page
    When the user enters "Abhishek" into the First Name field
    And the user enters "Sharma" into the Last Name field
    And the user enters "89abhi90@gmail.com" into the Email field
    And the user enters "1234567899" into the Telephone field
    And the user enters "12345" into the Password field
    And the user enters "12345" into the Confirm Password field
    And the user selects the Privacy Policy checkbox
    And the user clicks the Continue button
    Then the account should be created successfully

  Scenario: Register with All Fields
    Given the user navigates to the Register Account page
    When the user enters "Abhishek" into the First Name field
    And the user enters "Sharma" into the Last Name field
    And the user enters "89abhi90@gmail.com" into the Email field
    And the user enters "1234567899" into the Telephone field
    And the user enters "12345" into the Password field
    And the user enters "12345" into the Confirm Password field
    And the user selects "Yes" for the Newsletter subscription
    And the user selects the Privacy Policy checkbox
    And the user clicks the Continue button
    Then the account should be created successfully

  Scenario: Register without Providing Any Fields
    Given the user navigates to the Register Account page
    When the user does not enter any details into the fields
    And the user clicks the Continue button
    Then warning messages should be displayed for all mandatory fields

  Scenario: Register with a Duplicate Email Address
    Given the user navigates to the Register Account page
    When the user enters "Abhishek" into the First Name field
    And the user enters "Sharma" into the Last Name field
    And the user enters "89abhi90@gmail.com" into the Email field
    And the user enters "1234567899" into the Telephone field
    And the user enters "12345" into the Password field
    And the user enters "12345" into the Confirm Password field
    And the user selects the Privacy Policy checkbox
    And the user clicks the Continue button
    Then a warning message should be displayed indicating a duplicate email address
