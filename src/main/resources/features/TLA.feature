Feature: TLA scenarios

  Background:
    Given I navigate to TLA
    When I input email as "kuba@gmail.com"
    And I input password as "123456"
    Then I click on "login" button

  Scenario: Instructor should be able to see Homeworks navigation button
    Then I should be able to see Homeworks button is displayed
    When I click on "homeworks" button
    Then Title of the page should be "Homework"

  Scenario: Instructor should be able to see Meeting Links navigation button
    Then I should be able to see Meeting Links button is displayed
    When I click on "meeting" button
    Then Title of the page should be "Meeting Links"

  Scenario: Instructor should be able to see Manage Access navigation button
    Then I should be able to see Manage Access button is displayed
    When I click on "access" button
    Then Title of the page should be "Access Management"