package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateToGoogle;
import starter.search.SearchFor;

public class SearchOnGoogleStepDefinitions {
    @Steps
    NavigateToGoogle navigateToGoogle;

    @Steps
    SearchFor searchFor;

    @Given("im on Google.com")
    public void i_am_on_the_google() {
        navigateToGoogle.googleHomePage();
    }

    @When("he searches {string}")
    public void heSearches(String term) {
        searchFor.term(term);
    }
}
