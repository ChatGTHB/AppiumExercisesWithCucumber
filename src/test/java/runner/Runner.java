package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
        plugin = {"pretty", "json:target/cucumber.json",},
        features = "srsc/test/resources/features",
        glue = "stepdefinitions",
        tags = "@amazon",
        dryRun = false
        )

public class Runner extends AbstractTestNGCucumberTests {

}
