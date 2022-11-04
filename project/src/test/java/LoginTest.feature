Feature:Login Test

  Scenario: Go to amazon website and test login page
    Given Go to amazon website
    And Click Login button
    And Enter Name
    And Enter password
    When Click on the submit button
    Then verify success message
