package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ChooseLesson_Nihat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_PozitifTest {
    ChooseLesson_Nihat chooseLesson= new ChooseLesson_Nihat();

    @Given("Kullanici url sayfasina gider")
    public void kullaniciUrlSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici sitenin logosunu gorur")
    public void kullanici_yazisini_gorur() {
        chooseLesson = new ChooseLesson_Nihat();
        Assert.assertTrue(chooseLesson.logo.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici login olur")
    public void kullaniciLoginOlur() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.loginGiris.click();
    }

    @Then("Kullanici userName alanina username girer")
    public void kullanici_user_name_alanina_username_girer() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.username.sendKeys(ConfigReader.getProperty("usernameviceDean"));

    }

    @Then("kullanici password alanina password girer")
    public void kullanici_password_alanina_password_girer() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.password.sendKeys(ConfigReader.getProperty("passwordViceDean"));
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.loginButton.click();
        ReusableMethods.bekle(2);

    }

    @When("Lessons butonu gorunur olmalidir")
    public void lessons_butonu_gorunur_olmalidir() {
        chooseLesson = new ChooseLesson_Nihat();
        Assert.assertTrue(chooseLesson.LessonsButonu.isDisplayed());

    }

    @Then("Kullanici Lessons butonuna tiklar")
    public void kullanici_lessons_butonuna_tiklar() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.LessonsButonu.click();
        ReusableMethods.bekle(1);


    }

    @Then("Lesson Management yazisi gorunur olmalidir")
    public void lesson_management_yazisi_gorunur_olmalidir() {
        chooseLesson = new ChooseLesson_Nihat();
        Assert.assertTrue(chooseLesson.LessonManagementYazisi.isDisplayed());


    }

    @Then("Kullanici Lesson Name bolumune ders ismi girer")
    public void kullanici_lesson_name_bolumune_ders_ismi_girer() throws InterruptedException {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.lessonName.click();
        chooseLesson.lessonName.clear();
        Thread.sleep(2000);


      chooseLesson.lessonName.sendKeys(Faker.instance().name().username());
      ReusableMethods.bekle(2);


    }

    @Then("Kullanici Compulsory butonuna tiklar")
    public void kullanici_compulsory_butonuna_tiklar() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.compulsoryButonu.click();

    }

    @Then("Kullanici Credit Score bolumune kredi notu girer")
    public void kullanici_credit_score_bolumune_kredi_notu_girer() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.creditScore.sendKeys(ConfigReader.getProperty("creditNote"));
        ReusableMethods.bekle(2);

    }

    @Then("Kullanici Submit butonuna tiklamalidir")
    public void kullanici_submit_butonuna_tiklamalidir() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.submitLessons.click();


    }

    @Then("Kullanici Lesson Created mesajini gorur")
    public void kullanici_lesson_created_mesajini_gorur() {
        chooseLesson = new ChooseLesson_Nihat();
        ReusableMethods.bekle(1);
       Assert.assertTrue(chooseLesson.lessonCreatedAlert.isDisplayed());




    }


    @And("Kullanici siteden cikar")
    public void kullaniciSitedenCikar() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.menuCikis.click();
        ReusableMethods.bekle(1);
        chooseLesson.logaut.click();
        ReusableMethods.bekle(1);
        chooseLesson.cikisOnay.click();
    }
}


