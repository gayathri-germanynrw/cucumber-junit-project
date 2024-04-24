package com.cydeo.step_definitions;




import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "Pre" and "post"
condition for All the scenariod and Steps
 */
public class Hooks {
    // import the @Before coming from io.cucumber.java
     // Hooks will allow us to create PRE and POST conditions for ALL of scenarios in our project.
    //Hooks class is separated from the feature file.

    @Before(value="@db" , order=1)
    public void setupMethod(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

   // @Before(value="@login",order=2)
    public void login_scenarion_before(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void tearDownMethod(Scenario scenario) {

        // if(scenario.isFailed()){ }      /*returns true if its fails*/
        byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());
        System.out.println("----> @After: RUNNING AFTER SCENARIO");
       // Driver.closeDriver(); // Instead of using only message and extra functionality
    }

    @BeforeStep
    public void setupStep()
    {
        System.out.println("---> @BeforeStep: Running before Each Step");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("---> @AfterStep: Running after Each Step\"");
    }


}
