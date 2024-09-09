Feature: User Registration on the Online Shopping Portal

  Scenario: Successful registration with valid details
    Given user on the registration page
    When user enter a valid email for registration
    And user fill in all mandatory fields with valid details
    And user submit the registration form
    Then user should see a success message confirming my account creation

  Scenario: Registration with an already registered email
    Given user on the registration page
    When user enter an email that is already registered
    And user submit the registration form
    Then user should see an error message indicating the email is already used

  Scenario: Registration with invalid email format
    Given user on the registration page
    When user enter an invalid email format for registration
    And user submit the registration form
    Then user should see an error message indicating the email is invalid

  Scenario: Registration with missing mandatory fields
    Given user on the registration page
    When user enter a valid email for registration
    And user leave some mandatory fields blank
    And user submit the registration form
    Then user should see an error message indicating the missing fields

  Scenario: Registration with invalid password format
    Given user on the registration page
    When user enter a valid email for registration
    And user fill in the password with less than the required characters
    And user submit the registration form
    Then user should see an error message indicating the password format is incorrect

  Scenario: Registration with mismatched passwords
    Given user on the registration page
    When user enter a valid email for registration
    And user fill in the password and confirm password fields with different values
    And user submit the registration form
    Then user should see an error message indicating passwords do not match

  Scenario: Registration with invalid phone number
    Given user on the registration page
    When user enter a valid email for registration
    And user fill in the phone number field with an invalid number
    And user submit the registration form
    Then user should see an error message indicating the phone number is invalid

  Scenario: Registration with valid details but incorrect captcha (if applicable)
    Given user on the registration page
    When user enter a valid email for registration
    And user fill in all mandatory fields with valid details
    And user submit the form with an incorrect captcha
    Then user should see an error message for incorrect captcha