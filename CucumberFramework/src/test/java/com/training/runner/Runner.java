package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
		                            "json:target/cucumber-reports/cucumber.json"},
                 features="C:\\Users\\aruma\\eclipse-workspace\\CucumberFramework-20221116T234415Z-001\\CucumberFramework\\resources\\SalesForceLogin.feature",
                 glue= {"com.training.steps"},
                 tags="@smoke"
		)

public class Runner {

}
