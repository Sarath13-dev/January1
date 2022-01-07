package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},  plugin= {"json:src\\test\\resources\\Reports\\output.json"})
public class TestRunnerClass {

	@AfterClass
	public static void report() {
		
		JVMReport.generateJvmReport(System.getProperty("user.dir", "\\src\\test\\resources\\Reports\\output.json"));
	}
	
}
