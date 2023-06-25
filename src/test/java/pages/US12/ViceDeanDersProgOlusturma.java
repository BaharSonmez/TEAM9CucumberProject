package pages.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanDersProgOlusturma {

    public ViceDeanDersProgOlusturma(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement homePageLogin1;

    @FindBy(xpath ="//input[@id='username']")
    public WebElement username ;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password ;

    @FindBy(xpath ="(//button[@type='button'])[3]")
    public WebElement login;

    @FindBy(xpath ="//span[@class='text-white']")
    public WebElement b129Baslik;

    @FindBy(xpath ="(//button[@type='button'])[1]")
    public WebElement menuButonu;


    @FindBy(xpath = "(//*[@class='nav-link'])[9]")
    public WebElement lessonmanagement;

    @FindBy(xpath ="//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonsProgram;
    @FindBy(xpath ="//*[text()='Add Lesson Program']")
    public WebElement addLessonText;

   @FindBy(xpath ="//div[@class=' css-1wy0on6']")
    public WebElement chooseLesson;

    @FindBy(xpath ="(//*[text()='Selenium'])[2]")
    public WebElement seleniumSecim;


    @FindBy(xpath ="//select[@class='mt-5 form-select']")
    public WebElement educationTermDdm;
    @FindBy(xpath ="//select[@id='educationTermId']")
    public WebElement springSemester;

    @FindBy(xpath ="//select[@class='mb-3 form-select']")
    public WebElement choseDayDdm;

    @FindBy(xpath ="//select[@id='day']")
    public WebElement mondaySecimi;

    @FindBy(xpath ="//input[@id='startTime']")
    public  WebElement startTime;

    @FindBy(xpath ="//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath ="(//button[@type='button'])[30]")
    public WebElement submit;

    @FindBy(xpath ="(//h5[@class='fw-bold p-3 card-header'])[7]")
    public WebElement lessonPrgAssigmnet;
    @FindBy(xpath ="(//*[text()='Choose Lesson'])[2]")
    public WebElement chsLesson;
    @FindBy(xpath ="//input[@value='588']")
    public WebElement olusturlanDers;

    @FindBy(xpath ="//select[@id='teacherId']")
    public WebElement chooseTeacherDDM;
    @FindBy(xpath ="(//button[@class='fw-semibold btn btn-primary btn-lg'])[4]")
    public  WebElement submitSon;

}
