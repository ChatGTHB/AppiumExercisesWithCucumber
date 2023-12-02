package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AmazonWebPage;
import page.AnimationPage;
import page.OsPage;
import utils.Hooks;

public class ApiDemosAppStep extends Hooks {

    AnimationPage animationPage = new AnimationPage();
    AmazonWebPage amazonWebPage = new AmazonWebPage();
    OsPage ospage = new OsPage();

    @Given("I have opened the ApiDemos application")
    public void i_have_opened_the_api_demos_application() {
        setUpApplication();
    }

    @When("I click on the Animation Button")
    public void i_click_on_the_animation_button() {
        animationPage.clickElement(animationPage.getAnimationButton());
    }

    @Then("I should be able to see Cloning Button")
    public void i_should_be_able_to_see_cloning_button() {
        animationPage.isDisplayedElement(animationPage.getCloningButton());
    }

    @When("I click on the Operating System Button")
    public void i_click_on_the_operating_system_button() {
        ospage.clickElement(ospage.getOSButton());
    }

    @When("I click on the Morce Code button")
    public void i_click_on_the_morce_code_button() {
        ospage.clickElement(ospage.getMorseCodeButton());
    }

    @Then("I should type {string} in the Vibrate text box")
    public void i_should_type_in_the_vibrate_text_box(String names) {
        ospage.setTextBox().sendKeys(names);
    }


    @Given("I have opened Amazon Mobile Web page")
    public void i_have_opened_amazon_mobile_web_page() {
        androidDriver.get("https://www.amazon.com");
    }

    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String product) {
        amazonWebPage.searchTextBoxJS(product);
    }

    @Then("I click on the search button")
    public void i_click_on_the_search_button() {
        amazonWebPage.clickSearchBoxJS();
    }
}
