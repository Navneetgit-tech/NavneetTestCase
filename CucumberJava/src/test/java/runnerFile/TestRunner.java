package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//login2.feature",
glue= {"StepDefinition"},
monochrome=true ,plugin= {"pretty","json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/index.html",
		"json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//tags="@StarCount"
//		,tags="@StarCount or @Quantity and not @XL"
)
public class TestRunner {

}
