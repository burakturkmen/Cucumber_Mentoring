package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs1_Page {

    public SwagLabs1_Page(WebDriver driver){ //constractor

        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement login;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement sourceLabsBackpack;

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    public WebElement addToCart;

    @FindBy(xpath = "//span[contains(text(),'1')]")
    public WebElement cartIcon;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public WebElement priceText;


}
