package com.bigfuture.step_def;

import com.bigfuture.pages.Dashboard;
import com.bigfuture.pages.LoginPage;
import com.bigfuture.pages.UsersPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookRecordStepDef {
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    @Then("librarian verify to see {int} record as a default")
    public void librarian_verify_to_see_record_as_a_default(int expected) {
        UsersPage up = new UsersPage();
        Select records = new Select(up.dropDownRecords);
        String actual = records.getFirstSelectedOption().getText();
        String expected1 = String.valueOf(expected);
        Assert.assertEquals(actual, expected1);
    }

    @Then("User should have to fallowing list")
    public void user_should_have_to_fallowing_list(List<String> expectedList) {
        UsersPage up = new UsersPage();
        Select records = new Select(up.dropDownRecords);
        List<WebElement> options = records.getOptions();
        List<String> actualList = BrowserUtils.getElementsText(options);
        Assert.assertEquals(expectedList, actualList);
    }
}
