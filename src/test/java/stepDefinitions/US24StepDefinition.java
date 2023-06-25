package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US24.OgretmenOlusturma;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24StepDefinition {

    OgretmenOlusturma ogretmenOlusturma = new OgretmenOlusturma();


  @Given("Kullanici ilgili sayfaya tiklar ve  gider")
  public void kullaniciIlgiliSayfayaTiklarVeGider() {
   Driver.getDriver().get(ConfigReader.getProperty("url"));

 }
    @And("Kullanici ilgili sayfaya gider")
    public void kullaniciIlgiliSayfayaGider() {
    Assert.assertTrue(ogretmenOlusturma.login.isDisplayed());
    }

    @And("Kullanici {string} kutusuan AdminB{int} girer")
    public void kullaniciKutusuanAdminBGirer(String username1, int arg1) {

    }


    @And("Kullanici Password{int} kutusuna tiklar")
    public void kullaniciPasswordKutusunaTiklar(int password) {
        ogretmenOlusturma.password1.click();

    }

    @Then("Kullanici {string} olarak {int} bilgisini girer")
    public void kullaniciOlarakBilgisiniGirer(String c, int t) {

   ogretmenOlusturma.password1.sendKeys(c);
    }

    @And("Kullanici Menu kutusuna gider")
    public void kullaniciMenuKutusunaGider() {
        Assert.assertTrue(ogretmenOlusturma.menuButonu.isDisplayed());
    }

    @Then("Kullanici Menu kutusuna tiklar")
    public void kullaniciMenuKutusunaTiklar() {

   ogretmenOlusturma.menuButonu.click();
    }

    @And("Kullanici acilan sayfada Teacher Management kutusuna gelir")
    public void kullaniciAcilanSayfadaTeacherManagementKutusunaGelir() {

    }

    @Then("Kullanici Teacher Managemnet secenegini tiklar")
    public void kullaniciTeacherManagemnetSeceneginiTiklar() {

    }

    @And("Kullanici Choose Lessons kutusuna gelir")
    public void kullaniciChooseLessonsKutusunaGelir() {

    }

    @And("Kullanici Add Teacher sayfasini gorur")
    public void kullaniciAddTeacherSayfasiniGorur() {

    }

    @And("Kullanici ilgili kutucukta saga tiklar")
    public void kullaniciIlgiliKutucuktaSagaTiklar() {

    }

    @Then("Kullanici ders seceneklerini gorur")
    public void kullaniciDersSecenekleriniGorur() {

    }

    @And("Kullanici derslerden Java uzerine gelip tiklar")
    public void kullaniciDerslerdenJavaUzerineGelipTiklar() {

    }

    @Then("Kullanici Name kutusuna gelir")
    public void kullaniciNameKutusunaGelir() {

    }

    @And("Kullanici {string} bilgisini girer")
    public void kullaniciBilgisiniGirer(String arg0) {

    }

    @Then("Kullanici surname kutusuna gider")
    public void kullaniciSurnameKutusunaGider() {

    }

    @Then("Kullanici Birth Place kutusuna gider")
    public void kullaniciBirthPlaceKutusunaGider() {

    }

    @And("Kullanici emailkutusuna gelir")
    public void kullaniciEmailkutusunaGelir() {

    }

    @Then("Kulalnici {string} bilgisini girer")
    public void kulalniciBilgisiniGirer(String arg0) {

    }

    @And("Kullanici Phone kutusuna gelir")
    public void kullaniciPhoneKutusunaGelir() {

    }

    @And("Kullanici {string} yazisindaki kutucuga gider")
    public void kullaniciYazisindakiKutucugaGider(String arg0) {

    }

    @Then("Kullanici iilgili kutucuga tiklar")
    public void kullaniciIilgiliKutucugaTiklar() {

    }

    @And("Kullanci Gender sceneklerinin oldugu yere gelir")
    public void kullanciGenderSceneklerininOlduguYereGelir() {

    }

    @Then("Kullanici Female ve Male kutucuklarindan birine tiklar")
    public void kullaniciFemaleVeMaleKutucuklarindanBirineTiklar() {

    }

    @And("Kullanici Date of Birth kutucuguna gelir ve sag taraftaki takvim isaretine tiklar")
    public void kullaniciDateOfBirthKutucugunaGelirVeSagTaraftakiTakvimIsaretineTiklar() {

    }

    @And("Kullanici{string} secer")
    public void kullaniciSecer(String arg0) {

    }

    @And("Kullanici Ssn kutucuguna gider")
    public void kullaniciSsnKutucugunaGider() {


    }

    @And("Kullanici User Name kutucuguna gelir")
    public void kullaniciUserNameKutucugunaGelir() {

    }

    @Then("Kullanici {string} kutusuna bilgisi girer")
    public void kullaniciKutusunaBilgisiGirer(String arg0) {

    }

    @And("Kullanici Password kutucuguna gelir")
    public void kullaniciPasswordKutucugunaGelir() {

    }
    @And("Kullanici {string} girebilmeli")
    public void kullaniciGirebilmeli(String arg0) {
    }


    @And("Kullanici Submit kutucugun gelir")
    public void kullaniciSubmitKutucugunGelir() {

    }

    @And("Kullanici Submit{int} kutusuna tiklar")
    public void kullaniciSubmitKutusunaTiklar(int arg0) {


    }

    @And("Kullanici {string} onay yazisini gorur")
    public void kullaniciOnayYazisiniGorur(String arg0) {
    }



}




