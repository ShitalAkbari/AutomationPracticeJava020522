Feature:personal information panel
##Check the Background steps are correct
  Background:
    Given I enter url as "http://automationpractice.com/index.php"
    Then I create an account

  Scenario: Enter valid personal information
    When I click title as "Mrs"
    And I enter first name as "First name"
    And I enter Last name as "Last name"
    And I enter email ID as "tasteortest@gmail.com"
    And I enter password as "Password1234"
    And I select date of borth as "1 january 2004"
    Then I click sign up for newslatter
    Then I click Receive special offers from our partners!
    And I enter First name as "First name" in your address
    And I enter Last name as "Last name" in your address
    And I enter company name as "123 pvt ltd"
    And I enter address as "21"
    And I enter address line 2 as "Silvia palace"
    And I enter city as "London"
    And I select State as "illinois"
    And I enter zip/postal code as "60412"
    And I select country as "United state"
    And I enter Additional information as "dgffhgjhkj"
    And I enter Home phone as "123456789"
    And I enter Mobile phone as "0798664432"
    And I enter Assign an address alias for future reference as "My Address"
    When I click register button
    Then I should see My account page with ORDER HISTORY AND DETAILS panel,MY CREDIT SLIPS, MY ADDRESSES, MY PERSONAL INFORMATION, MY WISHLISTS