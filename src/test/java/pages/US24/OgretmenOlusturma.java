package pages.US24;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OgretmenOlusturma {
    public OgretmenOlusturma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement homePageLogin1;

    @FindBy(xpath ="//input[@id='username']")
    public WebElement username ;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password ;

    @FindBy(xpath ="(//button[@type='button'])[3]")
    public WebElement login;

    @FindBy(xpath ="//*[text()='Teacher Management']")
    public WebElement teacherManagement;




    @FindBy(xpath ="//input[@id='password']")
    public WebElement password1 ;

    @FindBy(xpath ="(//button[@type='button'])[1]")
    public WebElement menuButonu;







}
