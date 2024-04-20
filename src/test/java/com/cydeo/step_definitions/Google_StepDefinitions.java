package com.cydeo.step_definitions;




import com.cydeo.pages.Googlesearchpage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Google_StepDefinitions {
    Googlesearchpage googlesearchpage=new Googlesearchpage();
    @When("user on the Google search page")
    public void user_on_the_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
        BrowserUtils.verify_ActualStr_ExpectedStr_Same(actualTitle,expectedTitle);
    }

    @Given("user is on the Google search page")
    public void userIsOnTheGoogleSearchPage() {
        Driver.getDriver().get("https://www.google.com");
        
    }

    @When("user searches for {word}")
    public void userSearchesForApple(String word) {// WebElement
        BrowserUtils.sleep(3);
        googlesearchpage.searchBox.sendKeys(word+ Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="apple - Google Suche";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}

/*
Task 1: Google Search Title Verification
1. Go to https://www.google.com
2. Search for “apple”
3. Verify title is:
a. Expected = “apple – Google Search”
Note:
1. Follow POM Design Pattern
2. BDD implementation
 */


