package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs2_Page {

    public SwagLabs2_Page(WebDriver driver){ //constractor

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username2;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password2;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement login2;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[3]")
    public WebElement sourceLabsTshirt;

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    public WebElement addToCart2;

    @FindBy(xpath = "//span[contains(text(),'1')]")
    public WebElement cartIcon2;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public WebElement priceText2;
}
