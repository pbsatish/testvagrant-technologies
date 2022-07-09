package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features/Nationality.feature"
,glue= {"stepdev1"},
monochrome=true ,
strict=true,
dryRun=true,
plugin = {"pretty", "html:target/cucumber-html-report"},

tags = {"@FunctionalTest"}


)

public class testrunner {

}