package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute
    Thread.sleep method for given duration.
     */


    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    public static void switchWindowAndVerify(
            String expectedInUrl,
            String expectedTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println("Current URL :" + Driver.getDriver().getCurrentUrl());
            //4. Create a logic to switch to the tab where Etsy.com is open
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyTitleContains(String expectedInTitle){
        System.out.println("expectedInTitle--->"+expectedInTitle);
        System.out.println("Driver.getDriver().getTitle() --->"+Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void verify_ActualStr_ExpectedStr_Same(String actualString,String expectedStr){
        Assert.assertEquals(actualString,expectedStr);
    }

    public static void waitForInvisibilityOf(WebElement target){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        // Use the above 'wait' object with wait.until(ExpectedConditions.invisibilityOf(WebElement))
        wait.until(ExpectedConditions.invisibilityOf(target));

    }




}


/*
TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
 */

/*
TC #3: Create utility method
1. Create a new method for title verification
2. Create a method to make title verification logic re-usable
3. When method is called, it should simply verify expected title with actual
title
Method info:
• Name: verifyTitle()
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedTitle
 */

/*
TC #5: Create utility method
1. Create a new method for login
2. Create a method to make Task3 logic re-usable
3. When method is called, it should simply login
This method should have at least 2 overloaded versions.

Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver

Method #n2 ifo:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password

 */
