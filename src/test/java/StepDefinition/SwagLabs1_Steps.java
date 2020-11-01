package StepDefinition;

import Pages.SwagLabs1_Page;
import Utilities.baseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

public class SwagLabs1_Steps {
     WebDriver driver;

    @Given("^Navigate to Swaglabs Login Page$")
    public void navigate_to_Swaglabs_Login_Page() throws Throwable {
        driver = baseDriver.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^Enter Username and Password$")
    public void enter_Username_and_Password() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        swagLabs1_page.username.sendKeys("standard_user");
        swagLabs1_page.password.sendKeys("secret_sauce");
    }

    @Then("^Click to Login Button$")
    public void click_to_Login_Button() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        swagLabs1_page.login.click();
    }

    @When("^Click to Sauce Labs Bacpack$")
    public void click_to_Sauce_Labs_Bacpack() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        swagLabs1_page.sourceLabsBackpack.click();
    }

    @Then("^Click to Add to Cart$")
    public void click_to_Add_to_Cart() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        swagLabs1_page.addToCart.click();
    }

    @Then("^Click to Cart$")
    public void click_to_Cart() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        swagLabs1_page.cartIcon.click();
    }

    @Then("^Verify Items Price Text$")
    public void verify_Items_Price_Text() throws Throwable {
        SwagLabs1_Page swagLabs1_page = new SwagLabs1_Page(driver);
        System.out.println("Item Price: "+ swagLabs1_page.priceText.getText());


    }

}
