package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04 {public US_04() {
    PageFactory.initElements(Driver.getDriver(), this);
}




    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement studentmanagement;
    @FindBy(xpath = "//*[@id='advisorTeacherId']")
    public WebElement teacherselectddm;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "surname")
    public WebElement surname;
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "birthDay")
    public WebElement birthDay;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id = "username")
    public WebElement username;


}
