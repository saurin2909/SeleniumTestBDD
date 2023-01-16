package Runner;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(
        features = {"F:\\Saurin\\eclipse_wokspace\\SeleniumTestBDD\\src\\main\\java\\Feature"},
        glue = {"StepDefination"},
        tags = "@SmokeTest"
       
        )

public class TestRunner {

}

