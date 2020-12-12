package com.yesim.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"
        , glue = "com.yesim.test.tests")
public class CucumberRunner {
}
