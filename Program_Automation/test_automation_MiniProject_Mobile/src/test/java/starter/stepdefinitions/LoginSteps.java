package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;
    @Given("user on home page")
    public void userOnHomePage() {
        login.onHomePage();
    }
    @When("user click account info")
    public void userClikAccount(){
        login.clickAccount();
    }


    @When("user input valid email")
    public void userInputValidEmail() {
        login.clickTypeEmail();
        login.inputEmail("someone@mail.com");
    }

    @And("user input valid password")
    public void userInputInvalidPassword() {
        login.clickTypePassword();
        login.inputPassword("123123");
    }


    @And("user click login button")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }
    @Then("user back to home page")
    public void validateHomePage() {
        login.validateHomePage();
    }
}
