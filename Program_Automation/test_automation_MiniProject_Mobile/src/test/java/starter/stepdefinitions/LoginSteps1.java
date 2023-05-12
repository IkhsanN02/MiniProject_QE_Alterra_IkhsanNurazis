package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps1 {
    @Steps
    LoginScreen login;
    @Given("user on home page1")
    public void userOnHomePage() {
        login.onHomePage();
    }
    @When("user click account info1")
    public void userClikAccount(){
        login.clickAccount();
    }


    @When("user input invalid email1")
    public void userInputinvalidEmail() {
        login.clickTypeEmail();
        login.inputEmail("newuserxx@gmail.com");
    }

    @And("user input valid password1")
    public void userInputvalidPassword() {
        login.clickTypePassword();
        login.inputPassword("123123");
    }


    @And("user click login button1")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }

    @Then("user cant login and see error message login1")
    public void userSeeErrorMessage() {
    login.getErrorMessage();
}
}
