package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureTwo {
    @When("When I have it's second iteration")
    public void when_i_have_it_s_second_iteration() {
        System.out.println("When from Scenario two");
    }

    @Then("I could write the second automation test for it")
    public void i_could_write_the_second_automation_test_for_it() {
        System.out.println("Then step from Scenario two");
    }
}
