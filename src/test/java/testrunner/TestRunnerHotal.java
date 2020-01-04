package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skip.feature/Hotal.feature",glue= "stepdefinition")

public class TestRunnerHotal {

}
