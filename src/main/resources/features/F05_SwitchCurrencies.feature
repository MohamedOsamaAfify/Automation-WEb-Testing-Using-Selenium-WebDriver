@Smoke
Feature: Logged User could switch between currencies US-Euro

  Scenario: Logged User could switch between currencies
    Given user had a valid registered account
    And user navigates to home page
    #Login again if not Logged yet
    And user click on log in
    And user fill his or her email
    And user fill his or her password
    And user click on log in button
    Then user should login successfully and see log out button
    #Start of steps
    Given user change current currency to EURO
    Then user should found all products prices in EURO
    Given user change current currency to Dollar
    Then user should found all products prices in Dollar