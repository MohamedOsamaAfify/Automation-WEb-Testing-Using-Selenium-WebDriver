@Smoke
Feature: User could log in with valid email and password

  Scenario: User could log in with registered credentials
    Given user had a valid registered account
    And user navigates to home page
    And user click on log in
    And user fill his or her email
    And user fill his or her password
    And user click on log in button
    Then user should login successfully and see log out button
    Then user click on log out button

  Scenario Outline: User could not log in with unregistered credentials
    Given user navigates to home page
    And user click on log in
    And user fills his invalid credentials"<Email>" "<Password>"
    And user click on log in button
    Then user should not login successfully

    Examples:
    |   Email          |   Password    |
    |   ayhaga@g.com   |   jkfhkjd     |
    |   fsgdgs@fd.com  |   iti_2022    |