package com.bigfuture.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                 "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        }, // another type of xml file to keep key value structure. plugin keyword trigger the file
        features = "src/test/resources/features",  // file kodlari yer aliyor
          glue = "com/bigfuture/step_def",  // java kodlari
        dryRun= false,
         tags= "@EUG2-171"

        // active tagleri bulup silmek icin CMD+SHIFT+F

)
public class CukesRunner {
}

