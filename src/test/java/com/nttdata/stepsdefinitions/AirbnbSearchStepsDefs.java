package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me encuentro en el login swagger")
    public void que_me_encuentro_en_el_login_de_swagger() {


    }

    @When("inicio sesion con usuario {string} y contraseña {string}")
    public void inicio_sesion(String user , String password) {

        airbnbSearchSteps.searchByText(user, password);
    }
    @Then("valido que aparezca el titulo {string}")
    public void valido_que_aparezca_el_titulo(String title) {

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(airbnbSearchSteps.validar(),title);

    }

}
