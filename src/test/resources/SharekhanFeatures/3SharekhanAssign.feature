Feature: Sharekhan website Automation

  Background: 
    Given user logs into sharekhan account

  @Ass5
  Scenario: Validate Account Page
    Then User Click on Account menu Button
    Then he verified all menus on account page
    Then User logged out of application

  @Ass6
  Scenario: Validate Marketwatch Menu Page
    Then User Click on MarketWatch menu
    Then User verified MyWatchlist
    Then User verified Option Chain
    Then User verified MarketWatch is highlighted
    Then User logged out of application

  @Ass7
  Scenario: Validate Trade Now Menu Page
    Then User Click on Trade Now menu
    Then User verified Trade now page's menu bar
    Then User verified all fields on trade now page
    Then User verified All default options
    Then User logged out of application

  @Ass8
  Scenario: Validate Reports Menu Page
    Then User Click on Reports menu
    Then User validate deafault options
    Then User verifies headers and all links are displayed
    Then User logged out of application

  @Ass9
  Scenario: Automate Fund Transfer
    Then User Click on Account menu Button
    Then User enters 10 rs to transfer the fund
    Then User selects netbanking as payment mode and clicked submit button
    Then User enters details on bank login page and transefered the cash
    Then User logged out of application

  @Ass10
  Scenario: Automate Cash Transfer Options
    Then User Click on Account menu Button
    Then User verifies select segment's default value
    Then User selects Bank to IPO cash transfer
    Then User selects Bank to mutual fund cash transfer
    Then User logged out of application

  @Ass11
  Scenario: Validate select segment of Cash Transfer
    Then User Click on Account menu Button
    Then User verifies all select segment's drop down values
    Then User logged out of application
