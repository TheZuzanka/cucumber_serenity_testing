package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateToGoogle;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SearchOnGoogleStepDefinitions {
    @Steps
    NavigateToGoogle navigateToGoogle;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("im on Google.com")
    public void i_am_on_the_google() {
        navigateToGoogle.googleHomePage();
    }

    @When("he searches {string}")
    public void searches_for_sasanka(String term) {
        searchFor.term(term);
    }

    @Then("all result titles should contain the word {string}")
    public void all_result_titles_should_contain_the_word_sasanka(String expectedTerm) {
        assertThat(searchResult.titles())
                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
    }
}
