package com.bigfuture.pages;

import com.bigfuture.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BorrowingBooks extends BasePage{



@FindBy (xpath = "//a[@href='javascript:void(0)']")

public List<WebElement> rtrnBrrw;



public WebElement retrnBrrw(int i){

    return Driver.get().findElement(By.xpath("(//a[@href='javascript:void(0)'])["+i+"]" ));


}



public WebElement getReturned(int i) {

    return Driver.get().findElement(By.xpath("//tr[" + i+ "]//td[6]" ));

}

    public WebElement getBorrowedBy(int i) {

        return Driver.get().findElement(By.xpath("//tr[" + i+ "]//td[7]" ));

    }


}
