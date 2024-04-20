package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 public class Googlesearchpage {
    public Googlesearchpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // #2 : Instead of using .FindElement() , we will use @FindBy annotation

    @FindBy(name="q")
    public WebElement searchBox;
}
