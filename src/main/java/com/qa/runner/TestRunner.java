package com.qa.runner;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(
        features = {"F:\\Saurin\\eclipse_wokspace\\SeleniumTestBDD\\src\\main\\java\\com\\qa\\feature"},
        glue = {"com\\qa\\stepdefination"}
         )

public class TestRunner {

}

