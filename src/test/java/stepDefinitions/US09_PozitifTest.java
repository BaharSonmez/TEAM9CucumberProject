package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChooseLesson_Nihat;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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
       ReusableMethods.tumSayfaResmi("eklenenDersOnayi");


   }

    @And("Kullanici silme butonuna tiklar")
    public void kullaniciSilmeButonunaTiklar() {


    }

    @And("Kullanici onay mesajini gorur")
    public void kullaniciOnayMesajiniGorur() {
        
    }

    @And("Kullanici ders Lesson name,Compulsory, Credit Score alanlarinda  guncelleme yapar")
    public void kullaniciDersLessonNameCompulsoryCreditScoreAlanlarindaGuncellemeYapar() {
       ReusableMethods.tumSayfaResmi("Edit_butonu_yok");
    }
}
