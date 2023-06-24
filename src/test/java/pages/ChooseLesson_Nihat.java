package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLesson_Nihat {
    public ChooseLesson_Nihat(){
        PageFactory.initElements(Driver.getDriver(),this);}
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
    @FindBy(xpath = "/td") public WebElement eklenenDers;
    @FindBy(xpath = "(//span[text()='1'])[2]") public WebElement yesYazisi;
    @FindBy(xpath = "//span[text()='7']") public WebElement KrediNotu;




}
