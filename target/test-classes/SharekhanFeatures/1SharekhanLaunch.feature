Feature: For Sharekhan Automation

  Background: 
    Given I open chrome
    Then I entered url as "https://www.sharekhan.com/" in browser

  @Ass1
  Scenario: Verify sharekhan launched in chrome
    Then I verify Title and Menu Items
    Then I verify Lgin/Trade button
    Then I close the browser

  @Ass2
  Scenario: To automate Sharekhan main menu
    Then I click on main menu
    And I verify Main menu options
    Then I close the browser
