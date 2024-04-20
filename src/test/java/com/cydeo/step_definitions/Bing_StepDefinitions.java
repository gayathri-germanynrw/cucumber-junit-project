package com.cydeo.step_definitions;


import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {
    BingSearchPage bingSearch=new BingSearchPage();
    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("user searches for Orange")
    public void user_searches_for_orange() {
        BrowserUtils.sleep(3);
        bingSearch.searchBox.sendKeys("Orange"+ Keys.ENTER);
        BrowserUtils.sleep(3);
    }
    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Flowers - Google Suche";
        Assert.assertEquals(actualTitle,expectedTitle);

    }


    @When("user searches for {string}")
    public void userSearchesFor(String searchKey) {
        bingSearch.searchBox.sendKeys(searchKey+Keys.ENTER);
    }

    @Then("user should see {string} in the titlee")
    public void userShouldSeeInTheTitlee(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}

/*
Task 2: Bing Search Title Verification
1. Go to https://www.google.com
2. Search for “orange”
3. Verify title is:
a. Expected = “orange – Search”

Note:
1. Follow POM Design Pattern
2. BDD implementation
 */
