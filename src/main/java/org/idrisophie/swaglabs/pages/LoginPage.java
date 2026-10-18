package org.idrisophie.swaglabs.pages;

import org.idrisophie.swaglabs.utils.BrowserActions;
import org.idrisophie.swaglabs.utils.CustomSoftAssertion;
import org.idrisophie.swaglabs.utils.ElementActions;
import org.idrisophie.swaglabs.utils.Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class LoginPage {
    // Locators
    private final WebDriver driver;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");
    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Navigate to the login page
    public void navigateToLoginPage(){
        BrowserActions.navigateToURL(driver,"https://www.saucedemo.com/");
    }

    // Actions
    public LoginPage enterUsername(String username){
        ElementActions.sendData(driver, this.username, username);
        return this;
    }
    public LoginPage enterPassword(String password){
        ElementActions.sendData(driver, this.password, password);
        return this;
    }
    public LoginPage clickLoginButton(){
        ElementActions.clickElement(driver, loginButton);
        return this;
    }
    public String getErrorMessage(){
        return ElementActions.getText(driver, errorMessage);
    }

    // Validations
    public LoginPage assertionLoginPageURL() {
        CustomSoftAssertion.softAssertion.assertEquals(BrowserActions.getCurrentURL(driver), "https://www.saucedemo.com/");
        return this;
    }
    public LoginPage assertionLoginPageTitle() {
        CustomSoftAssertion.softAssertion.assertEquals(BrowserActions.getPageTitle(driver), "Swag Labs","Title is not as expected");
        return this;
    }
    public LoginPage assertSuccessfullLoginSoft() {
        CustomSoftAssertion.softAssertion.assertEquals(BrowserActions.getCurrentURL(driver), "https://www.saucedemo.com/inventory.html", "Login failed: URL is not the inventory page");
        return this;
    }
    public LoginPage assertSuccessfullLogin() {
        Validations.validationPageUrl(driver,"https://www.saucedemo.com/inventory.html");
        return this;
    }

    public LoginPage assertUnsuccessfullLogin() {
        Validations.validationEquals(getErrorMessage(),"Epic sadface: Username and password do not match any user in this service","Error message is not as expected");
        return this;
    }
    // pattern approach
}
