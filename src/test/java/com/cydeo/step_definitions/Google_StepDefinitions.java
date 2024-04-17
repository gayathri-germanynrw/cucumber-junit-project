package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_StepDefinitions {
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

}
