package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement titulo;

    public String validartitulo(){
        return titulo.getText();
    }



}