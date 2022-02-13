package com.finworkserp.stepdefinitions;

import com.finworkserp.pages.LoginPage;
import com.finworkserp.utilities.BrowserUtils;
import com.finworkserp.utilities.ConfigurationReader;
import com.finworkserp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterValidCredentials();
    }
    @When("the user clicks login button")
    public void the_user_clicks_login_button() {
        loginPage.clickButton();
    }
    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        BrowserUtils.waitFor(5);
        loginPage.validation();
    }

}
