Feature: US1002 User search many product on the amazon page
  @wip
  Scenario: TC02 user should be able to  search product and test them

    Given  user get the amazon page
    Then user write on the searchbox and searches it.
    And user tests it whether the result contain Nutella or not
    And close the page

    Given  user get the amazon page
    Then user write on the Java and searches it.
    And user tests it whether the result contain Java or not
    Then close the page

    Given  user get the amazon page
    Then user write on the Samsung and searches it.
    And user tests it whether the result contain Samsung or not
    Then close the page