package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US12.ViceDeanDersProgOlusturma;
import pages.US13.ViceDeanOgretmenOlusturma;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US13StepDefinition1 {


    ViceDeanOgretmenOlusturma viceDeanOgretmenOlusturma = new ViceDeanOgretmenOlusturma();

    @When("Kullanici acilan sayfada login butonuna tiklar")
    public void kullanici_acilan_sayfada_login_butonuna_tiklar() {
        Driver.getDriver().get(ConfigReader.getProperty("url1"));
       ReusableMethods.click(viceDeanOgretmenOlusturma.homePageLogin1);



    }

    @When("Kullanici username kismina AdminB129 bilgisini girer")
    public void kullanici_username_kismina_admin_b129_bilgisini_girer() {
        viceDeanOgretmenOlusturma.username.click();
        viceDeanOgretmenOlusturma.username.sendKeys(ConfigReader.getProperty("username1"), Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @When("Kullanici Ppassword okutusuna {int} bilgisini girer")
    public void kullanici_ppassword_okutusuna_bilgisini_girer(Integer int1) {
        viceDeanOgretmenOlusturma.password.click();
        viceDeanOgretmenOlusturma.password.sendKeys(ConfigReader.getProperty("password1"),Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @When("Kullanici Teacher Management secenegini gorebilmeli")
    public void kullanici_teacher_management_secenegini_gorebilmeli() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.teacherManagement.isDisplayed());


    }

    @When("Kullannici  Teacher Management kismi tiklanabilir olmali")
    public void kullannici_teacher_management_kismi_tiklanabilir_olmali() {

       viceDeanOgretmenOlusturma.teacherManagement.isSelected();

    }

    @When("Acilan sayfada AddTeacher ve Choose Lessons kutusu gorunur olmali")
    public void acilan_sayfada_add_teacher_ve_choose_lessons_kutusu_gorunur_olmali() {
       viceDeanOgretmenOlusturma.teacherManagement.click();

    }

    @Then("Kullanici Choose Lesson kutusuna tiklar")
    public void kullaniciChooseLessonKutusunaTiklar() {
        ReusableMethods.click(viceDeanOgretmenOlusturma.ChoseLes1);
    }

    @Then("Admin olarak kullanici acilan kutudaki derslerden birisini secip uzerine tiklar")
    public void admin_olarak_kullanici_acilan_kutudaki_derslerden_birisini_secip_uzerine_tiklar() {
        ReusableMethods.click(viceDeanOgretmenOlusturma.javaDersSecimi);

    }

    @When("Kullanici Name kutuusna gider")
    public void kullanici_name_kutuusna_gider() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.nameKutusu.isDisplayed());


    }

    @Then("Kullanici Name kutusunu bos birakir")
    public void kullanici_name_kutusunu_bos_birakir() {
        viceDeanOgretmenOlusturma.surnameKutusu.click();
    }

    @Then("Kullanci Name kutusuna bilgi girmediginde {string} uyarisi alir")
    public void kullanci_name_kutusuna_bilgi_girmediginde_uyarisi_alir(String Required) {

        Assert.assertTrue(viceDeanOgretmenOlusturma.nameRequired.isDisplayed());

    }

    @Then("Kullanici Name kutusuna tiklar")
    public void kullanici_name_kutusuna_tiklar() {
        viceDeanOgretmenOlusturma.nameKutusu.click();

    }

    @Then("Kullanici Name kutusuna Isim bilgisi girer")
    public void kullanici_name_kutusuna_isim_bilgisi_girer() {
        viceDeanOgretmenOlusturma.nameKutusu.sendKeys(ConfigReader.getProperty("ogretmencreatename"), Keys.ENTER);
    }

    @When("Kullanici Surname kutusuna gider")
    public void kullanici_surname_kutusuna_gider() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.surnameKutusu.isDisplayed());

    }

    @When("Kullanici surnmae kutusuna tiklar")
    public void kullanici_surnmae_kutusuna_tiklar() {
        viceDeanOgretmenOlusturma.surnameKutusu.click();

    }

    @Then("Kullanici Surname kutusuna bilgi girisi yapmaz ve bos birakir")
    public void kullanici_surname_kutusuna_bilgi_girisi_yapmaz_ve_bos_birakir() {
        viceDeanOgretmenOlusturma.birthplace.click();

    }

    @Then("Kullanici Surname kutusuna bilgi girmadiginde {string} uyarsini alir")
    public void kullanici_surname_kutusuna_bilgi_girmadiginde_uyarsini_alir(String Required) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.surnameRequired.isDisplayed());

    }

    @Then("Kullanici Surname kutusuna tiklar")
    public void kullanici_surname_kutusuna_tiklar() {
        viceDeanOgretmenOlusturma.surnameKutusu.click();

    }

    @Then("Kullanici Surname kutusuna soyisim bilgisini girer")
    public void kullanici_surname_kutusuna_soyisim_bilgisini_girer() {
        viceDeanOgretmenOlusturma.surnameKutusu.sendKeys(ConfigReader.getProperty("ogretmencreatesurname"), Keys.ENTER);

    }

    @Given("Kullanici Birth Place kutusuna tiklar")
    public void kullanici_birth_place_kutusuna_tiklar() {
        viceDeanOgretmenOlusturma.birthplace.click();

    }

    @Given("Kullanici Birth Place kutusunu bos birakir ve bilgi girisi yapmaz")
    public void kullanici_birth_place_kutusunu_bos_birakir_ve_bilgi_girisi_yapmaz() {
        viceDeanOgretmenOlusturma.email.click();

    }

    @Given("Kullanici {string} uyarisini alir")
    public void kullanici_uyarisini_alir(String Required) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.birthplaceRequired.isDisplayed());

    }

    @Then("Kullanici Birth Place kutusuna gider  tiklar")
    public void kullaniciBirthPlaceKutusunaGiderTiklar() {
        viceDeanOgretmenOlusturma.birthplace.click();
    }

    @Then("Kullanici Birth place bilgisi girer")
    public void kullanici_birth_place_bilgisi_girer() {

        viceDeanOgretmenOlusturma.birthplace.sendKeys(ConfigReader.getProperty("birthplace"), Keys.ENTER);
    }

    @Then("Kullanici Email kutusuna tiklar")
    public void kullanici_email_kutusuna_tiklar() {
        viceDeanOgretmenOlusturma.email.click();
    }

    @Then("Kullanici Email kutusunu bos birakir")
    public void kullanici_email_kutusunu_bos_birakir() {
        viceDeanOgretmenOlusturma.phoneNumber.click();

    }

    @Then("Kullanici {string} uyarisi alir")
    public void kullanici_uyarisi_alir(String Required) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.emailRequired.isDisplayed());

    }

    @Then("Kullanici Email bilgisi girer")
    public void kullanici_email_bilgisi_girer() {
        viceDeanOgretmenOlusturma.email.sendKeys(ConfigReader.getProperty("email"), Keys.ENTER);

    }


    @When("Kullanici  Phone kutuusna gider")
    public void kullaniciPhoneKutuusnaGider() {
        viceDeanOgretmenOlusturma.phoneNumber.click();

    }

    @And("Kullanici Phone kutusuna bilgi girmez ve bos birakir")
    public void kullaniciPhoneKutusunaBilgiGirmezVeBosBirakir() {
        viceDeanOgretmenOlusturma.adviserCheckBox.click();
    }
    @And("Kullanici phone kutuusna rakam disinda {string} girer")
    public void kullaniciPhoneKutuusnaRakamDisindaGirer(String arg0) {
        viceDeanOgretmenOlusturma.phoneNumber.sendKeys(ConfigReader.getProperty("telno1"), Keys.ENTER);
    }
    @Then("Kullanici rakam disinda {string}girdiginde uyari alir")
    public void kullaniciRakamDisindaGirdigindeUyariAlir(String arg0) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.phoneNumberRequired.isDisplayed());
    }



    @And("Kullanici {string} rakam degeri girer her {int} rakamda aralirina - isareti koymaz")
    public void kullaniciRakamDegeriGirerHerRakamdaAralirinaIsaretiKoymaz(String arg0, int arg1) {
        viceDeanOgretmenOlusturma.phoneNumber.sendKeys(ConfigReader.getProperty("telno2"), Keys.ENTER);

    }


    @Then("Kullanicinin girdigi deger kabul edilmez")
    public void kullanicininGirdigiDegerKabulEdilmez() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.phoneNumberRequired.isDisplayed());
    }

    @And("Kullanci {string}phone bilgisini girer ve{int} rakamdan sonra araya {string} karakterini koyar")
    public void kullanciPhoneBilgisiniGirerVeRakamdanSonraArayaKarakteriniKoyar(String arg0, int arg1, String arg2) {
        viceDeanOgretmenOlusturma.phoneNumber.sendKeys(ConfigReader.getProperty("telno3"), Keys.ENTER);
    }


    @And("Kullanicinin girdigi tel bilgisi onaylanir")
    public void kullanicininGirdigiTelBilgisiOnaylanir() {
        Assert.assertFalse(viceDeanOgretmenOlusturma.phoneNumberRequired.isDisplayed());
    }


    @And("Kullanici {string} kutucuguna gider")
    public void kullaniciKutucugunaGider(String arg0) {
       Assert.assertTrue(viceDeanOgretmenOlusturma.adviserCheckBox.isDisplayed());
    }

    @Then("Kullanici kutucuga tiklar")
    public void kullaniciKutucugaTiklar() {
        viceDeanOgretmenOlusturma.adviserCheckBox.click();
    }


    @When("Kullanici Gender alanina gider")
    public void kullaniciGenderAlaninaGider() {
      Assert.assertTrue(viceDeanOgretmenOlusturma.genderYazisi.isDisplayed());
    }

    @And("Kullanci Female ve male seceneklerini gorur")
    public void kullanciFemaleVeMaleSecenekleriniGorur() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.femalekutusu.isDisplayed());
        Assert.assertTrue(viceDeanOgretmenOlusturma.maleKutusu.isDisplayed());
    }

    @And("Kullanci Female kutucugunu tiklar")
    public void kullanciFemaleKutucugunuTiklar() {
        viceDeanOgretmenOlusturma.femalekutusu.click();
    }


    @When("Kullanici {string} kutucuguna gide")
    public void kullaniciKutucugunaGide(String Dateofbirth) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.birthDateKutusu.isDisplayed());
    }

    @And("Kullanici {string} kutucugunu bos birakir")
    public void kullaniciKutucugunuBosBirakir(String DateOfBirth) {
        viceDeanOgretmenOlusturma.ssnKutusu.click();
    }

    @Then("Kullanici {string} uyarisni alir")
    public void kullaniciUyarisniAlir(String Required) {
        Assert.assertTrue(viceDeanOgretmenOlusturma.birthDateRequired.isDisplayed());
    }

    @And("Kullanici {string} kutucuguna tekrar tiklar")
    public void kullaniciKutucugunaTekrarTiklar(String DateOfBirth) {
        viceDeanOgretmenOlusturma.birthDateKutusu.click();

    }

    @And("Kullanici {string} bilgisi  girer")
    public void kullaniciBilgisiGirer(String DateOfBirth) {
        viceDeanOgretmenOlusturma.birthDateKutusu.sendKeys(ConfigReader.getProperty("birthDate"),Keys.ENTER);
    }


    @And("Kullanici SSN kutusuna gider")
    public void kullaniciSSNKutusunaGider() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.ssnKutusu.isDisplayed());
    }

    @Then("Kullanci SSN kutusunu bos birakir")
    public void kullanciSSNKutusunuBosBirakir() {
        viceDeanOgretmenOlusturma.username3.click();
    }

    @And("Kullanici Required uyarisini alri")
    public void kullaniciRequiredUyarisiniAlri() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.ssnRequired.isDisplayed());
    }

    @And("Kullanici {string} olarak {int}.ve {int}. rakamlardan sonra {string} iceren bilgi girer")
    public void kullaniciOlarakVeRakamlardanSonraIcerenBilgiGirer(String SSNBilgisi, int arg1, int arg2, String arg3) {
        viceDeanOgretmenOlusturma.ssnKutusu.sendKeys(SSNBilgisi,Keys.ENTER);
    }

    @When("Kullanici Minimum {int} character uyarisini almaz")
    public void kullaniciMinimumCharacterUyarisiniAlmaz(int arg0) {
        Assert.assertFalse(viceDeanOgretmenOlusturma.ssnRequired.isDisplayed());
    }

    @And("Kullanici{string} {int}. ve {int}. rakamlardan sonra {string} icermeyen deger girer")
    public void kullaniciVeRakamlardanSonraIcermeyenDegerGirer(String SSNBilgisi , int arg1, int arg2, String arg3) {
        viceDeanOgretmenOlusturma.ssnKutusu.sendKeys(SSNBilgisi,Keys.ENTER);
    }

    @And("Kullanicinin girdigi sayi ve karakter bilgisi sistem tarafindan onaylanmaz ve uyari mesajini gorur")
    public void kullanicininGirdigiSayiVeKarakterBilgisiSistemTarafindanOnaylanmazVeUyariMesajiniGorur() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.ssnRequired.isDisplayed());
    }


    @And("Kullanici UserName kutusuna tiklar")
    public void kullaniciUserNameKutusunaTiklar() {
        viceDeanOgretmenOlusturma.username3.click();
    }

    @Then("Kullanici Username kismini bos birakir")
    public void kullaniciUsernameKisminiBosBirakir() {
       viceDeanOgretmenOlusturma.password2.click();
    }

    @Then("Kullanici Usernmae kutusuna tekrar tiklar")
    public void kullaniciUsernmaeKutusunaTekrarTiklar() {
        viceDeanOgretmenOlusturma.username3.click();

    }

    @And("Kullanici bir Usernmae bilgisi girer")
    public void kullaniciBirUsernmaeBilgisiGirer() {
        viceDeanOgretmenOlusturma.username3.sendKeys(ConfigReader.getProperty("usernmae3"));
    }


    @And("Kullanici Password kutusuna gider")
    public void kullaniciPasswordKutusunaGider() {
       Assert.assertTrue(viceDeanOgretmenOlusturma.password2.isDisplayed());
    }

    @Then("Kullanci Password kutusuna tiklar")
    public void kullanciPasswordKutusunaTiklar() {
      viceDeanOgretmenOlusturma.password2.click();
    }

    @And("Kullanici Password bilgisi olarak {int} karakter girer")
    public void kullaniciPasswordBilgisiOlarakKarakterGirer(int arg0) {
        viceDeanOgretmenOlusturma.password2.sendKeys(ConfigReader.getProperty("password2"));
    }

    @And("Kullanici en az {int} karakter olan bir Password girer")
    public void kullaniciEnAzKarakterOlanBirPasswordGirer(int arg0) {
        viceDeanOgretmenOlusturma.password2.sendKeys(ConfigReader.getProperty("password2"));
    }

    @Then("Kullanici password kutusuna tiklar")
    public void kullaniciPasswordKutusunaTiklar() {
        viceDeanOgretmenOlusturma.password2.click();
        
    }

    @And("Kullanici buyuk harf,rakam,kucuk harf  iceren bir deger girer")
    public void kullaniciBuyukHarfRakamKucukHarfIcerenBirDegerGirer() {
        viceDeanOgretmenOlusturma.password2.sendKeys(ConfigReader.getProperty("password4"),Keys.ENTER);
    }

    @And("Kullanici Submit olan kutusuna tiklar")
    public void kullaniciSubmitOlanKutusunaTiklar() {
        viceDeanOgretmenOlusturma.submit2.click();
    }

    @And("Kullanici Add teacher successsfully mesajini gorur")
    public void kullaniciAddTeacherSuccesssfullyMesajiniGorur() {
        Assert.assertTrue(viceDeanOgretmenOlusturma.submit2.isDisplayed());
    }

    @Then("Kullanici buyukharf ve rakam iceren deger girer")
    public void kullaniciBuyukharfVeRakamIcerenDegerGirer() {
        viceDeanOgretmenOlusturma.password2.sendKeys(ConfigReader.getProperty("password3"));
    }


    @And("Kullanici Submit olan  kutusuna {int}.defa  tiklar")
    public void kullaniciSubmitOlanKutusunaDefaTiklar(int arg0) {
        viceDeanOgretmenOlusturma.submit2.click();
        Assert.assertFalse(viceDeanOgretmenOlusturma.ssnRequired.isDisplayed());//testin gecmemesi gerekiyor test Failed
    }






}


