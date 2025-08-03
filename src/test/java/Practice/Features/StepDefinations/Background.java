package Practice.Features.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Background {
    @Given("In Test page")
    public void in_test_page() {
        System.out.println("In Test page");
    }
    @Then("Database connection")
    public void database_connection() {
        System.out.println("Database connection");
    }
    @Then("Conencted database")
    public void conencted_database() {
        System.out.println("Conencted database");
    }
    @Given("On Background page")
    public void on_background_page() {
        System.out.println("On Background page");
    }
    @Then("test on home page")
    public void test_on_home_page() {
        System.out.println("test on home page");
    }
    @Then("Click on home page")
    public void click_on_home_page() {
        System.out.println("Click on home page");
    }
    @Then("To test carts")
    public void to_test_carts() {
        System.out.println("To test carts");
    }


}
