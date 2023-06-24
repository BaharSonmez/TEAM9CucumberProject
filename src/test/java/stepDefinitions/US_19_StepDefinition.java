package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.Login;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_19_StepDefinition {
    TeacherPage teacherPage=new TeacherPage();


    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);


    }
    @Then("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        ReusableMethods.click(teacherPage.login1);
        ReusableMethods.bekle(2);

    }
    @Then("User Name girer")
    public void user_name_girer() {
        teacherPage.usernameButton.sendKeys(ConfigReader.getProperty("usernameteacher"));

    }
    @Then("Password u girer")
    public void password_u_girer() {
        teacherPage.passwordButton.sendKeys(ConfigReader.getProperty("passwordteacher"));

    }
    @Then("Tekrar Login butonuna tiklar")
    public void tekrar_login_butonuna_tiklar() {
        teacherPage.login2.click();

    }
    @Then("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        teacherPage.menuButton.click();

    }
    @Then("Meet Management i secer")
    public void meet_management_i_secer() {
        teacherPage.meetManagementButton.click();

    }
    @Then("Add Meet den Choose Students i tiklar ve cikan listeden  ogrenci secer")
    public void add_meet_den_choose_students_i_tiklar_ve_cikan_listeden_ogrenci_secer() {
        teacherPage.ChooseStudents.click();
        ReusableMethods.click(teacherPage.ogrIsimSec);
        Select select=new Select(teacherPage.ogrIsimSec);
        select.selectByIndex(1);

    }
    @Given("Date Of Meet e tiklar ve ileriki bir tarihi girer")
    public void date_of_meet_e_tiklar_ve_ileriki_bir_tarihi_girer() {
        ReusableMethods.click(teacherPage.ileriranevutar);
        teacherPage.ileriranevutar.sendKeys(ConfigReader.getProperty("ileriranevutar"));

    }
    @Given("Date Of Meet e tiklar ve gecmis bir tarihi girer")
    public void date_of_meet_e_tiklar_ve_gecmis_bir_tarihi_girer() {
        ReusableMethods.click(teacherPage.ileriranevutar);
        teacherPage.ileriranevutar.sendKeys(ConfigReader.getProperty("gecrandevutar"));

        //burda bug u nasil gosterecegiz????????


    }
    @Given("Start Time tiklar ve saat girer")
    public void start_time_tiklar_ve_saat_girer() {
        ReusableMethods.click(teacherPage.starttime);
        teacherPage.starttime.sendKeys(ConfigReader.getProperty("starttime"));

    }
    @Given("Stop Time tiklar ve saat girer")
    public void stop_time_tiklar_ve_saat_girer() {
        ReusableMethods.click(teacherPage.stoptime);
        teacherPage.starttime.sendKeys(ConfigReader.getProperty("stoptime"));

    }
    @Given("Description a tiklar ve bir description yazar")
    public void description_a_tiklar_ve_bir_description_yazar() {
        ReusableMethods.click(teacherPage.description);
        teacherPage.description.sendKeys(ConfigReader.getProperty("description"));

    }
    @Given("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        ReusableMethods.click(teacherPage.submitteacher);

    }
}



