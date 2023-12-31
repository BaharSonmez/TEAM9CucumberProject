package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ChooseLesson_Nihat;
import utilities.ConfigReader;
import utilities.Driver;

public class US08_NegatifTest {
    ChooseLesson_Nihat chooseLesson;
    @Then("Ayni ders tekrar secilememeli")
    public void ayni_ders_tekrar_secilememeli() throws InterruptedException {
       chooseLesson = new ChooseLesson_Nihat();
       chooseLesson.lessonName.sendKeys(ConfigReader.getProperty("lessonName"));
       Thread.sleep(3000);

    }

    @Then("Kullanici Credit Score bolumune negatif kredi notu girememeli")
    public void kullanici_credit_score_bolumune_negatif_kredi_notu_girememeli() {
        chooseLesson = new ChooseLesson_Nihat();
        chooseLesson.creditScore.sendKeys("negatifKrediNotu");


    }

    @And("Ayni ders tekrar girildi hata mesaji alinmali")
    public void ayniDersTekrarGirildiHataMesajiAlinmali() {
        chooseLesson = new ChooseLesson_Nihat();
        String alertDersTekrari= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(ConfigReader.getProperty("expectedDataAyniDers"),alertDersTekrari);
    }
}
