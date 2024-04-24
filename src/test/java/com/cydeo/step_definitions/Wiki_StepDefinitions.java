package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wiki_StepDefinitions {
    WikiSearchPage wikisearch=new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }
//    @When("User types Steve Jobs in the wiki search box")
//    public void user_types_steve_jobs_in_the_wiki_search_box() {
//
//        wikisearch.searchBox_Wiki.sendKeys("Steve Jobs");
//        wikisearch.searchBtn_Wiki.click();
//    }
//    @Then("User sees Steve Jobs is in the wiki title")
//
//    public void user_sees_steve_jobs_is_in_the_wiki_title() {
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.titleContains("Steve"));
//        Assert.assertEquals("Steve Jobs - Wikipedia",Driver.getDriver().getTitle());
//     }

    @When("User types {string} in the wiki search box and click button")
    public void userTypesInTheWikiSearchBoxAndClickButton(String searchVal) {
//        wikisearch.searchBox_Wiki.sendKeys(searchVal);
//        wikisearch.searchBtn_Wiki.click();
        wikisearch.search(searchVal);
  }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expected_headerString) {
        String actual_header=wikisearch.headerSearch.getText();
        BrowserUtils.verify_ActualStr_ExpectedStr_Same(actual_header,expected_headerString);

    }

    @Then("User sees {string} image  is in the image header")
    public void userSeesImageIsInTheImageHeader(String expected_imageHeader) {
        String actual_imageHeader=wikisearch.imageHeader.getText();
        BrowserUtils.verify_ActualStr_ExpectedStr_Same(actual_imageHeader,expected_imageHeader);
    }
}
