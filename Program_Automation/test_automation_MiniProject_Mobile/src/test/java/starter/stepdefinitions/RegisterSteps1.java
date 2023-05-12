package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.RegisterScreen;

public class RegisterSteps1 {

    public int id = 911;
    @Steps
    RegisterScreen registerScreen;

    @When("New user click account1")
    public void Account(){
        registerScreen.clickAccount();
}
    @When("New user click register1")
    public void userClickRegisterLink(){
        registerScreen.clickRegisterLink();
    }

    @And("New user input email on email field1")
    public void inputEmailField(){
        registerScreen.clicktypeNameField();
        registerScreen.inputNameField("");
        registerScreen.clicktypeEmailField();
        registerScreen.inputEmailField("newuser" + id + "gmail.com");
    }

    @And("New user input password on password field1")
    public void inputPasswordField(){
        registerScreen.clicktypePasswordField();
        registerScreen.inputPassword();
    }

    @And("New user click register button1")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();
    }
    @Then("user see error message1")
    public void validateRegistered(){
        registerScreen.validateHomePage();
    }

}
