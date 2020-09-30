Feature:
  LibertyMutual Customer Support Button check
  LibertyMutual Covid-19 support Button check
  LibertyMutual frequently Asked Questions Button check
  LibertyMutual Manage your policy Button check
  LibertyMutual Billing & payment options Button check



  Background:
    Given I am in LibertyMutual homepage
    And I click on Customer Support Button

  @Regression
  Scenario: LibertyMutual Customer Support Button check
    And I click on Customer Support Button
    Then I verify Customer Support is appear properly
    And I verify page title as Customer Support

  @Regression
  Scenario: LibertyMutual Covid-19 support Button check
    And I click on Covid support Button
    Then I verify Covid support is appear properly
    And I verify page title as Covid support Support

  @Regression
  Scenario: LibertyMutual frequently Asked Questions Button check
    And I click on frequently Asked Questions Button
    Then I verify frequently Asked Questions is appear properly
    And I verify page title as frequently Asked Questions Support

  @Regression
  Scenario: LibertyMutual Manage your policy Button check
    And I click on Manage your policy Button
    Then I verify Manage your policy is appear properly
    And I verify page title as Manage your policy Support

  @Regression
  Scenario: LibertyMutual Billing & payment options Button check
    And I click on Billing & payment options Button
    Then I verify Billing & payment options is appear properly
    And I verify page title as Billing & payment options Support
