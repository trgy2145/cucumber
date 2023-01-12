
# @wip
Feature: US1005 take the parameters from configuration.properties
  # uc farkli test olustur amazon wisequarter ve walmart a git
  #oraya gittiğini test et

  Scenario: TC06 user get the amazon page and test it


    Given  user get "amazonUrl" page
    Then test it that there is "amazon" in the url
    And close the page


  Scenario: TC07 user get the wisequarter page and test it


    Given  user get "wqUrl" page
    Then test it that there is "wisequarter" in the url
    And close the page

  Scenario: TC08 user get the walmart page and test it


    Given  user get "walmartUrl" page
    Then test it that there is "walmart" in the url
    And close the page