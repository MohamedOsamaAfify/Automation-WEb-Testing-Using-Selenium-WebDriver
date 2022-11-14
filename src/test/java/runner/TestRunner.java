package runner;

import io.cucumber.junit.CucumberOptions;
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
                  "json:target/cucumber-reports/CucumberTestReport.json",
                  "rerun:target/cucumber-reports/rerun.txt"},
        dryRun = false,
        tags = "@Smoke"
)
public class TestRunner
{

}
