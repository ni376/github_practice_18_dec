package com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature1"
		,glue={"step_definition1"}
		)

public class TestRunner1 {

}
