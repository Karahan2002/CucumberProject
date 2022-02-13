package com.finworkserp.pages;

import com.finworkserp.utilities.ConfigurationReader;
import com.finworkserp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement successTest;

    public void enterValidEmail(){
        emailInput.sendKeys(ConfigurationReader.get("email"));
    }
    public void enterValidPassword(){
        passwordInput.sendKeys(ConfigurationReader.get("password"));
    }
    public void clickButton(){
        loginButton.click();
    }
    public void enterValidCredentials(){
        enterValidEmail();
        enterValidPassword();
    }
    public void validation(){
        if(successTest.getText().equals("Congratulations, your inbox is empty")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
