package org.idrisophie.swaglabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private void waits(){

    }

    // present - visible - clickable
    public static WebElement waitForElementPresent(WebDriver driver, By locator){
        // code
       return new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(driver1 -> driver1.findElement(locator));
    }

    public static WebElement waitForElementVisible(WebDriver driver, By localor){
        //code
        return new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(driver1 ->
                        {
                            WebElement element = waitForElementPresent(driver, localor);
                            return element.isDisplayed() ? element : null;
                        }
                );
    }
    public static WebElement waitForElementClickable(WebDriver driver, By localor){
        //code
        return new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(driver1 ->
                        {
                            WebElement element = waitForElementVisible(driver, localor);
                            return element.isEnabled() ? element : null;
                        }
                );
    }



}
