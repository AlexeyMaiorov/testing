package ru.qa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "summary", "pretty"},
        glue = {"ru/qa/stepdefs"},
        features = {"src/test/resources/features"},
        tags = "@Rcheck")
public class TestRunner {
}
