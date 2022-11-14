@Smoke
Feature: Logged User could search for any product

  Scenario: Logged User could search for any product and find relative items
    Given user had a valid registered account
    And user navigates to home page
    #Login again
    And user click on log in
    And user fill his or her email
    And user fill his or her password
    And user click on log in button
    Then user should login successfully and see log out button
    #Start search steps
    Given user clicks on search field
    And user types what he or she want to search "laptop"
    And user clicks on search button
    Then user could find relative results