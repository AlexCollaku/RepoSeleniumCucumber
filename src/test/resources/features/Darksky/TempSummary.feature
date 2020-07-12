Feature: Practice

  Scenario: Verify the temp value
    Given I am on darksky landing page
    When I enter 'tampa' in search box
    And I click on search button
    Then I verify if it is showing the same as a text behind the scenes


  Scenario: Verify the temp value updates as per temp unit selected by user
    Given I am on darksky landing page
    Then I verify feelsLike, low and high temp values are displayed
    When I select "˚C, mph" from temp unit dropdown
    Then I verify feelsLike, low and high temp values changed as per unit selected


