package pages.US16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class ViceDeanContact {
    public ViceDeanContact(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Contact Get All']")
    public WebElement contactGetAll;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']/tr/td)[1]")
    public WebElement contactName;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']/tr/td)[2]")
    public WebElement contactEmail;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']/tr/td)[2]")
    public WebElement contactDate;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']/tr/td)[2]")
    public WebElement contactSubject;
    @FindBy(xpath = "(//tbody[@class='table-group-divider']/tr/td)[2]")
    public WebElement contactMessage;





}