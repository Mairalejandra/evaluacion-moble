package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    SearchScreen searchScreen;

    SearchDetailsScreen searchDetailsScreen;



    @Step("inicio con usuario y contraseña {0}")
    public void searchByText(String user, String password){

        searchDetailsScreen.clickusuario();
        searchDetailsScreen.inputusuario(user);
        searchDetailsScreen.clickpassword();
        searchDetailsScreen.inputpassword(password);
        searchDetailsScreen.inputbutton();
    }


    @Step("Obtiene el titulo PRODUCTS")
    public String validar (){
        return searchScreen.validartitulo();
    }
}
