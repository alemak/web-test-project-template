Feature: Try to Sign In

  Scenario: Sign-In Unsuccessful nothing entered
    Given I navigate to the sign in page
    When I click the Sign In Now button on the sign-in page
    Then An error message is displayed containing the text Please enter an email address
  @known-failure
  Scenario: Forgotten password
    Given I navigate to the sign in page
    When I click the "Forgotten Password" link
    Then I am taken to "Forgotten Password" page
