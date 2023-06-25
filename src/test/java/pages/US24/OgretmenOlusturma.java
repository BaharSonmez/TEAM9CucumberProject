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

    @FindBy(xpath ="(//a[@class='nav-link'])[10]")
    public WebElement teacherMngBotonu;

    @FindBy(xpath ="(//h5[@class='fw-bold p-3 card-header'])[1]")
    public WebElement addTeacheryazisi;

    @FindBy(xpath ="//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLlessonKutusu;

    @FindBy(xpath ="//div[text()='Java']")
    public WebElement javaDersSecimi;

    @FindBy(xpath ="//input[@id='name']")
    public WebElement nameKutusu;

    @FindBy(xpath ="//input[@id='surname']")
    public WebElement surnameKutusu;

    @FindBy(xpath ="//input[@id='birthPlace']")
    public WebElement birthPlaceKutusu;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement emailKutusu;

    @FindBy(xpath ="//input[@id='phoneNumber']")
    public WebElement phonenumberKutusu;

   @FindBy(xpath ="//input[@id='isAdvisorTeacher']")
    public WebElement adviserTeacherKutusu;

   @FindBy(xpath ="(//*[@class='form-check-label'])[1]")
    public WebElement adviserTeacherYazisi;

   @FindBy(xpath ="(//*[@class='form-label'])[1]")
    public WebElement genderYazisi;

   @FindBy(xpath ="//*[text()='Male']")
    public WebElement maleKutusu;

   @FindBy(xpath ="//input[@id='birthDay']")
    public WebElement dateOfBirth;

   @FindBy(xpath ="//input[@id='ssn']")
    public WebElement ssnKutusu;

   @FindBy(xpath ="//input[@id='username']")
    public WebElement usernmaKutusu;

   @FindBy(xpath ="//input[@id='password']")
    public WebElement paaswordKutusu;

   @FindBy(xpath ="//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButonu;







}
