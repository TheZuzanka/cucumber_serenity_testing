Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is on the DuckDuckGo home page
    When he searches for "Cucumber"
    Then all the result titles should contain the word "Cucumber"

  Scenario: Refining a search using two terms
    Given Sergey is on the DuckDuckGo home page
    And he has searched for "Cucumber"
    When he searches again for "zucchini"
    Then all the result titles should contain the word "zucchini"

    Scenario: Serching for three terms
      Given Sergey is on the DuckDuckGo home page
      And he has searched for "zucchini"
      When he searches again for "Sasanka"
      Then all the result titles should contain the word "Sasanka"