package stepsdefinitions;

import helpers.ConsoleTweaks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature1 {
    ConsoleTweaks consoleTwiks = new ConsoleTweaks();

    @When("When I have the first iteration")
    public void when_i_have_the_first_iteration() {
        consoleTwiks.printMessage("When step from Scenario one for Feature 1");
    }

    @Then("I could write the first automation test for it")
    public void i_could_write_the_first_automation_test_for_it() {
        consoleTwiks.printMessage("Then step from Scenario one for Feature 1");
        consoleTwiks.printDashSeparator();
        consoleTwiks.printEmptyLine();
    }
}
