package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ChooseLesson;
import utilities.ConfigReader;
import utilities.Driver;

public class US08_PozitifTest {
    ChooseLesson chooseLesson;

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String siteUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(siteUrl));
    }

    @When("Kullanici sitenin logosunu gorur")
    public void kullanici_yazisini_gorur() {
        chooseLesson = new ChooseLesson();
        Assert.assertTrue(chooseLesson.logo.isDisplayed());
    }

    @Then("Kullanici login olur")
    public void kullaniciLoginOlur() {
        chooseLesson = new ChooseLesson();
        chooseLesson.loginGiris.click();
    }

    @Then("Kullanici userName alanina username girer")
    public void kullanici_user_name_alanina_username_girer() {
        chooseLesson = new ChooseLesson();
        chooseLesson.username.sendKeys(ConfigReader.getProperty("usernameviceDean"));

    }

    @Then("kullanici password alanina password girer")
    public void kullanici_password_alanina_password_girer() {
        chooseLesson = new ChooseLesson();
        chooseLesson.password.sendKeys(ConfigReader.getProperty("passwordViceDean"));
    }

    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        chooseLesson = new ChooseLesson();
        chooseLesson.loginButton.click();

    }

    @When("Lessons butonu gorunur olmalidir")
    public void lessons_butonu_gorunur_olmalidir() {
        chooseLesson = new ChooseLesson();
        Assert.assertTrue(chooseLesson.LessonsButonu.isDisplayed());

    }

    @Then("Kullanici Lessons butonuna tiklar")
    public void kullanici_lessons_butonuna_tiklar() {
        chooseLesson = new ChooseLesson();
        chooseLesson.LessonsButonu.click();


    }

    @Then("Lesson Management yazisi gorunur olmalidir")
    public void lesson_management_yazisi_gorunur_olmalidir() {
        chooseLesson = new ChooseLesson();
        assert chooseLesson.LessonManagementYazisi.isDisplayed();


    }

    @Then("Kullanici Lesson Name bolumune ders ismi girer")
    public void kullanici_lesson_name_bolumune_ders_ismi_girer() throws InterruptedException {
        chooseLesson = new ChooseLesson();
        chooseLesson.lessonName.click();
        chooseLesson.lessonName.clear();
        Thread.sleep(3000);
        chooseLesson.lessonName.sendKeys(ConfigReader.getProperty("lessonName"));

    }

    @Then("Kullanici Compulsory butonuna tiklar")
    public void kullanici_compulsory_butonuna_tiklar() {
        chooseLesson = new ChooseLesson();
        chooseLesson.compulsoryButonu.click();

    }

    @Then("Kullanici Credit Score bolumune kredi notu girer")
    public void kullanici_credit_score_bolumune_kredi_notu_girer() {
        chooseLesson = new ChooseLesson();
        chooseLesson.creditScore.sendKeys(ConfigReader.getProperty("creditNote"));

    }

    @Then("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        chooseLesson = new ChooseLesson();
        chooseLesson.submitLessons.click();


    }

    @Then("Kullanici Lesson Created mesajini gorur")
    public void kullanici_lesson_created_mesajini_gorur() {
        chooseLesson = new ChooseLesson();
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals("Lesson Created", alertYazisi);


    }

}


