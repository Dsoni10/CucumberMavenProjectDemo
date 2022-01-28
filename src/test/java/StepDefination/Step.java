package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {


    @Given("User is on login page")
    public void user_is_on_login_page() {

        System.out.println("login page");

    }
    @When("The user enters valid credential")
    public void the_user_enters_valid_credential() {
        System.out.println("The user enters valid credential");
    }
    @When("Click on Submit")
    public void click_on_submit() {
        System.out.println("Click on Submit");
    }
    @Then("user should be logged in sucessfully")
    public void user_should_be_logged_in_sucessfully() {
        System.out.println("ser should be logged in sucessfully");
    }

}
