package StepDefinition;

import Utilities.baseDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class Register_Steps {

    WebDriver driver;

    @Given("^Navigate to Register Website$")
    public void navigate_to_Register_Website(){
       driver = baseDriver.getDriver();
       driver.get("https://demoqa.com/automation-practice-form/");
    }

    @When("^Fill the Areas$")
    public void fill_the_Areas(DataTable table) {

        List<List<String>> data = table.raw();
        System.out.println(data.get(1).get(1));

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(data.get(4).get(1));
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(data.get(5).get(1));
    }

    @Then("^Verify Register Page's Url$")
    public void verify_Register_Page_s_Url(){
        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, "https://demoqa.com/automation-practice-form/");


    }
}
