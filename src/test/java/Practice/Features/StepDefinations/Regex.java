package Practice.Features.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Regex {
    @Given("^User enters name(.*)$")
    public void user_enters_and_age_as(String name) {
        System.out.println("Entered name is " + name);
    }
    @Then("^user enters the age as (\\d+)$")
    public void user_enters_the_age_as(Integer int1) {
        System.out.println("Age is "+int1);
    }
    @Then("^To catch the fload vaue (-?\\d+.\\d+)$")
    public void to_catch_the_fload_vaue(Float float1) {
        System.out.println("Float value caught was "+float1);
    }

}
