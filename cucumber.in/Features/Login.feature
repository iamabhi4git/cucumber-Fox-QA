Feature: User Login
  Registered User should be able to login to access account details

  Scenario: Login with valid credentials
    Given User navigates to Login Page
    When User enters valid Email address "89abhi90@gmail.com"
    And User enters valid Password "12345"
    And User clicks on Login Button
    Then User should login successfully

  Scenario: Login with invalid credentials
    Given User navigates to Login Page
    When User enters invalid Email address "89abhi900@gmail.com"
    And User enters invalid Password "123456789"
    And User clicks on Login Button
    Then User should get a warning message

  Scenario: Login with valid email address and invalid password
    Given User navigates to Login Page
    When User enters valid Email address "89abhi90@gmail.com"
    And User enters invalid Password "1234567"
    And User clicks on Login Button
    Then User should get a warning message

  Scenario: Login with invalid email address and valid password
    Given User navigates to Login Page
    When User enters invalid Email address "89abhi901@gmail.com"
    And User enters valid Password "12345"
    And User clicks on Login Button
    Then User should get a warning message

  Scenario: Login without any credentials
    Given User navigates to Login Page
    When User does not enter any credentials
    And User clicks on Login Button
    Then User should get a warning message
