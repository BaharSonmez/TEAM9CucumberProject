package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EsraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US23_UI_StepDefinition {

    EsraPage esraPage = new EsraPage();

    //login
    @Given("Admin managementonschools sayfa url'sine gider")
    public void adminManagementonschoolsSayfaUrlSineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
    }

    @When("Admin login butonuna tiklar")
    public void adminLoginButonunaTiklar() {
        esraPage.loginbutton.click();

    }

    @Then("Admin username ve password girer")
    public void adminUsernameVePasswordGirer() {
        esraPage.usernameLogin.sendKeys(ConfigReader.getProperty("usernameLogin"));
        esraPage.passwordLogin.sendKeys(ConfigReader.getProperty("passwordLogin"));
    }

    @Then("Admin login butonuna tiklar ve login olur")
    public void adminLoginButonunaTiklarVeLoginOlur() {
        esraPage.loginButton2.click();
        ReusableMethods.bekle(2);
    }

    @And("Admin Vice Dean Management sayfasina gider")
    public void adminViceDeanManagementSayfasinaGider() {

        esraPage.menuButtonE.click();
        esraPage.viceDeanButton.click();

    }

    //TC01

    @And("Admin Name kismina en az iki karakter girer")
    public void adminNameKisminaEnAzIkiKarakterGirer() {
        esraPage.namE.sendKeys("es");
    }

    @Then("Admin Name girilebildigini goruntuler")
    public void admin_name_girilebildigini_goruntuler() {
        Assert.assertTrue(esraPage.validName.isDisplayed());
    }

    @Then("Admin Name kismini bos birakir")
    public void admin_name_kismini_bos_birakir() {
        esraPage.namE.clear();
    }

    @And("Admin Required yazisini goruntuler ve name bos birakilamayacagini dogrular")
    public void adminRequiredYazisiniGoruntulerVeNameBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidName.isDisplayed());
    }

    //TC02

    @Then("Admin Surname kismina en az iki karakter  girer")
    public void admin_surname_kismina_en_az_iki_karakter_girer() {
        esraPage.surnamE.sendKeys("as");
    }

    @And("Admin Surname girilebildigini goruntuler")
    public void adminSurnameGirilebildiginiGoruntuler() {
        Assert.assertTrue(esraPage.validSurname.isDisplayed());
    }

    @And("Admin Surname  kismini bosbirakir")
    public void adminSurnameKisminiBosbirakir() {
        esraPage.surnamE.clear();
    }

    @Then("Admin Required yazisini goruntuler ve surname bos birakilamayacagini dogrular")
    public void admin_required_yazisini_goruntuler_ve_surname_bos_birakilamayacagini_dogrular() {
        Assert.assertTrue(esraPage.invalidSurname.isDisplayed());
    }

    //TC03
    @And("Admin Birth Place kismina en az iki karakter girer")
    public void adminBirthPlaceKisminaEnAzIkiKarakterGirer() {
        esraPage.birthPlace.sendKeys("is");
    }

    @Then("Admin Birth Place  girilebildigini goruntuler")
    public void admin_birth_place_girilebildigini_goruntuler() {
      Assert.assertTrue(esraPage.validbirthPlace.isDisplayed());

    }

    @Then("Admin Birth Place  kismini bos birakir")
    public void admin_birth_place_kismini_bos_birakir() {
        esraPage.birthPlace.clear();

    }
    @And("Admin Required yazisini goruntuler ve birt placein bos birakilamayacagini dogrular")
    public void adminRequiredYazisiniGoruntulerVeBirtPlaceinBosBirakilamayacaginiDogrular() {
       Assert.assertTrue(esraPage.invalidbirthPlace.isDisplayed());
    }

    //TC04
    @And("Admin Gender olarak Male ya da Female secebilir")
    public void adminGenderOlarakMaleYaDaFemaleSecebilir() {
       esraPage.femalE.click(); esraPage.malE.click();
    }

    //TC05
    @Then("Admin name, surname, birth place, date of birth, phone, ssn, username, password girer")
    public void admin_name_surname_birth_place_date_of_birth_phone_ssn_username_password_girer() {
        esraPage.namE.sendKeys("esra");
        esraPage.surnamE.sendKeys("aslan");
        esraPage.birthPlace.sendKeys("istanbul");
        esraPage.birthdayE.sendKeys("01011990");
        esraPage.phoneNumberE.sendKeys("234-234-5432");
        esraPage.ssnE.sendKeys("678-22-1234");
        esraPage.usernamE.sendKeys("esraslan");
        esraPage.passwordE.sendKeys("12345678");
    }
    @Then("Admin gender kismini bos birakir")
    public void admin_gender_kismini_bos_birakir() {

    }
    @Then("Admin submit butonuna tiklar")
    public void admin_submit_butonuna_tiklar() {
        esraPage.submitButtonE.click();

    }
    @Then("Admin submit butonunun aktif olmadigini goruntuler")
    public void admin_submit_butonunun_aktif_olmadigini_goruntuler() {

    }

    //06
    @Then("Admin Date Of Birth  kismini bos birakir")
    public void admin_date_of_birth_kismini_bos_birakir() {

    }
    @Then("Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular")
    public void admin_required_yazisini_goruntuler_ve_bos_birakilamayacagini_dogrular() {
     esraPage.invalidbirthDay.isDisplayed();

    }
    @And("Admin Date Of Birth kismini gun,ay,yil seklinde doldurur")
    public void adminDateOfBirthKisminiGunAyYilSeklindeDoldurur() {
        esraPage.birthdayE.sendKeys("01011990");

    }
    @Then("Admin Date of Birth kisminin girilebildigini dogrular")
    public void admin_date_of_birth_kisminin_girilebildigini_dogrular() {
        esraPage.validbirthDay.isDisplayed();

    }

    //07
    @And("Admin gecerli bir phone number girer")
    public void adminGecerliBirPhoneNumberGirer() {
        esraPage.phoneNumberE.sendKeys("111-222-3333");

    }
    @And("Admin Phone kismini bos birakir")
    public void adminPhoneKisminiBosBirakir() {
        esraPage.phoneNumberE.clear();
        
    }

    @And("Admin Required yazisini goruntuler ve phone bos birakilamayacagini dogrular")
    public void adminRequiredYazisiniGoruntulerVePhoneBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidPhoneNumber.isDisplayed());

    }
    //TC08
    @And("Admin Phone kismina dort,uc,dort seklinde minimum on iki karakter girer")
    public void adminPhoneKisminaDortUcDortSeklindeMinimumOnIkiKarakterGirer() {
        esraPage.phoneNumberE.sendKeys("1199-111-2222");
    }
    @And("Admin name, surname, birth place, gender, date of birth,  ssn, username, password girer")
    public void adminNameSurnameBirthPlaceGenderDateOfBirthSsnUsernamePasswordGirer() {
        esraPage.namE.sendKeys("esra");
        esraPage.surnamE.sendKeys("aslan");
        esraPage.birthPlace.sendKeys("istanbul");
        esraPage.femalE.click();
        esraPage.birthdayE.sendKeys("01011990");
        esraPage.ssnE.sendKeys("678-22-1234");
        esraPage.usernamE.sendKeys("esraslan");
        esraPage.passwordE.sendKeys("12345678");

    }
    @And("Admin phone number should be exact on iki characters yazisini goruntuler")
    public void adminPhoneNumberShouldBeExactOnIkiCharactersYazisiniGoruntuler() {
        //Assert.assertEquals(esraPage.phoneuyariYazisi,"Error: Phone number should be exact 12 characters");
        Assert.assertTrue(esraPage.phoneuyariYazisi.isDisplayed());

    }
    //TC09
    @And("Admin Phone kismina en az on iki karakterde harf girer")
    public void adminPhoneKisminaEnAzOnIkiKarakterdeHarfGirer() {
        esraPage.phoneNumberE.sendKeys("aaaaaaaaaaaaa");
    }
    @And("Admin Please entervalid phone number yazisini goruntuler")
    public void adminPleaseEntervalidPhoneNumberYazisiniGoruntuler() {
        Assert.assertTrue(esraPage.phoneuyariYazisi.isDisplayed());
    }
    //TC10
    @And("Admin SSN kismina uc iki dort seklinde dokuz rakam girer")
    public void adminSSNKisminaUsIkiDortSeklindeDokuzRakamGirer() {
        esraPage.ssnE.sendKeys("678-22-1234");
        Assert.assertTrue(esraPage.validssn.isDisplayed());

    }
    @And("Admin SSN kismini bos birakir")
    public void adminSSNKisminiBosBirakir() {
        esraPage.ssnE.clear();

    }
    @And("Admin Required yazisini goruntuler ve ssn bos birakilamayacagini dogrular")
    public void adminRequiredYazisiniGoruntulerVeSsnBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidSSN.isDisplayed());

    }

    //TC11
    @And("Admin Username kismina en az dort karakter girer")
    public void adminUsernameKisminaEnAzDortKarakterGirer() {
        esraPage.usernamE.sendKeys("esra");
        Assert.assertTrue(esraPage.validusername.isDisplayed());

    }
    @And("Admin username kismini bos birakir")
    public void adminUsernameKisminiBosBirakir() {
        esraPage.usernamE.clear();

    }
    @And("Admin Required yazisini goruntuler ve username bos birakilamayacagini dogrular")
    public void adminRequiredYazisiniGoruntulerVeUsernameBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidSurname.isDisplayed());
    }

    //TC12
    @And("Admin Password kismina bir buyuk harf girer")
    public void adminPasswordKisminaBirBuyukHarfGirer() {
        esraPage.passwordE.sendKeys("E");

    }
    @And("Admin Password kismina bir kucuk harf girer")
    public void adminPasswordKisminaBirKucukHarfGirer() {
        esraPage.passwordE.sendKeys("s");

    }
    @And("Admin Password kismina alti tane rakam girer ve girilebildigini goruntuler")
    public void adminPasswordKisminaAltiTaneRakamGirerVeGirilebildiginiGoruntuler() {
        esraPage.passwordE.sendKeys("123456");
        Assert.assertTrue(esraPage.validpassword.isDisplayed());

    }
    @And("Admin Password kismina en az sekiz rakam girer ve girilebildigini goruntuler")
    public void adminPasswordKisminaEnAzSekizRakamGirerVeGirilebildiginiGoruntuler() {
        esraPage.passwordE.sendKeys("12345678");
        Assert.assertTrue(esraPage.validpassword.isDisplayed());

    }
    @And("Admin Password kismina sekizden az karakter girer ve Minimum sekiz character yazisini goruntuler")
    public void adminPasswordKisminaSekizdenAzKarakterGirerVeMinimumSekizCharacterYazisiniGoruntuler() {
        esraPage.passwordE.sendKeys("1234");
        Assert.assertTrue(esraPage.invalidpassword.isDisplayed());

    }
    @And("Admin Password kismini bos birakir ve Required yazisini goruntuler")
    public void adminPasswordKisminiBosBirakirVeRequiredYazisiniGoruntuler() {
        esraPage.passwordE.clear();
        Assert.assertTrue(esraPage.invalidpassword.isDisplayed());
    }
}

