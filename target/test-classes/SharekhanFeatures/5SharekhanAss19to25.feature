@Ass19-25
Feature: Autmate sharekhan process

  @Ass19
  Scenario: Automate Tooltip text
    Given User is on home page after login
    Then user verify MyWatchList tooltip
    Then user verify MyPortfolio tooltip
    Then user verify Investment cart
    Then user verified Alert
    Then User signed out of application

  @Ass20
  Scenario: Automate place a buy order
    Given User is on home page after login
    Then user clicked on Trade now button
    Then user searched and selects Opto Circuits scrip
    Then user entered values in all fields
    Then user click on place order
    Then user validate all fields
    Then User signed out of application

  @Ass21
  Scenario: Automate LIMIT BUY ORDER
    Given User is on home page after login
    Then user clicked on Trade now button
    Then user searched and selects idea scrip
    Then user entered limit price to buy scrip
    Then user click on place buy order
    Then User signed out of application

  @Ass22
  Scenario: Automate place a sell order
    Given User is on home page after login
    Then user clicked on Trade now button
    Then user searched and selects Opto Circuits scrip
    Then user entered values in all fields
    Then user entered values in all fields with sell
    Then user click on place order
    Then User signed out of application
    
    @Ass23
  Scenario: Automate LIMIT SELL ORDER
    Given User is on home page after login
    Then user clicked on Trade now button
    Then user searched and selects idea scrip
    Then user entered limit price to sell scrip
    Then user click on place sell order
  

  @Ass24
  Scenario: Automate renaming virtual portfolio
    Given User is on home page after login
    Then user clicked detailed view of portfolio
    Then user renamed the virtual portfoilo
    Then User signed out of application

  @Ass25
  Scenario: Automate renaming watchlist
    Given User is on home page after login
    Then user clicked on the Marketwatch menu
    Then user renamed a watchlist
    Then user verified renamed watchlist
    Then User signed out of application
    #
