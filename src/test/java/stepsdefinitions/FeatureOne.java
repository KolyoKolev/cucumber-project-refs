package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureOne {
    @Given("I have a feature one")
    public void i_have_a_feature_one() {
        System.out.println("Given step");
    }

    @When("When I have it's first iteration")
    public void when_i_have_it_s_first_iteration() {
        System.out.println("When step");
    }

    @Then("I could write the first automation test for it")
    public void i_could_write_the_first_automation_test_for_it() {
        System.out.println("Then step");
    }
}
