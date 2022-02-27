package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@teapot_search or @flower_search"

)

public class Runner {
}

/*
Runner is used to run the feature files(Test Cases)
@RunWith(Cucumber.class) : This makes the class runnable.
@CucumberOptions :
- add of features folder, step definitions folder
-tags
-DryRun
-Report plugins
-failedRunner plugin
-----------------------------------
--What is the roll of?
-features : path of features folder
-glue : path of step definitions folder
- tags : to run individual or multiple features or scenarios
-->For Example: If i pass same tag to multiple feature, then all features with that tag will run
 */