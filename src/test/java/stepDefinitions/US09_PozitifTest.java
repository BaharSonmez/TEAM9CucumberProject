package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChooseLesson_Nihat;
import utilities.Driver;
import utilities.ReusableMethods;

public class US09_PozitifTest {
    ChooseLesson_Nihat chooseLesson;

    @Then("Kullanici ekledigi dersleri gorene kadar sayfayi asagi ceker")
    public void kullanici_ekledigi_dersleri_gorene_kadar_sayfayi_asagi_ceker() throws InterruptedException {
        chooseLesson = new ChooseLesson_Nihat();
        Thread.sleep(3000);
        ReusableMethods.scroll(chooseLesson.baslik);
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        chooseLesson.sonsayfaButonu.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();



    }
    @Then("Kullanici Lesson name alaninda eklenen dersi gorur")
    public void kullanici_lesson_name_alaninda_eklenen_dersi_gorur() {
        chooseLesson = new ChooseLesson_Nihat();
        assert chooseLesson.eklenenDers.isDisplayed();


    }


    @Then("Kullanici Compulsory alaninda Yes yazisini gorur")
    public void kullanici_compulsory_alaninda_yes_yazisini_gorur() {
        chooseLesson = new ChooseLesson_Nihat();
        assert chooseLesson.yesYazisi.isDisplayed();


    }

    @Then("Kullanici Credit Score alaninda kredi notunu gorur")
    public void kullanici_credit_score_alaninda_kredi_notunu_gorur() {
        chooseLesson = new ChooseLesson_Nihat();
        assert chooseLesson.KrediNotu.isDisplayed();


    }


}
