package com.bigfuture.step_def;

import com.bigfuture.pages.LoginPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookRecordStepDef {

    @Given("the student in login page")
    public void the_student_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new LoginPage().loginAsStudent();
        BrowserUtils.waitFor(3);
    }

    @When("librarian on the Dashboard page")
    public void librarian_on_the_Dashboard_page() {
    }

    @When("librarian clicks the {string} button")
    public void librarian_clicks_the_button(String string) {
    }

    @Then("librarian verify to see {int} record as a default")
    public void librarian_verify_to_see_record_as_a_default(Integer int1) {
    }




}
