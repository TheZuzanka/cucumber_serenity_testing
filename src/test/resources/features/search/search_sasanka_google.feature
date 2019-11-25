Feature: Search sasanka on Google

  Scenario: Searching for a term
    Given im on Google.com
    And he searches "sasanka"
    When he searches for pictures
    Then all result titles should contain the word "Sasanka"