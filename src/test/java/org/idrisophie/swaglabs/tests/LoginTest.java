package org.idrisophie.swaglabs.tests;

import org.idrisophie.swaglabs.pages.LoginPage;
import org.idrisophie.swaglabs.utils.CustomSoftAssertion;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    // variables
    private WebDriver driver;

    // Tests
    @Test
    public void successfullLogin(){
        new LoginPage(driver).enterUsername("standard_user")
                .enterPassword("secret-sauce")
                .clickLoginButton()
                .assertSuccessfullLoginSoft();
    }

    // Configurations
    @BeforeMethod
    public void setUp(){
        //code
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximazed");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
        new LoginPage(driver).navigateToLoginPage();
    }

    @AfterMethod
    public void tearDown(){
        //code
        driver.quit();
        CustomSoftAssertion.customAssertAll();
    }
}
