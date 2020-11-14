Feature: Atlas Feature

  Scenario: user add quote
    Given User open atlas web playgroud
    When User input quote "There is a will there is a way"
    And User select color "Magenta"
    And User click button add quote
    Then User see quote "There is a will there is a way" with backgorund color "magenta"

  Scenario: user add quote
    Given User open atlas web playgroud
    When User input quote "There is a will there is a way"
    And User select color "Yellow"
    And User click button add quote
    Then User see quote "There is a will there is a way" with backgorund color "yellow"

  Scenario: user add quote and check table appear by hovering button "hover to show table"
    Given User open atlas web playgroud
    When User input quote "There is a will there is a way"
    And User select color "Magenta"
    And User click button add quote
    And User click table view
    And User hover on button Hover to Show Table
    Then User see table quotes is appear

  Scenario: user add quote and check table appear by clicking button "Click to show table after 10 seconds"
    Given User open atlas web playgroud
    When User input quote "There is a will there is a way"
    And User select color "Magenta"
    And User click button add quote
    And User click table view
    And User click button click to show table
    Then User see table quotes is appear