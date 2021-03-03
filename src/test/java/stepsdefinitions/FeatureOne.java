package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureOne {

    @When("When I have it's first iteration")
    public void when_i_have_it_s_first_iteration() {
        System.out.println("When step from Scenario one");
    }

    @Then("I could write the first automation test for it")
    public void i_could_write_the_first_automation_test_for_it() {
        System.out.println("Then step from Scenario one");
    }
}
