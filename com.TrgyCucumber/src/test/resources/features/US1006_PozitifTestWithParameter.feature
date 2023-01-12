# @wip
Feature: US1006 take data from the configuration folder

  Scenario: TC09 enter valid username and password then test it

    Given user get "qdUrl" page
    Then click firstpage's login link
    And write "qdValidUsername" in the userbox
    And write "qdValidPassword" in the passwordbox
    And accept cookies
    And 5 second wait
    Then click the login button
    And  test success login
    Then close the page