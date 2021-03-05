package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature4 {
    @When("When I have it's fourth iteration")
    public void when_i_have_it_s_fourth_iteration() {
        System.out.println("When step from Scenario one for Feature 4");
    }

    @Then("I could use this firstname {string} and lastname {string} coming from table")
    public void i_could_use_this_firstname_and_lastname_coming_from_table(String string, String string2,
            io.cucumber.datatable.DataTable dataTable) {

        System.out.println("Name from a table in the Then step from Scenario one for Feature 4: " + dataTable.cell(1, 0)
                + " " + dataTable.cell(1, 1));
    }
}
