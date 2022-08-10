package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features="./src/test/resources/features",
        glue="stepdefinitions", //path of the step definitions package.
        tags="@customer_login",  //only these will run. @customer_login is the tag of feature file.
        dryRun = false

)
public class Runner {
}
