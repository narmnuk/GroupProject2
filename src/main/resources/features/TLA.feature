Feature: TLA scenarios

  Background:
    Given I navigate to TLA
    Then I input email as "kuba@gmail.com"
    Then I input password as "123456"
    And I click on "Login" button

  Scenario: Verify title of the page
    Then Verify title of the page should be "Home Page"