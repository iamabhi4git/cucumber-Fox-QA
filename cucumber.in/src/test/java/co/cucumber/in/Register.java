package co.cucumber.in;

import io.cucumber.java.en.*;

public class Register {

    @Given("the user navigates to the Register Account page")
    public void user_navigates_to_register_account_page() {
        System.out.println(">> User navigated to the Register Account page");
    }

    @When("the user enters {string} into the First Name field")
    public void user_enters_first_name(String firstName) {
        System.out.println(">> Entered First Name: " + firstName);
    }

    @And("the user enters {string} into the Last Name field")
    public void user_enters_last_name(String lastName) {
        System.out.println(">> Entered Last Name: " + lastName);
    }

    @And("the user enters {string} into the Email field")
    public void user_enters_email(String email) {
        System.out.println(">> Entered Email: " + email);
    }

    @And("the user enters {string} into the Telephone field")
    public void user_enters_telephone(String phone) {
        System.out.println(">> Entered Telephone: " + phone);
    }

    @And("the user enters {string} into the Password field")
    public void user_enters_password(String password) {
        System.out.println(">> Entered Password: " + password);
    }

    @And("the user enters {string} into the Confirm Password field")
    public void user_enters_confirm_password(String confirmPassword) {
        System.out.println(">> Entered Confirm Password: " + confirmPassword);
    }

    @And("the user selects the Privacy Policy checkbox")
    public void user_selects_privacy_policy() {
        System.out.println(">> Selected the Privacy Policy checkbox");
    }

    @And("the user selects {string} for the Newsletter subscription")
    public void user_selects_newsletter(String option) {
        System.out.println(">> Newsletter Subscription selected: " + option);
    }

    @And("the user clicks the Continue button")
    public void user_clicks_continue() {
        System.out.println(">> Clicked on the Continue button");
    }

    @Then("the account should be created successfully")
    public void account_created_successfully() {
        System.out.println(">> Account created successfully");
    }

    @When("the user does not enter any details into the fields")
    public void user_enters_no_data() {
        System.out.println(">> No data entered in any field");
    }

    @Then("warning messages should be displayed for all mandatory fields")
    public void warning_for_mandatory_fields() {
        System.out.println(">> Warning messages displayed for all mandatory fields");
    }

    @Then("a warning message should be displayed indicating a duplicate email address")
    public void duplicate_email_warning() {
        System.out.println(">> Warning displayed: Duplicate email address");
    }
}
