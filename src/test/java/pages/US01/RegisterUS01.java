package pages.US01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterUS01 {

    public RegisterUS01() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement register;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement namebutton;


    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderfemale;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement registerOk;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordinvalid;
}