package com.bigfuture.pages;

import com.bigfuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookPage extends BasePage {

        public BookPage() {
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(css = "[title='Books']")
        public WebElement BookPage;

    }

