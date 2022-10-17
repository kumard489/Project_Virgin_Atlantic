package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target\\Report\\FailedScenarios.txt", glue="org.step_definition", dryRun=false,
monochrome=true, tags="", plugin= {"html:target\\Report", "junit:target\\Report\\VA.xml",
		"json:target\\Report\\Output.json", "rerun:target\\Report\\FailedScenarios.txt"} )

public class TestReRunner extends JVMReport{
	@AfterClass
	public static void VA() {
		
		JVMReport(System.getProperty("user.dir")+"\\target\\Report\\Output.json");
	}
	

}
