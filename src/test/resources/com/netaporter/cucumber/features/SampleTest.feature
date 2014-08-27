Feature: Login Tests

 @Sanity
 Scenario: Attempt to login with unregistered user
   Given I am on the Sample Page
   And I click on sign in link
   When I attempt to sign in with not-registered user
   Then I am returned to the sign in page

  @Sanity @known-failure
  Scenario: Attempt to login with unregistered user (expect failure)
    Given I am on the Sample Page
    And I click on sign in link
    When I attempt to sign in with not-registered user
    Then I am on My Account page