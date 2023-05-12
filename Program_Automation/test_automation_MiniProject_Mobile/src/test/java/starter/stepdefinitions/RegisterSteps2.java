package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.RegisterScreen;

public class RegisterSteps2 {

    public int id = 911;
    @Steps
    RegisterScreen registerScreen;

    @When("New user click account2")
    public void Account(){
        registerScreen.clickAccount();
}
    @When("New user click register2")
    public void userClickRegisterLink(){
        registerScreen.clickRegisterLink();
    }

    @And("New user input name on name field2")
    public void inputNameField(){
        registerScreen.clicktypeNameField();
        registerScreen.inputNameField("akunbaru" + id );
        registerScreen.clicktypeEmailField();
        registerScreen.inputEmailField("");
    }


    @And("New user input password on password field2")
    public void inputPasswordField(){
        registerScreen.clicktypePasswordField();
        registerScreen.inputPassword();
    }

    @And("New user click register button2")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();
    }
    @Then("user see error message2")
    public void validateRegistered(){
        registerScreen.validateHomePage();
    }

}
