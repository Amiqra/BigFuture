package com.bigfuture.step_def;

import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavigateStepDefs {

    @When("user login as a librarian")
    public void userLoginAsALibrarian() {

            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id="inputEmail")
        public WebElement userName;

        @FindBy(id="inputPassword")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit'] ")
        public WebElement submit;

        public void login(String userNameStr, String passwordStr) {
            userName.sendKeys(userNameStr);
            password.sendKeys(passwordStr);
            submit.click();
            // verification that we logged
    }
    @Then("The user should see following  options")
    public void theUserShouldSeeFollowingOptions(List<String>menuOptions) {
            BrowserUtils.waitFor(2);
            //get the list of webelement and convert them to list of string and assert
            //List<String> actualOptions = BrowserUtils.getElementsText(new DashBoardPage.DashboardPage().menuOptions);

           // Assert.assertEquals(menuOptions,actualOptions);
            System.out.println("menuOptions = " + menuOptions);
           // System.out.println("actualOptions = " + actualOptions);

        }

    @When("user login as a student")
    public void userLoginAsAStudent() {
    }
}