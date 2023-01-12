
@wip
Feature: US1003 user searches for word entered as parameter
  Background: common step for all scenario
    Given  user get the amazon page

  Scenario: TC03 the user searhes Nutella with parameter method



    Then user write "Nutella" on the searchbox and searches it.
    And user tests it whether the result contain "Nutella" or not
    And close the page


  Scenario: TC04 the user searhes Java with parameter method



    Then user write "Java" on the searchbox and searches it.
    And user tests it whether the result contain "Java" or not
    And close the page

  Scenario: TC05 the user searhes Samsung with parameter method



    Then user write "Samsung" on the searchbox and searches it.
    And user tests it whether the result contain "Samsung" or not
    And close the page