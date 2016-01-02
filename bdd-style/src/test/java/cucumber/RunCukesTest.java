package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    glue = "cucumber.step_definitions",
    features = "src/test/resources"
)
public class RunCukesTest {
}
