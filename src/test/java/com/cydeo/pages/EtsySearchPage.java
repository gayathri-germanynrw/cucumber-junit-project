package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {
    public EtsySearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']")
    public WebElement searchBtn;

}
