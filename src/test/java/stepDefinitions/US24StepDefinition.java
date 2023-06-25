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
    ogretmenOlusturma.username.sendKeys(username1);

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
    Assert.assertTrue(ogretmenOlusturma.addTeacheryazisi.isDisplayed());
    }

    @Then("Kullanici Teacher Managemnet secenegini tiklar")
    public void kullaniciTeacherManagemnetSeceneginiTiklar() {
   ogretmenOlusturma.teacherMngBotonu.click();


    }

    @And("Kullanici Choose Lessons kutusuna gelir")
    public void kullaniciChooseLessonsKutusunaGelir() {
   Assert.assertTrue(ogretmenOlusturma.chooseLlessonKutusu.isDisplayed());

    }

    @And("Kullanici Add Teacher sayfasini gorur")
    public void kullaniciAddTeacherSayfasiniGorur() {
   Assert.assertTrue(ogretmenOlusturma.addTeacheryazisi.isDisplayed());
    }

    @And("Kullanici ilgili kutucukta saga tiklar")
    public void kullaniciIlgiliKutucuktaSagaTiklar() {
   ReusableMethods.click(ogretmenOlusturma.chooseLlessonKutusu);
    }

    @Then("Kullanici ders seceneklerini gorur")
    public void kullaniciDersSecenekleriniGorur() {
    ReusableMethods.tumSayfaResmi("Java Dersi goruntusu");
    }

    @And("Kullanici derslerden Java uzerine gelip tiklar")
    public void kullaniciDerslerdenJavaUzerineGelipTiklar() {
    ReusableMethods.click(ogretmenOlusturma.javaDersSecimi);
    }

    @Then("Kullanici Name kutusuna gelir")
    public void kullaniciNameKutusunaGelir() {
    Assert.assertTrue(ogretmenOlusturma.nameKutusu.isDisplayed());
    }

    @And("Kullanici {string} bilgisini girer")
    public void kullaniciBilgisiniGirer(String name) {
     ogretmenOlusturma.nameKutusu.sendKeys(name);
    }

    @Then("Kullanici surname kutusuna gider")
    public void kullaniciSurnameKutusunaGider() {
    Assert.assertTrue(ogretmenOlusturma.surnameKutusu.isDisplayed());
    }
   @And("Kullanici {string} bilgisini kutuya  girer")
   public void kullaniciBilgisiniKutuyaGirer(String surname) {
   ogretmenOlusturma.surnameKutusu.sendKeys(surname);
   }

    @Then("Kullanici Birth Place kutusuna gider")
    public void kullaniciBirthPlaceKutusunaGider() {
   Assert.assertTrue(ogretmenOlusturma.birthPlaceKutusu.isDisplayed());
    }
   @And("Kullanici {string} bilgisini girebilmeli")
   public void kullaniciBilgisiniGirebilmeli(String birthPlace) {
   ogretmenOlusturma.birthPlaceKutusu.sendKeys(birthPlace);

    }

    @And("Kullanici emailkutusuna gelir")
    public void kullaniciEmailkutusunaGelir() {
    Assert.assertTrue(ogretmenOlusturma.emailKutusu.isDisplayed());

    }

    @Then("Kulalnici {string} bilgisini girer")
    public void kulalniciBilgisiniGirer(String email) {
   ogretmenOlusturma.emailKutusu.sendKeys(email);

    }

    @And("Kullanici Phone kutusuna gelir")
    public void kullaniciPhoneKutusunaGelir() {
   Assert.assertTrue(ogretmenOlusturma.phonenumberKutusu.isDisplayed());

    }
   @Then("Kullanici {string}  numarasini bilgisini girer")
   public void kullaniciNumarasiniBilgisiniGirer(String phonenumber) {
   ogretmenOlusturma.phonenumberKutusu.sendKeys(phonenumber);
   }

    @And("Kullanici {string} yazisindaki kutucuga gider")
    public void kullaniciYazisindakiKutucugaGider(String IsadviserTeacher) {
    Assert.assertTrue(ogretmenOlusturma.adviserTeacherYazisi.isDisplayed());
    }

    @Then("Kullanici iilgili kutucuga tiklar")
    public void kullaniciIilgiliKutucugaTiklar() {
   ogretmenOlusturma.adviserTeacherKutusu.click();
    }

    @And("Kullanci Gender sceneklerinin oldugu yere gelir")
    public void kullanciGenderSceneklerininOlduguYereGelir() {
    Assert.assertTrue(ogretmenOlusturma.genderYazisi.isDisplayed());
    }

    @Then("Kullanici Female ve Male kutucuklarindan birine tiklar")
    public void kullaniciFemaleVeMaleKutucuklarindanBirineTiklar() {
    ogretmenOlusturma.maleKutusu.click();
    }

    @And("Kullanici Date of Birth kutucuguna gelir ve sag taraftaki takvim isaretine tiklar")
    public void kullaniciDateOfBirthKutucugunaGelirVeSagTaraftakiTakvimIsaretineTiklar() {
      ogretmenOlusturma.birthPlaceKutusu.click();
    }

    @And("Kullanici{string} secer")
    public void kullaniciSecer(String DateOfBirth) {
     ogretmenOlusturma.birthPlaceKutusu.sendKeys(DateOfBirth);
    }

    @And("Kullanici Ssn kutucuguna gider")
    public void kullaniciSsnKutucugunaGider() {
    Assert.assertTrue(ogretmenOlusturma.ssnKutusu.isDisplayed());

    }

   @Then("Kullanici {string} bilgisini  rakam olarak girer")
    public void kullaniciBilgisiniRakamOlarakGirer(String ssn) {
   ogretmenOlusturma.ssnKutusu.sendKeys(ssn);
    }
    @And("Kullanici User Name kutucuguna gelir")
    public void kullaniciUserNameKutucugunaGelir() {
  Assert.assertTrue(ogretmenOlusturma.usernmaKutusu.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna bilgisi girer")
    public void kullaniciKutusunaBilgisiGirer(String username) {
    ogretmenOlusturma.usernmaKutusu.sendKeys(username);
    }

    @And("Kullanici Password kutucuguna gelir")
    public void kullaniciPasswordKutucugunaGelir() {
    Assert.assertTrue(ogretmenOlusturma.paaswordKutusu.isDisplayed());
    }
    @And("Kullanici {string} girebilmeli")
    public void kullaniciGirebilmeli(String password) {
    ogretmenOlusturma.paaswordKutusu.sendKeys(password);
    }


    @And("Kullanici Submit kutucugun gelir")
    public void kullaniciSubmitKutucugunGelir() {
    Assert.assertTrue(ogretmenOlusturma.submitButonu.isDisplayed());
    }

    @And("Kullanici Submit{int} kutusuna tiklar")
    public void kullaniciSubmitKutusunaTiklar(int arg0) {
    ogretmenOlusturma.submitButonu.click();

    }

    @And("Kullanici {string} onay yazisini gorur")
    public void kullaniciOnayYazisiniGorur(String arg0) {
    ReusableMethods.tumSayfaResmi("Teacher saved Successfully");
    }



}




