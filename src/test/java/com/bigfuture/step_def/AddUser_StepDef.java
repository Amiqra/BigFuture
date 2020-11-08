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
import org.openqa.selenium.support.ui.Select;

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


    @Then("click the {string} button")
    public void clickTheButton(String addUser) {

        usersPage.addUser.click();
        BrowserUtils.waitFor(2);

        usersPage.close.click();

    }

    @And("create new user using following information")
    public void createNewUserUsingFollowingInformation() {

        BrowserUtils.waitFor(3);
        usersPage.fullName.sendKeys("Sarah White");
        usersPage.password1.sendKeys("1234");
        usersPage.email.sendKeys("shwhiter@gmail.com");

        BrowserUtils.waitFor(2);
        Select userGroup = new Select(usersPage.dropdown1);
        userGroup.selectByValue("3");

        BrowserUtils.waitFor(2);
        Select status = new Select(usersPage.dropdown2);
        status.selectByValue("ACTIVE");


        BrowserUtils.waitFor(1);
        usersPage.startDate.clear();
        BrowserUtils.waitFor(1);
        usersPage.endDate.clear();
        BrowserUtils.waitFor(1);
        usersPage.startDate.sendKeys("2020-11-11");
        BrowserUtils.waitFor(1);
        usersPage.endDate.sendKeys("2025-10-10");

        usersPage.address.sendKeys("Spring st, New York, USA, 20002");
        usersPage.save.click();

    }

    @And("edit user info using following information")
    public void editUserInfoUsingFollowingInformation() {



    }


}
