package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\java\\BBD\\Features"

,glue= {"BDD.BBD"}
)

public class Runner {

}
