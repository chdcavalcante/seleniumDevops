package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/"},
        features = "C:/users/carlo/saucedemo_portfolio/DevopsSeleniumWebdriverQazando/src/test/resources/features",
        glue = {"steps"},
        tags = {"~@Ignore"}
)
public class RunCucumber extends RunBase{

    @AfterClass
    public static void stop(){
        getDriver().quit();
    }

}
