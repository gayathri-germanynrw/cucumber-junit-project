package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class R_VytrachLogin_StepDef {
    R_VytrackLoginPage obj_loginPage=new R_VytrackLoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        obj_loginPage.login("driver_username","driver_password");
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals("Title Verification failed","Dashboard",Driver.getDriver().getTitle());
    }


    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        obj_loginPage.login("sales_manager_username","sales_manager_password");
    }


    @When("user enters the store manager information")
    public void userEntersTheStoreManagerInformation() {

        obj_loginPage.login("store_manager_username","store_manager_password");
    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {
        obj_loginPage.login(userType);
    }

    @When("the user login with {string},{string}")
    public void theUserLoginWith(String username, String password) {
        obj_loginPage.loginNoProperties(username,password);
    }

    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
        Assert.assertEquals("Login",Driver.getDriver().getTitle());
    }
}
