package StepDefinition;

import Pages.SwagLabs1_Page;
import Pages.SwagLabs2_Page;
import Utilities.baseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SwagLabs2_Steps {
    WebDriver driver;
    
    @Given("^Navigate to Swaglabs Login Page (\\d+)$")
    public void navigate_to_Swaglabs_Login_Page(int arg1) throws Throwable {
        driver = baseDriver.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^Enter Username and Password (\\d+)$")
    public void enter_Username_and_Password(int arg1) throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.username2.sendKeys("standard_user");
        swagLabs2_page.password2.sendKeys("secret_sauce");
    }

    @Then("^Click to Login Button (\\d+)$")
    public void click_to_Login_Button(int arg1) throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.login2.click();
    }

    @When("^Click to Sauce Labs Bolt T-Shirt$")
    public void click_to_Sauce_Labs_Bolt_T_Shirt() throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.sourceLabsTshirt.click();
    }

    @Then("^Click to Add to Cart (\\d+)$")
    public void click_to_Add_to_Cart(int arg1) throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.addToCart2.click();

    }

    @Then("^Click to Cart (\\d+)$")
    public void click_to_Cart(int arg1) throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.cartIcon2.click();

    }

    @Then("^Verify Items Price Text (\\d+)$")
    public void verify_Items_Price_Text(int arg1) throws Throwable {
        SwagLabs2_Page swagLabs2_page = new SwagLabs2_Page(driver);
        swagLabs2_page.priceText2.getText();


    }

}
