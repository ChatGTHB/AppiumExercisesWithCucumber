package page;

import org.openqa.selenium.support.PageFactory;
import utils.Hooks;


public class AmazonWebPage extends Hooks {

    public AmazonWebPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public String searchTextBoxJS(String key) {
        return "document.querySelector(\"#twotabsearchtextbox\").value='" + key + "';";
    }

    public String clickSearchBoxJS() {
        return "document.querySelector(\"#nav-search-submit-button\").click();";
    }

    public void executeElement(String element) {
        androidDriver.executeScript(element);
    }
}

