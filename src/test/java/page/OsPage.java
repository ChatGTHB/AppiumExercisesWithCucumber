package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Hooks;

public class OsPage extends Hooks {

    public OsPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public WebElement findelementByAccessibilityId(String id) {
        return androidDriver.findElementByAccessibilityId(id);
    }

    public WebElement findByClass(String clasName) {
        return androidDriver.findElement(By.className(clasName));
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public WebElement getOSButton() {
        return findelementByAccessibilityId("OS");
    }

    public WebElement getMorseCodeButton() {
        return findelementByAccessibilityId("Morse Code");
    }

    public WebElement setTextBox() {
        return findByClass("android.widget.EditText");
    }

    public void isDisplayedElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
}
