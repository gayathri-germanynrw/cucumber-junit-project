package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {
    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        //Todo: Write the code here
        System.out.println("User is on the login page of the library application");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User entered librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User entered librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }


    @When("user enters Student username")
    public void userEntersStudentUsername() {
        System.out.println("user entered Student username");
    }

    @And("user enters Student password")
    public void userEntersStudentPassword() {
        System.out.println("user entered Student password");
    }
}

/*
UNDERSTANDING HOW FEATURE FILES AND STEP DEFINITIONS WORK TOGETHER

Task: Create a new feature file and new scenarios
1. Create a new feature file named Login.feature
2. Create 3 new scenarios from the below provided user story.
3. User Story:
As a user, I should be able to login with correct credentials to different accounts.
And dashboard should be displayed.
Accounts are: librarian, student, admin
4. Create a new step definition class under step_definitions package

named: LoginStepDefs

5. Run the code. Get the step definitions from the console
6. No Java-selenium code implementation needed. Just add printing line in the
implementation regarding what should be happening when the code is ran.
Ex: “User is on the login page”

 */

