Feature: Login feature

  Scenario: Verify user get error for invalid credentials
    Given I am on facebook landing page
    When I enter 'abs@test.com' as username
    And I enter 'abc123456' as password
    And I click on login button
    Then I get invalid credentials error message


  Scenario: Verify login and Sign Up buttons are enabled
    Given I am on facebook landing page
    Then I verify login button is enabled
    And I verify Sign Up button is enabled


  Scenario: Verify user get error for invalid phone number
    Given I am on facebook landing page
    When I enter 'Al' as first name
    And I enter 'Bisha' as last name
    And I enter '65684874847' as phone number
    And I enter 'albisha88' as new password
    And I select 'May' as month
    And I select '20' as day
    And I select '1988' as year
    And I select 'male' as gender
    And I click on signup button
    Then I get 'Please enter a valid mobile number or email address.' as error message