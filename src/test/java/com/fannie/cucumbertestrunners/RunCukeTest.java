package com.fannie.cucumbertestrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/fannie/features",
glue = "com.fannie.stepdefinitions", tags = {
		"@ddt" }

// 		plugin = { "pretty", "html:target/cucumber-reports", "json:target_json/Cucumber.json",
//				"junit:target_junit/Cucumber_junit.xml" }

)
public class RunCukeTest {

}
