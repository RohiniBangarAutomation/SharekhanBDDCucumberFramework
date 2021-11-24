@Ass12-18
Feature: Sharekhan operations automation feature

  Background: 
    Given user loggs into sharekhan account

  @Ass12
  Scenario: Automate Adding virtual portfolio
    When User clicks view detailed portfolio
    And user clicks add virtual portfolio
    Then User enter portfolio name as "Demo" and click add folder
    Then User verifies Addded folder
    And User clicks Add script in portfolio
    Then User enters values in script and add the script
    Then User Added more scripts with details
    Then User logged out of aplication

  @Ass13
  Scenario: Automate delete scrip
    Then user clicks delete scrip
    Then User validate alert and click ok button
    Then user validate stock gets deleted
    Then User logged out of aplication

  @Ass14
  Scenario: Automate delete virtual portfolio
    Then user clicks virtual portfolio and click delete folder
    Then User validate folder deleted successfully
    Then user validate folder does not appear
    Then User logged out of aplication

  @Ass15
  Scenario: Automate Add watchlist in Marketwatch menu
    Then user clicks Marketwatch menu and clicks create watchlist button
    Then User created watchist name as "DEMOWATCH" and verified
    Then user add scrip to watchlist and verified added successfully
    Then user added few more scrips
    Then User logged out of aplication

  @Ass16
  Scenario: Automate delete scrip from watchlist
    Then user clicks Marketwatch menu
    Then User sects scrip to delete
    Then user click delete scrip and verify its deleted
    Then User logged out of aplication

  @Ass17
  Scenario: Automate delete watchlist
    Then user clicks Marketwatch menu
    Then User clicks delete waltchlist
    Then user verified scrip is deleted
    Then user verified Marketwatch is highlighted and my watchlist is underlined
    Then User logged out of aplication

  @Ass18
  Scenario: Automate My portfolio
    Then User clicks on my portfolio
    Then user verified the heading “MY PORTFOLIO”
    Then user verified tabs “SUMMARY”, “EQUITY”, “MUTUAL FUND” & “VIRTUAL PORTFOLIO”
    Then User logged out of aplication
