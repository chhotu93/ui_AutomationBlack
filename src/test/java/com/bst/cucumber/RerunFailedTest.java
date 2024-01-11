package com.bst.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"@target/rerun.txt"},
    monochrome = true,
    plugin = {
      "pretty",
      "html:target/cucumber-html-reports",
      "json:target/cucumber-report/cucumber_rerun.json"
    },
    glue = {"com/bst/stepdefinitions", "com/bst/base", "com/bst/cucumber"})
public class RerunFailedTest { // extends AbstractTestNGCucumberTests {
}
