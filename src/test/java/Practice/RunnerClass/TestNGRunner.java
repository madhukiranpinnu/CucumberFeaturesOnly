package Practice.RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Practice/Features",
        glue = {"Practice/Features/StepDefinations"},
        monochrome = true,
tags = "@1",
plugin = {"pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json"
},
dryRun = false)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
