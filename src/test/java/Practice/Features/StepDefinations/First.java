package Practice.Features.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
    @Given("User is on the Application login page")
    public void user_is_on_the_application_login_page() {
        System.out.println("User is on the Application login page");
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("Username is : "+username);
        System.out.println("Password is :"+password);
    }
    @When("USer clicks on enter button")
    public void u_ser_clicks_on_enter_button() {
        System.out.println("USer clicks on enter button");
    }
    @Then("User lands to the homepage of the application")
    public void user_lands_to_the_homepage_of_the_application() {
        System.out.println("User lands to the homepage of the application");
    }
    @Then("User sees his cards added")
    public void user_sees_his_cards_added() {
        System.out.println("User sees his cards added");
    }
    @Given("User is passing {int}")
    public void user_is_passing(Integer value) {
        System.out.println("The passed value by the user is "+value);
    }
    @Given("User is passing value float {float}")
    public void user_is_passing_value_float(Float floa) {
        System.out.println("Float value is "+floa);
    }
    @Then("User passes the value double {double}")
    public void user_passes_the_value_double(Double double1) {
        System.out.println("Double value is "+double1);
    }

}
