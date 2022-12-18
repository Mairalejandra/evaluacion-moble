package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement click_user;

    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement input_user;

    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement click_password;

    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement input_password;

    @AndroidFindBy( xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement click_button;

    public void clickusuario(){
        click_user.click();
    }

    public void inputusuario(String user){
        input_user.sendKeys(user);
    }

    public void clickpassword(){
        click_password.click();
    }

    public void inputpassword(String password){
        input_password.sendKeys(password);
    }

    public void inputbutton(){
        click_button.click();
    }




}
