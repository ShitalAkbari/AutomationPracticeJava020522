Feature: Sign In

  Background:
    Given I enter url as "http://automationpractice.com/index.php"
    When I click on sign in button on home page at the top right corner
    Then I should see create an account panel on the left side and already register panel on the right side.

  Scenario: Enter valid user details
    Given I enter valid email address as "tasteortest@gmail.com"
    When I click create an account button
    Then I should see your personal information panel

  Scenario: Enter invalid user details
    Given I enter invalid email address as "tasteortestgmail.com"
    When I click create an account button
    Then I should see a message as "Invalid email address."

  Scenario: do not enter any user details
    Given I left it black as email address
    When I click create an account button
    Then I should see a message as "Invalid email address."


  Scenario Outline: Enter invalid user details
    Given I enter below
    Examples:
      | Email ID             |
      | tasteortestgmail.com |
      |                      |
    When I click create an account button
    Then I should see a message as "Invalid email address"

