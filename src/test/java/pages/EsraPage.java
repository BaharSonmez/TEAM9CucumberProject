package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EsraPage {
    public EsraPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameLogin;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton2;

    @FindBy(xpath = "(//*[@class=\"fw-bold p-3 card-header\"])[1]")
    public WebElement AdminManagement;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement namE;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement validName;

    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement invalidName;


    @FindBy(xpath = "//*[@id=\"surname\"]")
    public WebElement surnamE;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement validSurname;

    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[2]")
    public WebElement invalidSurname;

    @FindBy(xpath = "//*[@id=\"birtPlace\"]")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@value=\"FEMALE\"]")
    public WebElement femalE;

    @FindBy(xpath = "//*[@value=\"MALE\"]")
    public WebElement malE;

    @FindBy(xpath = "//*[@id=\"birthDay\"]")
    public WebElement birthdayE;

    @FindBy(xpath = "//*[@id=\"phoneNumber\"]")
    public WebElement phoneNumberE;

    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement ssnE;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement usernamE;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordE;

    @FindBy(xpath = "//*[@class=\"fw-semibold btn btn-primary btn-lg\"]")
    public WebElement submitButtonE;


    public static class US06 extends EsraPage {

        @FindBy(xpath = "(//*[@class=\"fw-bold p-3 card-header\"])[1]")
        public WebElement VIceDeanManagement;
    }
}