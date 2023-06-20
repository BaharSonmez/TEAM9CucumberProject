package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//a[@href='/login']")
        public WebElement loginButton;

        @FindBy(id = "username")
        public WebElement usernameButton;

        @FindBy(id = "password")
        public WebElement passwordButton;

        @FindBy(xpath = "//button[text()='Login']")
        public WebElement loginButtonGiris;

        @FindBy(xpath = "//button[text()='Menu']")
        public WebElement menuButton;

        @FindBy(xpath = "//a[text()='Grades and Announcements']")
        public WebElement gradesAnnouncements;

        @FindBy(xpath = "(//div[@class='container-fluid'])[1]")
        public WebElement examplesNote;

        @FindBy(xpath = "(//div[@class='container-fluid'])[2]")
        public WebElement meetList;

        @FindBy(xpath = "(//h5)[2]")
        public WebElement lessonProgramList;

        @FindBy(xpath = "//div[text()='Error: Course schedule cannot be selected for the same hour and day']")
        public WebElement uyarıMesajı;

        @FindBy(xpath = "//button[text()='Submit']")
        public WebElement submitButonu;

        @FindBy(xpath = "(//input[@id='lessonProgramId'])[63]")
        public WebElement aynıSaattekiDers;//

        @FindBy(xpath = "(//div[@class='container-fluid'])[2]")
        public WebElement teacherTimeBilgileri;

        @FindBy(xpath="(//input[@id='lessonProgramId'])[1]")
        public WebElement secilenDers;//cypress

        @FindBy(id = "name")
        public WebElement nameKutucugu;

        @FindBy(id = "surname")
        public WebElement surnameKutucugu;

        @FindBy(id = "birthPlace")
        public WebElement birtPlaceKutucugu;

        @FindBy(xpath = "(//input[@name='gender'])[2]")
        public WebElement genderKutusu;

        @FindBy(id = "phoneNumber")
        public WebElement phoneKutusu;

        @FindBy(id = "ssn")
        public WebElement ssnKutusu;

        @FindBy(id = "birthDay")
        public WebElement birthDayKutusu;

        @FindBy(xpath = "(//div[@class='table-responsive'])[2]")
        public WebElement list;










    }

