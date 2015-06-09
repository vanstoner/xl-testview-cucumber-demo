package cucumber.examples.java.calculator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = "json:build/reports/cucumber-report.json", dotcucumber = ".cucumber")
public class RunCukesTest {
}
