package com.bigfuture.step_def;

import com.bigfuture.pages.BasePage;
import com.bigfuture.pages.Dashboard;
import com.bigfuture.pages.LoginPage;
import com.bigfuture.pages.UsersPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class AddUser_StepDef {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();


    @Given("the user logged in as a {string}")
    public void theUserLoggedInAsA(String librarian) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        loginPage.loginAsLibrarian();
        BrowserUtils.waitFor(2);
    }


    @When("navigate the page to {string} module")
    public void navigateThePageToModule(String Users) {

        new Dashboard().navigateToModule(Users);
        BrowserUtils.waitFor(2);
    }


    @Given("user clicks the {string} button")
    public void userClicksTheButton(String addUser) {

        usersPage.addUser.click();
    }

    @When("create new user using following information")
    public void createNewUserUsingFollowingInformation(Map<String,String> form) {

        Select dropdown1 = new Select(usersPage.dropdown1);
        Select dropdown2 = new Select(usersPage.dropdown2);

        usersPage.fullName.sendKeys(form.get(("Full Name")));
        usersPage.password1.sendKeys(form.get("Password"));
        usersPage.email.sendKeys(form.get("Email"));

        dropdown1.selectByValue(form.get("User Group"));
        dropdown2.selectByValue(form.get("Status"));

        usersPage.startDate.clear();
        usersPage.startDate.sendKeys(form.get("Start Date"));

        usersPage.endDate.clear();
        usersPage.endDate.sendKeys(form.get("End Date"));

        usersPage.address.sendKeys(form.get("Address"));

    }
    @Then("user able to click the {string} button")
    public void userAbleToClickTheButton(String save) {
        usersPage.save.click();
        BrowserUtils.waitFor(2);
    }

    @When("librarian clicks the {string} button")
    public void librarianClicksTheButton(String addUser) {

        usersPage.addUser.click();
    }

    @Then("librarian click the {string} button")
    public void librarianClickTheButton(String close) {
        BrowserUtils.waitFor(2);
        usersPage.close.click();
    }

    @And("librarian able to click the {string} button")
    public void librarianAbleToClickTheButton(String editUser) {
        usersPage.edit.click();
        BrowserUtils.waitFor(2);

    }

    @And("edit user info using following information")
    public void editUserInfoUsingFollowingInformation(Map<String,String> edit) {

        usersPage.fullName.clear();
        usersPage.fullName.sendKeys(edit.get(("Full Name")));
        BrowserUtils.waitFor(2);

        usersPage.password1.clear();
        usersPage.password1.sendKeys(edit.get("Password"));
        BrowserUtils.waitFor(2);

        usersPage.email.clear();
        usersPage.email.sendKeys(edit.get("Email"));
    }

    @Then("librarian click {string} button")
    public void librarianClickButton(String save) {
        usersPage.save.click();
        BrowserUtils.waitFor(2);
    }
}