package pages.US13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanOgretmenOlusturma {

    public ViceDeanOgretmenOlusturma(){PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//*[text()='Teacher Management']")
    public WebElement teacherManagement;
    @FindBy(xpath ="//a[@class='header_link ms-2']")
    public WebElement login1;

    @FindBy(xpath ="//input[@id='username']")
    public WebElement username1 ;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password1 ;
    @FindBy(xpath ="//*[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement ChoseLes1;
    @FindBy(xpath ="//*[@class=' css-9jq23d']")
    public WebElement javaDersSecimi;

    @FindBy(xpath ="//input[@id='name']")
    public WebElement nameKutusu;

    @FindBy(xpath ="(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath ="//input[@id='surname']")
    public WebElement surnameKutusu;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequired;

    @FindBy(id ="birthPlace")
    public WebElement birthplace;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[3]")
    public WebElement birthplaceRequired;

    @FindBy(xpath ="//*[@id='email']")
    public WebElement email;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[4]")
    public WebElement emailRequired;

    @FindBy(xpath ="//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneNumberRequired;

    @FindBy(xpath ="//*[text()='Is Advisor Teacher']")
    public WebElement adviserTeacheryazisi;

    @FindBy(xpath ="//*[@id='isAdvisorTeacher']")
    public WebElement adviserCheckBox;

    @FindBy(xpath ="(//input[@name='gender'])[1]")
    public WebElement femalekutusu;

    @FindBy(xpath ="(//input[@name='gender'])[2]")
    public WebElement maleKutusu;

    @FindBy(xpath ="//input[@id='birthDay']")
    public WebElement birthDateKutusu;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[6]")
    public WebElement birthDateRequired;

    @FindBy(xpath ="//input[@id='ssn']")
    public WebElement ssnKutusu;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[7]")
    public WebElement ssnRequired;

    @FindBy(xpath ="//input[@id='username']")
    public WebElement username3;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[8]")
    public WebElement userNameRequired;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password2;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[9]")
    public WebElement passwordRequired;

    @FindBy(xpath ="//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit2;



    }

