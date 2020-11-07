package com.bigfuture.step_def;

import com.bigfuture.pages.LoginPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;

public class Login_stepDef {

    @Given("the student in login page")
    public void the_student_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new LoginPage().loginAsStudent();
        BrowserUtils.waitFor(3);

    }



}
