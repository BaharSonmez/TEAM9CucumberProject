package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.US09_PozitifTest;
import utilities.Driver;

public class ChooseLesson_Nihat {
    public ChooseLesson_Nihat(){
        PageFactory.initElements(Driver.getDriver(),this);}

    US09_PozitifTest us09PozitifTest = new US09_PozitifTest();
    @FindBy(xpath = "//img[@class='img-fluid']") public WebElement logo;
    @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement loginGiris;
    @FindBy(xpath = "//input[@placeholder='username']") public  WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']") public WebElement password;
    @FindBy(xpath = "//button[text()='Login']") public WebElement loginButton;

    @FindBy(xpath = "//button[text()='Lessons']") public WebElement LessonsButonu;
    @FindBy(xpath = "//h3[text()='Lesson Management']") public WebElement LessonManagementYazisi;
    @FindBy(xpath = "//input[@placeholder='Lesson Name']") public WebElement lessonName;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement compulsoryButonu;
    @FindBy(xpath = "//input[@placeholder='Credit Score']") public WebElement creditScore;
    @FindBy(xpath = "(//button[text()='Submit'])[2]") public WebElement submitLessons;
    @FindBy(xpath = "(//li[@class='page-item'])[8]") public WebElement sonsayfaButonu;
    @FindBy(xpath = "//h4[text()='Twitter Widget']") public WebElement baslik;
    @FindBy(xpath = "//button[text()='Lesson Program']") public WebElement lessonProgramButonu;
    @FindBy(xpath = "//h3[text()='Lesson Program Management']") public WebElement lessonProgManagementyazisi;
    @FindBy(xpath = "//div[@class=' css-19bb58m']") public  WebElement chooseLessonsAlani;
    @FindBy(xpath = "//select[@class='mt-5 form-select']") public WebElement selectEducationTerm;
    @FindBy(xpath = "//select[@class='mb-3 form-select']") public WebElement selectday;
    @FindBy(xpath = "(//input[@class='form-control is-invalid'])[1]") public WebElement startTime;
    @FindBy(id = "stopTime") public WebElement stopTime;
    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]") public WebElement lessonProgramSubmit;
    @FindBy(xpath = "//*[text()='Lesson Created']") public WebElement lessonCreatedAlert;
    @FindBy(css = "table-group-divider td") public WebElement tablodakiDatalar;
    @FindBy(xpath = "//*[text()='Lesson Deleted']") public WebElement lessonDeletedAlert;
    @FindBy(id ="react-select-2-input" )  public WebElement chooseLessonsInLessonProgramasViceDean;
    @FindBy(xpath = "//button[text()='Menu']") public WebElement menuCikis;
    @FindBy(xpath = "(//a[@class='nav-link'])[10]") public WebElement logaut;
    @FindBy(xpath = "//button[text()='Yes']") public WebElement cikisOnay;
    @FindBy(xpath = "//div[text()='Created Lesson Program']") public WebElement lessonCreatedProgramAlert;


}
