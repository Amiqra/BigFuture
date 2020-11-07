package com.bigfuture.step_def;

import com.bigfuture.pages.DefaultDashboardPage;
import com.bigfuture.pages.LoginPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class defaultTablesStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {

        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

        String username = ConfigurationReader.get("st_username");
        String password = ConfigurationReader.get("st_password");

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStudent();
    }

    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> expectedMenu) {

        System.out.println("expectedMenu.size() = " + expectedMenu.size());
        System.out.println("expectedMenu = " + expectedMenu);

        List<String> actualMenu = BrowserUtils.getElementsText(new DefaultDashboardPage().Categories);

        Assert.assertEquals(expectedMenu,actualMenu);
        System.out.println("actualMenu = " + actualMenu);



    }
}
