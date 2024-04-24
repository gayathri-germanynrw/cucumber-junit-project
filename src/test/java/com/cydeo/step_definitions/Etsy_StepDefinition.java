package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Etsy_StepDefinition {
    EtsySearchPage etsysearch=new EtsySearchPage();
    @Given("User is on search page")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("User sees title Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone from Etsy")
    public void user_sees_title_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone_from_etsy() {
        etsysearch.searchBtn.click();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitleContains(expectedTitle);
       // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.titleContains(expectedTitle));
        //Assert.assertEquals("Title Verification failed",expectedTitle,Driver.getDriver().getTitle());
    }



}
