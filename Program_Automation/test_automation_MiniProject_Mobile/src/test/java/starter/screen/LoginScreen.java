package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By emailFiled() {
        return AppiumBy.xpath(  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By accountInfo() {
        return AppiumBy.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By passwordField() {
        return AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton() {
        return AppiumBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By errorlogin(){
        return AppiumBy.xpath("\t\n" +"//android.view.View[@content-desc=\"email can not empty\"]");
    }

    private By errorMessage() {
        return AppiumBy.xpath("\t\n" +"//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }


    @Step
    public void onHomePage() {
        Assert.assertTrue(waitUntilVisible(accountInfo()).isDisplayed());
    }
    @Step
    public void clickAccount(){
        onClick(accountInfo());
    }
    @Step
    public void clickTypeEmail(){onClick(emailFiled());}
    @Step
    public void clickTypePassword(){onClick(passwordField());}
    @Step
    public void inputEmail(String email) {
        onType(emailFiled(), email);
    }

    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void validateHomePage(){waitUntilVisible(accountInfo());}

    @Step
    public void getErrorMessage() {waitUntilVisible(errorMessage());}

    @Step
    public void validateFailLogin(){
        waitUntilVisible(errorlogin());
    }
}
