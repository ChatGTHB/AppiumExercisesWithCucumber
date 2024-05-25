package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SauceDemoPage;
import utils.Hooks;

public class SauceDemoStep extends Hooks {

    SauceDemoPage sauceDemoPage = new SauceDemoPage(androidDriver);

    @Given("I have opened Souce Demo Web Page")
    public void i_have_opened_souce_demo_web_page() {
        androidDriver.get("https://www.saucedemo.com/");
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        sauceDemoPage.usernameTextBoxJS(username);
        sauceDemoPage.passwordTextBoxJS(password);
    }

    @Then("I click on the login button")
    public void i_click_on_the_login_button() {
        sauceDemoPage.clickLogin();
    }

    @Then("I should be able to see header text")
    public void i_should_be_able_to_see_header_text() {
    }
}
