package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps2 {
    @Steps
    LoginScreen login;
    @Given("user on home page2")
    public void userOnHomePage() {
        login.onHomePage();
    }
    @When("user click account info2")
    public void userClikAccount(){
        login.clickAccount();
    }


    @When("user input valid email2")
    public void userInputvalidEmail() {
        login.clickTypeEmail();
        login.inputEmail("someone@mail.com");
    }

    @And("user input invalid password2")
    public void userInputinvalidPassword() {
        login.clickTypePassword();
        login.inputPassword("newuserxx");
    }


    @And("user click login button2")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }

    @Then("user cant login and see error message login2")
    public void userSeeErrorMessage() {
    login.getErrorMessage();
}
}
