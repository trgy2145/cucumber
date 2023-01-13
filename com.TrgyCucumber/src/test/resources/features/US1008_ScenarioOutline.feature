Feature: US1008 Test run for multiple data with scenario outline
  @wip
  Scenario Outline:

    # firstly we are gonna go amazon page and search Nutella, Java ,Samsung and Apple
    # then we will test if the result contains the search word

    Given  user get "amazonUrl" page
    Then user write "<searchProduct>" on the searchbox and searches it.
    Then user tests it whether the result contain "<searchProduct>" or not
    And close the page


    Examples:

      | searchProduct |
      |Nutella        |
      |Java           |
      |Samsung        |
      |Apple          |