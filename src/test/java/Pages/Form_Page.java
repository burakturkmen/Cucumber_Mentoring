package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Page {

    public Form_Page(WebDriver driver){ //constractor

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first_3']")
    public WebElement isim;

    @FindBy(xpath = "//input[@id='last_3']")
    public WebElement soyIsim;

    @FindBy(xpath = "//input[@id='input_10']")
    public WebElement mail;

    @FindBy(xpath = "//input[@id='input_12_area']")
    public WebElement alanKodu;

    @FindBy(xpath = "//input[@id='input_12_phone']")
    public WebElement telNo;

    @FindBy(xpath = "//input[@id='input_11_1']")
    public WebElement hangisi;

    @FindBy(xpath = "//button[@id='input_14']")
    public WebElement gonder;

    @FindBy(xpath = "//h1[contains(text(),'Teşekkürler!')]")
    public WebElement tesekkurler;
}
