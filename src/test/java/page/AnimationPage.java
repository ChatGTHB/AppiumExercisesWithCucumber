package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Hooks;

public class AnimationPage extends Hooks {

    public AnimationPage() {
        PageFactory.initElements(androidDriver, this);
    }

    //We created the findElementAccessibilityId(String id) method
    // to read findElementAccessibilityId locators via the Android driver.

    public WebElement findelementByAccessibilityId(String id) {
        return androidDriver.findElementByAccessibilityId(id);
    }

    public void isDisplayedElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public WebElement getAccessibilityButton() {
        return findelementByAccessibilityId("Access'ibility");
    }

    public WebElement getViewsButton() {
        return findelementByAccessibilityId("Views");
    }

    public WebElement getListsButton() {
        return findelementByAccessibilityId("Lists");
    }

    public WebElement getCloningButton() {
        return findelementByAccessibilityId("Cloning");
    }

    public WebElement getAnimationButton() {
        return findelementByAccessibilityId("Animation");
    }
}
