package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Login;

public class US25_AdminCreate extends Login {
    @FindBy(xpath = "//a[.='Student Management']")
    public WebElement studentmanagement;
}
