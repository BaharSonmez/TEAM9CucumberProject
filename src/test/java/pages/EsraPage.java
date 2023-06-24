package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EsraPage {
    public EsraPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//a[@href='/login']")
    public WebElement loginbutton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameLogin;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordLogin;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton2;
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButtonE;
    @FindBy(xpath = " (//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[3])[2]")
    public WebElement viceDeanButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement namE;
    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement validName;
    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement invalidName;


    @FindBy(xpath = "//*[@id=\"surname\"]")
    public WebElement surnamE;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[2]")
    public WebElement validSurname;
    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[2]")
    public WebElement invalidSurname;

    @FindBy(id="birthPlace")
    public WebElement birthPlace;
    @FindBy(xpath = "//input[@placeholder=\"Birth Place\"]")
    public WebElement validbirthPlace;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[3]")
    public WebElement invalidbirthPlace;

    @FindBy(id="birthDay")
    public WebElement birthdayE;
    @FindBy(xpath = "//input[@type=\"date\"]")
    public WebElement validbirthDay;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[4]")
    public WebElement invalidbirthDay;


    @FindBy(xpath = "//*[@value=\"FEMALE\"]")
    public WebElement femalE;
    @FindBy(xpath = "//*[@value=\"MALE\"]")
    public WebElement malE;

    @FindBy(id="phoneNumber")
    public WebElement phoneNumberE;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[5]")
    public WebElement invalidPhoneNumber;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement phoneuyariYazisi;

    @FindBy(xpath = "//div[text()='Admin Please entervalid phone number']")
    public WebElement phoneValidUyari;




    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement ssnE;
    @FindBy(xpath = "//input[@placeholder=\"ssn\"]")
    public WebElement validssn;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[6]")
    public WebElement invalidSSN;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement usernamE;
    @FindBy(xpath = "//input[@placeholder=\"username\"]")
    public WebElement validusername;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[7]")
    public WebElement invalidusername;

    
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordE;
    @FindBy(xpath = "//input[@placeholder=\"password\"]")
    public WebElement validpassword;
    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[8]")
    public WebElement invalidpassword;

    @FindBy(xpath = "//*[@class=\"fw-semibold btn btn-primary btn-lg\"]")
    public WebElement submitButtonE;


    public static class US06 extends EsraPage {

        @FindBy(xpath = "(//*[@class=\"fw-bold p-3 card-header\"])[1]")
        public WebElement VIceDeanManagement;
    }
}