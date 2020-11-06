package com.bigfuture.pages;

import com.bigfuture.utilities.BrowserUtils;
import com.bigfuture.utilities.ConfigurationReader;
import com.bigfuture.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
       public LoginPage(){ PageFactory.initElements(Driver.get(), this); }


    @FindBy (id = "inputEmail")
       public WebElement loginEmail;

    @FindBy (id = "inputPassword")
    public WebElement passWord;



    @FindBy (xpath = "//button")
    public WebElement signIn;

    public void loginAsStudent() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        loginEmail.sendKeys(username);
        passWord.sendKeys(password);
        signIn.click();



    }



}
