Feature: Today Timeline

  Scenario: Verify the temp values on timeLine is same as in detail section
    Given I am on darksky landing page
    When I scroll to Today timeline
    Then I verify the temp values on timeline is same as detail section