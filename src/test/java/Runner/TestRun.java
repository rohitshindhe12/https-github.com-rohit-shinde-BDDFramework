package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features ="src/test/resources/Features/Login.feature",
glue = "StepDefination",
plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"
    },
monochrome = true
)


public class TestRun extends AbstractTestNGCucumberTests{

}
