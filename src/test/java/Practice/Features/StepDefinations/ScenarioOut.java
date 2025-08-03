package Practice.Features.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScenarioOut {
    @Given("User is in Intellije")
    public void user_is_in_intellije() {
        System.out.println("User is in intellije");
    }
    @Then("User enters here name details {string} and age {int}")
    public void user_enters_here_name_details_and_age(String string, Integer int1) {
        System.out.println("name entered is "+string);
        System.out.println("Age entered is "+int1);
    }
}
