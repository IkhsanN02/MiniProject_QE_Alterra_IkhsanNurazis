package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
//import starter.screen.LoginScreen;
import starter.screen.RegisterScreen;

public class RegisterSteps {


    public int id = 911;
    @Steps
    RegisterScreen registerScreen;

    @When("New user click account")
    public void Account(){
        registerScreen.clickAccount();
}
    @When("New user click register")
    public void userClickRegisterLink(){
        registerScreen.clickRegisterLink();
    }

    @And("New user input name on name field")
    public void inputNameField(){
        registerScreen.clicktypeNameField();
        registerScreen.inputNameField("akunbaru" + id );
    }

    @And("New user input email on email field")
    public void inputEmailField(){
        registerScreen.clicktypeEmailField();
        registerScreen.inputEmailField("akunbaru" + id + "gmail.com");
    }

    @And("New user input password on password field")
    public void inputPasswordField(){
        registerScreen.clicktypePasswordField();
        registerScreen.inputPassword();
    }

    @And("New user click register button")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();
    }
    @Then("New user back to home page")
    public void validateRegistered(){
        registerScreen.validateHomePage();
    }

}
