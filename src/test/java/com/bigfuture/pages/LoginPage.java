package com.bigfuture.pages;

import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       public LoginPage(){ PageFactory.initElements(Driver.get(), this); }


    @FindBy (xpath = "(//label)[1]")
       public WebElement loginEmail;

    @FindBy (xpath = "(//label)[2]")
    public WebElement passWord;



    @FindBy (xpath = "//button")
    public WebElement signIn;

    public void login() {


        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        loginEmail.sendKeys(username);
        passWord.sendKeys(password);
        signIn.click();

    }

}
