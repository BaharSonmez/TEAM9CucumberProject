package pages.US25;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.US15.Login;

public class US25_AdminCreate extends Login {
    @FindBy(xpath = "//a[.='Student Management']")
    public WebElement studentmanagement;
}
