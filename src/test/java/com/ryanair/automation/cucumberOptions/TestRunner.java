package com.ryanair.automation.cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", tags = "@SmokeTest", plugin = {"pretty", "html:target/cucumber/Test Report.html"}, monochrome = true)
public class TestRunner {

}