package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/", //where our feature files are located
        glue = "com/vytrack/step_definitions/", //we tell where the step definitions are to the runner
//      dryRun = true,//this helps us to find only undefined steps in our scenarios where we can get the method
        dryRun = false, //--> cucumber will execute normal, meaning java will execute
        tags = "@login" //tags is another cucumber option. it allows us to run certain scenario(s)


)
public class CukesRunner {
}
