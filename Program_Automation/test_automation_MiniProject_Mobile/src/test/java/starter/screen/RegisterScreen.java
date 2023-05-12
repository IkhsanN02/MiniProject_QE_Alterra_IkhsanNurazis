package starter.screen;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {


    public String password = "newuser";
    public String invpassword ="";


    private By account(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By registerLink(){
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By nameField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By emailField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By passwordField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }


    private By registerButton(){
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Register\"]");
    }


    @Step
    public void clickAccount(){
        onClick(account());
    }
    @Step
    public void clickRegisterLink(){
        onClick(registerLink());
    }
    @Step
    public void clicktypeNameField(){
        onClick(nameField());
    }
    @Step
    public void inputNameField(String username){
        onType(nameField(), username);
    }
    @Step
    public void clicktypeEmailField() {
        onClick(emailField());
    }

    public void inputEmailField(String email){
        onType(emailField(), email);
    }
    @Step
    public void clicktypePasswordField() {
        onClick(passwordField());
    }

    @Step
    public void inputPassword(){
        onType(passwordField(), password);
    }
    public void inputinvPassword(){
        onType(passwordField(), invpassword);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }
    @Step
    public void validateHomePage(){
        waitUntilVisible(account());
    }


}
