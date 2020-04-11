package ru.timmson.workshop.bddandtdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty"},
        strict = true
)
public class CucumberRunner {
}
