Feature: Go to contact us

  Scenario: Go to website and Test Contact us Page
    Given navigate to website
    And click to Contact us
    And choose Subject Heading
    And enter Email address
    And enter Order reference
    And enter Message
    When click on send button
    Then verify success message



