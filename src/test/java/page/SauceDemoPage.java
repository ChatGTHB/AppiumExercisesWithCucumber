package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import utils.Hooks;


public class SauceDemoPage extends Hooks {

    public SauceDemoPage(AndroidDriver<WebElement> driver) {
        androidDriver = driver;
    }

    public void executeElement(String element) {

        androidDriver.executeScript(element);
    }

    public String usernameTextBoxJS(String key) {
        return "document.querySelector(\"#user-name\").value='" + key + "';";
    }

    public String passwordTextBoxJS(String key) {
        return "document.querySelector(\"#password\").value='" + key + "';";
    }

    public String clickLogin() {
        return "document.querySelector(\"#login-button\").click();";
    }
}
