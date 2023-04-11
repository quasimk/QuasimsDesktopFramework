package DesktopFramework.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)

    @CucumberOptions(features="src/test/resources/Feature",
            glue= {"DesktopFramework/stepdefinitions", "DesktopFramework/AppHooks"})
    public class DesktopRunner {

}
