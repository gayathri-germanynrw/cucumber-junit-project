package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {
    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchInput")
    public WebElement searchBox_Wiki;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement searchBtn_Wiki;

    @FindBy(xpath="//h1[@id='firstHeading']")
    public WebElement headerSearch;

    @FindBy(xpath="//div[@class='fn']")
    public WebElement imageHeader;


    public void search(String searchVal){
        searchBox_Wiki.sendKeys(searchVal);
        searchBtn_Wiki.click();
    }
}
