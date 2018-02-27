package selenium.demo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/acceptance-test/resources",glue="selenium.demo.test")
public class LoginTestRunner {
	
}
