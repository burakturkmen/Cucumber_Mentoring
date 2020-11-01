package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
        },

        features = {"src/test/java/FeatureFiles/SwagLabs2.feature"},
        glue = {"StepDefinition"},
        dryRun = false,
        tags = {"@SmokeTest"}
)


public class ExtendReport extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass() {

        Reporter.loadXMLConfig("src/test/java/XmlFiles/ExtendReport.xml");//ayarlar alındı cucumber extend reporttan haberi oldu

        Reporter.setSystemInfo("QA Tester :  ", "Burak Turkmen");
        Reporter.setSystemInfo("Application name : ", "SourceLab   ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}