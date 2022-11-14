@Smoke
Feature: User could register for new account

  Scenario: User could register for new account with valid data
    Given user navigates to home page
    And user clicks on Register link in upper right
    And user select gender "Male"
    And user enter first name "Omar"
    #| Omar | then use DataTable in function related
    And user enter last name "Tarek"
    And user enter his or her date of birth "28/9/2009"
    And user enter his or her email
    And user enter his or her company "ITI"
    And user select Newsletter option "True"
    And user fill password and confirm password fields with (Hook.validPassword) value
    And user click on register button
    Then user should see "Your registration completed" message
    And user should login successfully and see log out button
    Then user click on log out button
