package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureThree {

    @When("When I have it's third iteration")
    public void when_i_have_it_s_third_iteration() {
        System.out.println(getClass().getSimpleName());
        System.out.println("When step from Scenario three");
    }

    @Then("I could write dynamic string like {string}")
    public void i_could_write_dynamic_string_like(String string) {
        System.out.println("My dynamic string from Feature Three: " + string);
    }
}
