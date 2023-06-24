package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(className = "header_link ms-2")
    public WebElement login1;

    @FindBy(className = "fw-semibold btn btn-primary")
    public WebElement login2;

    @FindBy(id = "username")
    public WebElement usernameButton;

    @FindBy(id = "password")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement meetManagementButton;

    @FindBy(className = " css-19bb58m")
    public WebElement ChooseStudents;

    @FindBy(className = " css-9jq23d")
    public WebElement ogrIsimSec;

    @FindBy (xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement ileriranevutar;

    @FindBy(xpath = "(//*[@id='startTime'])[1]")
    public WebElement starttime;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stoptime;

    @FindBy(xpath = "(//*[@id='description'])[1]")
    public WebElement description;

    @FindBy (className = "fw-semibold btn btn-primary btn-lg")
    public WebElement submitteacher;

    @FindBy(xpath = "//span[text()='2023-07-20']")
    public WebElement mevcutdate;

    @FindBy(xpath = "//span[text()='14:00:00']")
    public WebElement mevcutstart;

    @FindBy(xpath = "//span[text()='15:00:00']")
    public WebElement mevcutstop;

    @FindBy(xpath = "//span[text()='ok']")
    public WebElement mevcutdesc;

    @FindBy(className ="text-dark btn btn-outline-info" )
    public WebElement edit;

    @FindBy(xpath = "(//*[@class=' css-19bb58m])[2]")
    public WebElement editChooseSt;

    @FindBy(xpath = "(//*[@class=' form-control])[5]")
    public WebElement editdate;

    @FindBy(xpath = "(//*[@class=' form-control])[6]")
    public WebElement editstart;

    @FindBy(xpath = "(//*[@class=' form-control])[7]")
    public WebElement editstop;

    @FindBy(xpath = "(//*[@class=' form-control])[8]")
    public WebElement editdesc;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg])[2]")
    public WebElement editsubmit;







}
