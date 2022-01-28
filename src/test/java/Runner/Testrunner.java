package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions (
        features = "src/test/resources/TestFeature.feature",
        glue = {"StepDefination"}
)
public class Testrunner extends AbstractTestNGCucumberTests {
}
