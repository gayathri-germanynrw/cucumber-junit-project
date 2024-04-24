package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features="src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,
       // tags="@smoke and @librarian"
       // tags="@smoke and not @librarian"
       // tags="@regression and not @librarian",
       // tags="@regression",
       //tags="@driver",
        //tags="@driver and @salesmanager",
       // tags="", //run all features
        // tags="@param",
        //tags="@invalidLoginWithParamsSceOutLine",
        tags="@EtsySearchVerification",
        publish=true // Generating a report with public link



)
public class CukesRunner {
}

