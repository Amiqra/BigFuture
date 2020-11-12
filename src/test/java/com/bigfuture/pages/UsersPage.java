package com.bigfuture.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password1;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "(//label[@class='control-label'])[6]")
    public WebElement userGroup;

    @FindBy(xpath = "(//label[@class='control-label'])[7]")
    public WebElement status;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement dropdown1;

    @FindBy(xpath = "(//select[@name='status'])[1]")
    public WebElement dropdown2;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement startDate;

    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement endDate;

    @FindBy(xpath = "//textarea[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement close;

    @FindBy(xpath = "//select [@name='tbl_users_length']")
    public WebElement dropDownRecords;

    @FindBy(xpath = "//div[@id='tbl_users_length']")
    public WebElement getDropdownTable;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[1]")
    public WebElement edit;


}
