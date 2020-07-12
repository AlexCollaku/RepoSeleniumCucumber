Feature: FB Links

  Scenario: Verify Terms link takes goes to correct web page
    Given I am on facebook landing page now
    When I click on Terms link
    Then I verify user is on 'Terms of Service' page title
    And I verify facebook landing page is open
    And I close all facebook windows


  Scenario: Verify Data Policy takes goes to correct web page
    Given I am on facebook landing page now
    When I click on Data Policy link
    Then I verify user is on 'Data Policy' page title
    And I verify facebook landing page is open
    And I close all facebook windows


  Scenario: Verify Cookie Policy takes goes to correct web page
    Given I am on facebook landing page now
    When I click on Cookie Policy
    Then I verify user is on 'Cookie Policy' page title
    And I verify facebook landing page is open
    And I close all facebook windows

