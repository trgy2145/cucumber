

Feature: US1009 Negatif test with wrong username and password
  # @wip
  Scenario Outline: TC14 you can not enter with wrong username and password

    Given user get "qdUrl" page
    Then click firstpage's login link
    And write manuel "<wrongUsername>" in the userbox
    And write manuel "<wrongPassword>" in the passwordbox
    Then accept cookies
    And 5 second wait
    Then click the login button
    And test unsuccess login
    Then close the page


    Examples:
      |wrongUsername|wrongPassword|
      |ali          |ali@a.com    |
      |veli         |veli@v.com   |
      |can          |can@c.com    |