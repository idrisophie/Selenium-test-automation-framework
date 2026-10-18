package org.idrisophie.swaglabs.utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Validations {
    private Validations(){

    }

    public static void validationTrue(boolean condition, String message){
        Assert.assertTrue(condition, message);
    }
    public static void validationFalse(boolean condition, String message){
        Assert.assertFalse(condition, message);
    }
    public static void validationEquals(String actual, String expected, String message){
        Assert.assertEquals(actual, expected, message);
    }
    public static void validationNotEquals(String actual, String expected, String message){
        Assert.assertNotEquals(actual, expected, message);
    }
    public static void validationPageUrl(WebDriver driver, String expected){
        Assert.assertEquals(BrowserActions.getCurrentURL(driver), expected);
    }
}
