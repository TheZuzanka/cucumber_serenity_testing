Feature: Search sasanka on Google

  Scenario: Searching for a term
    Given im on Google.com
    When he searches "sasanka"
    Then all result titles should contain the word "Sasanka"