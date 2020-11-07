package com.bigfuture.step_def;

import com.bigfuture.pages.BorrowingBooks;
import com.bigfuture.pages.Dashboard;
import com.bigfuture.pages.LoginPage;
import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Borrow_Returnbook_StepDef {

    int row;

    List<WebElement> actionBtn;


    @Given("the student in login page")
    public void the_student_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new LoginPage().loginAsStudent();
        BrowserUtils.waitFor(3);

    }

    @When("the student should navigate to {string} module")
    public void the_student_should_navigate_to_module(String string) {

      new Dashboard().navigateToModule(string);
        BrowserUtils.waitFor(5);
    }


    @Then("the student should be able to click {string} button and should display {string} message.")
    public void the_student_should_be_able_to_click_button_and_should_display_message(String string, String string2) {

        actionBtn = new BorrowingBooks().rtrnBrrw;

        System.out.println("str2.get(0).isEnabled() = " + actionBtn.get(0).getText());


        for (int i = 0; i < actionBtn.size(); i++) {

            BrowserUtils.waitFor(1);

            String disabled= actionBtn.get(i).getAttribute("class");

            boolean isdisabled= disabled.contains("disabled");


             if(!isdisabled){

                 System.out.println(new BorrowingBooks().getReturned(i).getText() + " tiklamadan once");

                 actionBtn.get(i).click();

                System.out.println(i);

              String actual= new BorrowingBooks().getReturned(i).getText();

               Assert.assertEquals(string2, actual);

                 System.out.println(string2);
                 System.out.println(actual);

            }

        }

        }



//    When the student is on the "Books" module
//    When The borrowed by cell, which corresponds to book wanted to be borrowed should be empty
//    Then the student should be able to click "Borrow book" button
//    Then "Borrow book" button should be disabled.



    @When("the student is on the {string} module")
    public void the_student_is_on_the_module(String string) {

        new Dashboard().navigateToModule(string);

    }


//    @When("The borrowed by cell, which corresponds to book wanted to be borrowed should be empty")
//    public void the_borrowed_by_cell_which_corresponds_to_book_wanted_to_be_borrowed_should_be_empty() {
//  }


    @When("The borrowed by cell of any book should be empty")
    public void the_borrowed_by_cell_of_any_book_should_be_empty() {

        actionBtn = new BorrowingBooks().rtrnBrrw;

        for (row = 1; row <= actionBtn.size(); row++) {


            System.out.println(new BorrowingBooks().getBorowedBy(row).getText());

            if ( new BorrowingBooks().getBorowedBy(row).getText().isEmpty() ) {

                System.out.println(row + " "+ new BorrowingBooks().getBorowedBy(row).getText().isEmpty());
                System.out.println("asli");
                String disabled= new BorrowingBooks().retrnBrrw(row).getAttribute("class");

                System.out.println(disabled + "asli");

                boolean isdisabled= disabled.equals("btn btn-primary btn-sm  disabled");

                System.out.println(isdisabled);

                Assert.assertTrue(!isdisabled);

              //  BrowserUtils.waitFor(3);
               // the_student_should_be_able_to_click_button("Borrow book");

              //  button_should_be_disabled("Borrow book");
       }

        }

    }

    @Then("the student should be able to click {string} button")
    public void the_student_should_be_able_to_click_button(String string) {


        System.out.println(row);
        System.out.println(actionBtn.get(row).getText() + " asli");
//        WebDriverWait wait2 = new WebDriverWait(Driver.get(), 10);
//        wait2.until(ExpectedConditions.elementToBeClickable(actionBtn.get(row)));

        actionBtn.get(row).click();

        BrowserUtils.waitFor(5);
    }


    @Then("{string} button should be disabled.")
    public void button_should_be_disabled(String string) {


       Assert.assertTrue(actionBtn.get(row).getAttribute("class").contains("disabled"));


    }

}
