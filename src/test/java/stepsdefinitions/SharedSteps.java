package stepsdefinitions;

import io.cucumber.java.en.Given;

public class SharedSteps {
    @Given("I have used this shared step")
    public void i_have_used_this_shared_step() {
        System.out.println("Shared Given step");
    }
}
