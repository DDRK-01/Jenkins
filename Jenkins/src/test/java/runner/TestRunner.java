package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\TWA.feature",
glue="com.step",dryRun = false, plugin="html:target")

public class TestRunner{
	
}
