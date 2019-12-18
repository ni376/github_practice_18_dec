package com.acc.test1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature8"
		,glue={"step_definition99"}
		,tags={"@SmokeTest","@RegressionTest"}
		)
public class TestRunner {
	
	
}
				

