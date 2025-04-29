package StepDefinition;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	   System.out.println(">> User Navigated to Login page");
	}

	@When("User enters valid Email address {string}")
	public void user_enters_valid_email_address(String emailAddress) {
		System.out.println(">> User entered email address :"+emailAddress);
	}

	@And("User enters valid Password {string}")
	public void user_enters_valid_password(String pwd) {
		System.out.println(">> User entered password :"+pwd);
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
		System.out.println(">> User clicked on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	  System.out.println("user logged in successfully..");
	    	}

	@When("User enters invalid Email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
	    System.out.println(">> User enters invalid email " + invalidEmail);
	}

	@When("User enters invalid Password {string}")
	public void user_enters_invalid_password(String invalidPwd) {
		System.out.println(">> User enters invalid password " + invalidPwd);
	}

	@Then("User should get a warning message")
	public void user_should_get_a_warning_message() {
	    System.out.println(">> User got warning message");
	}

	@When("User does not enter any credentials")
	public void user_does_not_enter_any_credentials() {
	    System.out.println(">> User did not enter any credentials");
	}
}
