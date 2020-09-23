package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/ContactDetailMap.feature" }, glue = {
		"StepDefinations" }, monochrome = true,

		strict = true)

public class RunnerTest {

}
