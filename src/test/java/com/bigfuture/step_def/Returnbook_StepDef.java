package com.bigfuture.step_def;

import com.bigfuture.pages.Dashboard;
import com.bigfuture.pages.LoginPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Returnbook_StepDef {

    @Given("the student in login page")
    public void the_student_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new LoginPage().loginAsStudent();
        BrowserUtils.waitFor(3);

    }

    @When("the student should navigate to {string} module")
    public void the_student_should_navigate_to_module(String string) {

 new Dashboard().navigateToModule("Borrowing Books");

    }

    @Then("the student should be able to click {string} button")
    public void the_student_should_be_able_to_click_button(String string) {



    }

    @Then("{string} should turn to {string} message.")
    public void should_turn_to_message(String string, String string2) {



    }


}
