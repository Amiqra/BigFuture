package com.bigfuture.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DefaultDashboardPage {

    @FindBy(tagName = "th")
    public List<WebElement> Categories;



}
