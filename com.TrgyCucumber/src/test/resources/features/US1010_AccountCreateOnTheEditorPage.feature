Feature: US1010 create a account on the editor page with scenario outline
  // @wip
  Scenario Outline: TC15 you can create multiple account on the editor page

    When user get "editorUrl" page
    Then click the new button
    And write the "<firstName>" in the firstnamebox
    And 3 second wait
    And write the "<lastName>" in the Lastnamebox
    And 3 second wait
    And write the "<position>" in the positionbox
    And 3 second wait
    And write the "<office>" in the officebox
    And 3 second wait
    And write the "<extension>" in the extensionbox
    And 3 second wait
    And write the "<startDate>" in the startDatebox
    And 3 second wait
    And write the "<salary>" in the salarybox

    And click the Create button
    When user search "<firstName>"
    And 3 second wait
    Then valid your "<firstName>" on the name section
    And 30 second wait
    Then close the page


    Examples:
      |firstName  |lastName|position|office      |extension|startDate |salary|
      |trgy       |can     |Qa      |mannheim    |kircheim |2021-01-01|20000|
      |hasan      |akar    |serbest |sivas       |dibi     |2021-01-02|25000|