@wip
Feature: US1006 take wrong data from the configuration folder

  Scenario: TC10 enter valid username and unvalid password then test it

    Given user get "qdUrl" page
    Then click firstpage's login link
    And write "qdValidUsername" in the userbox
    And write "qdUnvalidPassword" in the passwordbox
    And accept cookies
    And 3 second wait
    Then click the login button
    And  test unsuccess login
    Then close the page


  Scenario: TC11 enter unvalid username and valid password then test it

    Given user get "qdUrl" page
    Then click firstpage's login link
    And write "qdUnvalidUsername" in the userbox
    And write "qdValidPassword" in the passwordbox
    And accept cookies
    And 3 second wait
    Then click the login button
    And  test unsuccess login
    Then close the page

  Scenario: TC11 enter unvalid username and unvalid password then test it

    Given user get "qdUrl" page
    Then click firstpage's login link
    And write "qdUnvalidUsername" in the userbox
    And write "qdUnvalidPassword" in the passwordbox
    And accept cookies
    And 3 second wait
    Then click the login button
    And  test unsuccess login
    Then close the page