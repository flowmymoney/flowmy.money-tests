package money.flowmy.testing.Settings;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "money.flowmy.testing.StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class RunnerTest {

}
