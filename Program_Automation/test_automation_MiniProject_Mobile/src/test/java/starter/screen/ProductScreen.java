package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ProductScreen extends BasePageObject {
    private By beliProduk(){
        return AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    @Step
    public void tambahkanProduk(){
        onClick(beliProduk());
    }
}
