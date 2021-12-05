package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features",glue= {"StepDefinitions"}, monochrome=true,
plugin = {"pretty","json:target/JSONReports/reports.json",
		"junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports"})
public class TestRunner {

}
