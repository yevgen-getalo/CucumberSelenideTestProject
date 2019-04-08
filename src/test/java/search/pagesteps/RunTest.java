package search.pagesteps;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report", "json:target/cucumber.json"},
        features = "src/test/java/search/features")

public class RunTest {
    @BeforeClass
    public static void setUp() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().version("73");
    }
}
