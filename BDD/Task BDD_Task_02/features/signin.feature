Feature: User Sign-in and Sign-out on the Online Shopping Portal

  Scenario: Successful sign-in with valid credentials
    Given user on the sign-in page
    When user enter valid credentials
    And user submit the sign-in form
    Then user should be redirected to my account page

  Scenario: Sign-in with invalid email format
    Given user on the sign-in page
    When user enter an email with an invalid format
    And user submit the sign-in form
    Then user should see an error message indicating the email is invalid

  Scenario: Sign-in with unregistered email
    Given user on the sign-in page
    When user enter an email that is not registered
    And user submit the sign-in form
    Then user should see an error message indicating the email is not registered

  Scenario: Sign-in with incorrect password
    Given user on the sign-in page
    When user enter a valid registered email
    And user enter an incorrect password
    And user submit the sign-in form
    Then user should see an error message indicating the password is incorrect

  Scenario: Sign-in without entering any credentials
    Given user on the sign-in page
    When user leave the email and password fields blank
    And user submit the sign-in form
    Then user should see an error message indicating the fields are required

  Scenario: Sign-in with a locked account
    Given user on the sign-in page
    When user enter valid credentials for a locked account
    And user submit the sign-in form
    Then user should see an error message indicating the account is locked

  Scenario: Successful sign-out
    Given user logged into my account
    When user click the sign-out button
    Then user should be logged out and redirected to the homepage

  Scenario: Remember me functionality
    Given user on the sign-in page
    When user enter valid credentials
    And user check the "Remember me" option
    And user submit the sign-in form
    Then user should remain signed in after closing and reopening the browser

  Scenario: Forgot password functionality
    Given user on the sign-in page
    When user click on the "Forgot your password?" link
    And user enter my registered email address
    And user submit the password reset request
    Then user should receive an email with instructions to reset my password