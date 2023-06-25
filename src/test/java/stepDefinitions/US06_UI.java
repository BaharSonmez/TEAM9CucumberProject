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

public class US06_UI {

    EsraPage esraPage = new EsraPage();

    //login
    @Given("Dean managementonschools sayfa url'sine gider")
    public void DeanManagementonschoolsSayfaUrlSineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
    }

    @When("Dean login butonuna tiklar")
    public void DeanLoginButonunaTiklar() {
        esraPage.loginbutton.click();

    }

    @Then("Dean username ve password girer")
    public void DeanUsernameVePasswordGirer() {
        esraPage.usernameLogin.sendKeys(ConfigReader.getProperty("usernameLogin"));
        esraPage.passwordLogin.sendKeys(ConfigReader.getProperty("passwordLogin"));
    }

    @Then("Dean login butonuna tiklar ve login olur")
    public void DeanLoginButonunaTiklarVeLoginOlur() {
        esraPage.loginButton2.click();
        ReusableMethods.bekle(2);
    }


    //TC01

    @And("Dean Name kismina en az iki karakter girer")
    public void DeanNameKisminaEnAzIkiKarakterGirer() {
        esraPage.namE.sendKeys("es");
    }

    @Then("Dean Name girilebildigini goruntuler")
    public void Dean_name_girilebildigini_goruntuler() {
        Assert.assertTrue(esraPage.validName.isDisplayed());
    }

    @Then("Dean Name kismini bos birakir")
    public void Dean_name_kismini_bos_birakir() {
        esraPage.namE.clear();
    }

    @And("Dean Required yazisini goruntuler ve name bos birakilamayacagini dogrular")
    public void DeanRequiredYazisiniGoruntulerVeNameBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidName.isDisplayed());
    }

    //TC02

    @Then("Dean Surname kismina en az iki karakter  girer")
    public void Dean_surname_kismina_en_az_iki_karakter_girer() {
        esraPage.surnamE.sendKeys("as");
    }

    @And("Dean Surname girilebildigini goruntuler")
    public void DeanSurnameGirilebildiginiGoruntuler() {
        Assert.assertTrue(esraPage.validSurname.isDisplayed());
    }

    @And("Dean Surname  kismini bosbirakir")
    public void DeanSurnameKisminiBosbirakir() {
        esraPage.surnamE.clear();
    }

    @Then("Dean Required yazisini goruntuler ve surname bos birakilamayacagini dogrular")
    public void Dean_required_yazisini_goruntuler_ve_surname_bos_birakilamayacagini_dogrular() {
        Assert.assertTrue(esraPage.invalidSurname.isDisplayed());
    }

    //TC03
    @And("Dean Birth Place kismina en az iki karakter girer")
    public void DeanBirthPlaceKisminaEnAzIkiKarakterGirer() {
        esraPage.birthPlace.sendKeys("is");
    }

    @Then("Dean Birth Place  girilebildigini goruntuler")
    public void Dean_birth_place_girilebildigini_goruntuler() {
        Assert.assertTrue(esraPage.validbirthPlace.isDisplayed());

    }

    @Then("Dean Birth Place  kismini bos birakir")
    public void Dean_birth_place_kismini_bos_birakir() {
        esraPage.birthPlace.clear();

    }
    @And("Dean Required yazisini goruntuler ve birt placein bos birakilamayacagini dogrular")
    public void DeanRequiredYazisiniGoruntulerVeBirtPlaceinBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidbirthPlace.isDisplayed());
    }

    //TC04
    @And("Dean Gender olarak Male ya da Female secebilir")
    public void DeanGenderOlarakMaleYaDaFemaleSecebilir() {
        esraPage.femalE.click(); esraPage.malE.click();
    }

    //TC05
    @Then("Dean name, surname, birth place, date of birth, phone, ssn, username, password girer")
    public void Dean_name_surname_birth_place_date_of_birth_phone_ssn_username_password_girer() {
        esraPage.namE.sendKeys("esra");
        esraPage.surnamE.sendKeys("aslan");
        esraPage.birthPlace.sendKeys("istanbul");
        esraPage.birthdayE.sendKeys("01011990");
        esraPage.phoneNumberE.sendKeys("234-234-5432");
        esraPage.ssnE.sendKeys("678-22-1234");
        esraPage.usernamE.sendKeys("esraslan");
        esraPage.passwordE.sendKeys("12345678");
    }
    @Then("Dean gender kismini bos birakir")
    public void Dean_gender_kismini_bos_birakir() {

    }
    @Then("Dean submit butonuna tiklar")
    public void Dean_submit_butonuna_tiklar() {
        esraPage.submitButtonE.click();

    }
    @Then("Dean submit butonunun aktif olmadigini goruntuler")
    public void Dean_submit_butonunun_aktif_olmadigini_goruntuler() {

    }

    //06
    @Then("Dean Date Of Birth  kismini bos birakir")
    public void Dean_date_of_birth_kismini_bos_birakir() {

    }
    @Then("Dean Required yazisini goruntuler ve bos birakilamayacagini dogrular")
    public void Dean_required_yazisini_goruntuler_ve_bos_birakilamayacagini_dogrular() {
        esraPage.invalidbirthDay.isDisplayed();

    }
    @And("Dean Date Of Birth kismini gun,ay,yil seklinde doldurur")
    public void DeanDateOfBirthKisminiGunAyYilSeklindeDoldurur() {
        esraPage.birthdayE.sendKeys("01011990");

    }
    @Then("Dean Date of Birth kisminin girilebildigini dogrular")
    public void Dean_date_of_birth_kisminin_girilebildigini_dogrular() {
        esraPage.validbirthDay.isDisplayed();

    }

    //07
    @And("Dean gecerli bir phone number girer")
    public void DeanGecerliBirPhoneNumberGirer() {
        esraPage.phoneNumberE.sendKeys("111-222-3333");

    }
    @And("Dean Phone kismini bos birakir")
    public void DeanPhoneKisminiBosBirakir() {
        esraPage.phoneNumberE.clear();

    }

    @And("Dean Required yazisini goruntuler ve phone bos birakilamayacagini dogrular")
    public void DeanRequiredYazisiniGoruntulerVePhoneBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidPhoneNumber.isDisplayed());

    }
    //TC08
    @And("Dean Phone kismina dort,uc,dort seklinde minimum on iki karakter girer")
    public void DeanPhoneKisminaDortUcDortSeklindeMinimumOnIkiKarakterGirer() {
        esraPage.phoneNumberE.sendKeys("1199-111-2222");
    }
    @And("Dean name, surname, birth place, gender, date of birth,  ssn, username, password girer")
    public void DeanNameSurnameBirthPlaceGenderDateOfBirthSsnUsernamePasswordGirer() {
        esraPage.namE.sendKeys("esra");
        esraPage.surnamE.sendKeys("aslan");
        esraPage.birthPlace.sendKeys("istanbul");
        esraPage.femalE.click();
        esraPage.birthdayE.sendKeys("01011990");
        esraPage.ssnE.sendKeys("678-22-1234");
        esraPage.usernamE.sendKeys("esraslan");
        esraPage.passwordE.sendKeys("12345678");

    }
    @And("Dean phone number should be exact on iki characters yazisini goruntuler")
    public void DeanPhoneNumberShouldBeExactOnIkiCharactersYazisiniGoruntuler() {
        //Assert.assertEquals(esraPage.phoneuyariYazisi,"Error: Phone number should be exact 12 characters");
        Assert.assertTrue(esraPage.phoneuyariYazisi.isDisplayed());

    }
    //TC09
    @And("Dean Phone kismina en az on iki karakterde harf girer")
    public void DeanPhoneKisminaEnAzOnIkiKarakterdeHarfGirer() {
        esraPage.phoneNumberE.sendKeys("aaaaaaaaaaaaa");
    }
    @And("Dean Please entervalid phone number yazisini goruntuler")
    public void DeanPleaseEntervalidPhoneNumberYazisiniGoruntuler() {
        Assert.assertTrue(esraPage.phoneuyariYazisi.isDisplayed());
    }
    //TC10
    @And("Dean SSN kismina uc iki dort seklinde dokuz rakam girer")
    public void DeanSSNKisminaUsIkiDortSeklindeDokuzRakamGirer() {
        esraPage.ssnE.sendKeys("678-22-1234");
        Assert.assertTrue(esraPage.validssn.isDisplayed());

    }
    @And("Dean SSN kismini bos birakir")
    public void DeanSSNKisminiBosBirakir() {
        esraPage.ssnE.clear();

    }
    @And("Dean Required yazisini goruntuler ve ssn bos birakilamayacagini dogrular")
    public void DeanRequiredYazisiniGoruntulerVeSsnBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidSSN.isDisplayed());

    }

    //TC11
    @And("Dean Username kismina en az dort karakter girer")
    public void DeanUsernameKisminaEnAzDortKarakterGirer() {
        esraPage.usernamE.sendKeys("esra");
        Assert.assertTrue(esraPage.validusername.isDisplayed());

    }
    @And("Dean username kismini bos birakir")
    public void DeanUsernameKisminiBosBirakir() {
        esraPage.usernamE.clear();

    }
    @And("Dean Required yazisini goruntuler ve username bos birakilamayacagini dogrular")
    public void DeanRequiredYazisiniGoruntulerVeUsernameBosBirakilamayacaginiDogrular() {
        Assert.assertTrue(esraPage.invalidSurname.isDisplayed());
    }

    //TC12
    @And("Dean Password kismina bir buyuk harf girer")
    public void DeanPasswordKisminaBirBuyukHarfGirer() {
        esraPage.passwordE.sendKeys("E");

    }
    @And("Dean Password kismina bir kucuk harf girer")
    public void DeanPasswordKisminaBirKucukHarfGirer() {
        esraPage.passwordE.sendKeys("s");

    }
    @And("Dean Password kismina alti tane rakam girer ve girilebildigini goruntuler")
    public void DeanPasswordKisminaAltiTaneRakamGirerVeGirilebildiginiGoruntuler() {
        esraPage.passwordE.sendKeys("123456");
        Assert.assertTrue(esraPage.validpassword.isDisplayed());

    }
    @And("Dean Password kismina en az sekiz rakam girer ve girilebildigini goruntuler")
    public void DeanPasswordKisminaEnAzSekizRakamGirerVeGirilebildiginiGoruntuler() {
        esraPage.passwordE.sendKeys("12345678");
        Assert.assertTrue(esraPage.validpassword.isDisplayed());

    }
    @And("Dean Password kismina sekizden az karakter girer ve Minimum sekiz character yazisini goruntuler")
    public void DeanPasswordKisminaSekizdenAzKarakterGirerVeMinimumSekizCharacterYazisiniGoruntuler() {
        esraPage.passwordE.sendKeys("1234");
        Assert.assertTrue(esraPage.invalidpassword.isDisplayed());

    }
    @And("Dean Password kismini bos birakir ve Required yazisini goruntuler")
    public void DeanPasswordKisminiBosBirakirVeRequiredYazisiniGoruntuler() {
        esraPage.passwordE.clear();
        Assert.assertTrue(esraPage.invalidpassword.isDisplayed());
    }
}





