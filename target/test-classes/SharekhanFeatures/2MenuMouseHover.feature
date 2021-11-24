Feature: For Sharekhan Menu Automation

  Background: 
    Given I open chrome
    Then I entered url as "https://www.sharekhan.com/" in browser

  @Ass3
  Scenario: Verify sharekhan menu displays after mouse hover
    Then I Mouse hover on Market,New to Market
    Then I verify Market,new to market menu options
    Then I mouse Hover on Super Investor and Active trader
    Then I verify Super Investor and Active trader menu options
    Then I close the browser

  @Ass4
  Scenario: Verify sharekhan Login
    Then I Entered loginid
    Then I click on next and entered password as "Bangar@2"
    Then I verify All menus
    Then I close the browser
