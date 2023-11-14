package Dominos;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Dominos\\feature\\Dominos.feature", glue = "Dominos\\Step_definition_file", dryRun = false, publish = true)
public class DominoRunner {

}

