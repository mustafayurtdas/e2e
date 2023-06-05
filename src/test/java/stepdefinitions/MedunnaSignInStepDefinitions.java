package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;

public class MedunnaSignInStepDefinitions {

    @Given("go to {string}")
    public void go_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("click on user icon")
    public void click_on_user_icon() {

    }
    @When("click on sign in option")
    public void click_on_sign_in_option() {

    }
    @When("send username into username input")
    public void send_username_into_username_input() {

    }
    @When("send password into password input")
    public void send_password_into_password_input() {

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() {

    }
}
