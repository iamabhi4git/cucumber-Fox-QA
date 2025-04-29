package co.cucumber.in;

import io.cucumber.java.en.*;

public class Search {

    @Given("the user launches the application")
    public void user_launches_application() {
        System.out.println(">> Application launched");
    }

    @When("the user enters a valid product into the search field")
    public void user_enters_valid_product() {
        System.out.println(">> User entered a valid product into the search field");
    }

    @When("the user enters a non-existing product into the search field")
    public void user_enters_non_existing_product() {
        System.out.println(">> User entered a non-existing product into the search field");
    }

    @When("the user does not enter any product into the search field")
    public void user_enters_nothing() {
        System.out.println(">> User did not enter any product into the search field");
    }

    @And("the user clicks on the Search button")
    public void user_clicks_search_button() {
        System.out.println(">> User clicked the Search button");
    }

    @Then("the valid product should be displayed in the search results")
    public void valid_product_displayed() {
        System.out.println(">> Valid product is displayed in the search results");
    }

    @Then("a message should be displayed indicating no matching products were found")
    public void no_matching_product_message() {
        System.out.println(">> Message displayed: No matching products found");
    }
}
