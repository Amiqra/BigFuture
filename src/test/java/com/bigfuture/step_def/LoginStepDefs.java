package com.bigfuture.step_def;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;


public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

    }

    @When("the user enters the student information")
    public void the_user_enters_the_driver_information() throws InterruptedException {
        String username = ConfigurationReader.get("student_username");
        String password = ConfigurationReader.get("student_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Library",actualTitle);

        }

    @When("the user enters the librarian information")
    public void theUserEntersTheLibrarianInformation() throws InterruptedException {
        String username = ConfigurationReader.get("librarian_username");
        String password = ConfigurationReader.get("librarian_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the librarian should be able to login")
    public void theLibrarianShouldBeAbleToLogin() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Library", actualTitle);


    }
}
