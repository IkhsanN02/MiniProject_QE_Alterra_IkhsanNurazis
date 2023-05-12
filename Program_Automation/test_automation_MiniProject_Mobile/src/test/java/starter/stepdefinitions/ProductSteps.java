package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;
import starter.screen.ProductScreen;

public class ProductSteps {
    @Steps
    LoginScreen login;
    @Steps
    ProductScreen productScreen;

    @Given("user go on home page")
    public void userOnHomePage() {
        login.onHomePage();
    }
    @When("user can click account info")
    public void userClikAccount(){
        login.clickAccount();
    }


    @When("user can input valid email")
    public void userInputValidEmail() {
        login.clickTypeEmail();
        login.inputEmail("someone@mail.com");
    }

    @And("user can input valid password")
    public void userInputInvalidPassword() {
        login.clickTypePassword();
        login.inputPassword("123123");
    }


    @And("user can click login button")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }
    @Then("user back to home page andd see all product")
    public void validateHomePage(){login.validateHomePage();}
    @Then("user can choose the product and add to cart")
    public void addTocart(){productScreen.tambahkanProduk();}
}
