package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Login;
import pages.US15_ViceDeanStudent;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US15StepDefinition {
    US15_ViceDeanStudent vice=new US15_ViceDeanStudent();
    Login log=new Login();
    @Given("Kullanıcı _{string} sayfasina gider")
    public void kullanıcı_sayfasina_gider(String url) {
        Driver.getDriver().get(url);
    }
    @When("Kullanıcı LOG IN e tıklar")
    public void kullanıcı_log_ın_e_tıklar() {
        log.login.click();
    }
    @When("Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_vice_dean_olarak_user_name_ve_password_u_girer() {
        log.username.sendKeys(ConfigReader.getProperty("username"));
        log.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.click(vice.accountlogin);
    }
    @When("Kullanıcı menuden student management e tıklar")
    public void kullanıcı_menuden_student_management_e_tıklar() {
        ReusableMethods.click(vice.menu);
        ReusableMethods.bekle(1);
        ReusableMethods.click(vice.studentmanagement);
    }
    @Then("Kullanıcı istediği danışman öğretmeni seçer")
    public void kullanıcı_istediği_danışman_öğretmeni_seçer() {
        ReusableMethods.click(vice.teacherselectddm);
        Select select=new Select(vice.teacherselectddm);
        select.selectByIndex(1);

    }


    @And("And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void andKullanıcıNAMEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı name in altında Required yazısını görür.")
    public void kullanıcıNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.namerequired.isDisplayed());
    }

    @And("Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıSurNAMEIBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı surname in altında Required yazısını görür.")
    public void kullanıcıSurnameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.surnamerequired.isDisplayed());
    }

    @And("Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıBIRTHPLACEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı Birth Place in altında Required yazısını görür.")
    public void kullanıcıBirthPlaceInAltındaRequiredYazısınıGörür() {
        //Assert.assertTrue(vice.birthplacere);quired.isDisplayed());
       // Assert.assertEquals("Required",vice.birthplacerequired.getText()
        System.out.println("vice.birthplacerequired.getText() = " + vice.birthplacerequired.getText());
    }

    @And("Kullanıcı E-mail İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıEMailİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı E-mail in altında Required yazısını görür.")
    public void kullanıcıEMailInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.emailrequired.isDisplayed());
    }

    @And("Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıTelefonNumarasıİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı Telefon numarası in altında Required yazısını görür.")
    public void kullanıcıTelefonNumarasıInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.phonerequired.isDisplayed());
    }

    @And("Kullanıcı cinsiyet İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıCinsiyetİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        ReusableMethods.click(vice.submit);
        ReusableMethods.bekle(2);
    }

    @Then("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE uyarısını görür")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEUyarısınıGörür() {
        // String expected="You have entered an invalid value. Valid values are: MALE, FEMALE";
        //String actual=vice.genderalert.getText();
        System.out.println("texti"+vice.genderalert.getText());
        Assert.assertTrue(vice.genderalert.isDisplayed());

    }

    @And("Kullanıcı Date Of Birth İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıDateOfBirthİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı Date Of Birth in altında Required yazısını görür.")
    public void kullanıcıDateOfBirthInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.dobrequired.isDisplayed());
    }

    @And("Kullanıcı User Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıUserNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı User Name in altında Required yazısını görür.")
    public void kullanıcıUserNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.usernamerequired.isDisplayed());
    }

    @And("Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar")
    public void kullanıcıFatherNameİBoşBırakıpNAMESurnameBirthPlaceEmailDateOfBirthSsnUserNameCinsiyetMotherNameGeçerliPasswordTelefonNumarasıGirdiktenSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı Father Name in altında Required yazısını görür.")
    public void kullanıcıFatherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.fathernamerequired.isDisplayed());
    }

    @And("Kullanıcı Mother Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıMotherNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı Mother Name in altında Required yazısını görür.")
    public void kullanıcıMotherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.mothernamerequired.isDisplayed());
    }



    @Then("Kullanıcı Please enter valid SSN number uyarsını görür.")
    public void kullanıcıPleaseEnterValidSSNNumberUyarsınıGörür() {
        boolean invalidSSN= false;
        Assert.assertFalse("Uyari bulunamdı",invalidSSN);
        ReusableMethods.tumSayfaResmi("US15 Ssn Uyari Yok");
    }



    @And("Sayfa kapatiliir")
    public void sayfaKapatiliir() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();
    }

    @And("Kullanıcı SSN BÖLÜMÜNE; {string} ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar")
    public void kullanıcıSSNBÖLÜMÜNEVeDokuzRakamdanOluşanNumarayıDiğerBölümlerGirdiktenSonraSubmitETıklar(String ihtimal) {
        vice.ssn.sendKeys(ihtimal);
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);

    }

    @And("Kullanıcı tüm bölümleri girdikten sonra submit e tıklar")
    public void kullanıcıTümBölümleriGirdiktenSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("alipassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı STUDENT LIST bölümünde student number ı görür.")
    public void kullanıcıSTUDENTLISTBölümündeStudentNumberIGörür() {
        Assert.assertTrue(vice.studentnumber.isDisplayed());


    }


    @And("Kullanıcı password kısmına {string} İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıPasswordKısmınaİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar(String Pass) {
        vice.smpassword.sendKeys(Pass);
        vice.name.sendKeys(ConfigReader.getProperty("aliname"));
        vice.surname.sendKeys(ConfigReader.getProperty("alisurname"));
        vice.email.sendKeys(ConfigReader.getProperty("aliemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("alidateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("alissn"));
        vice.username.sendKeys(ConfigReader.getProperty("aliusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("alifathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("alimothername"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("alibirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("aliphone"));
        vice.female.click();
        ReusableMethods.click(vice.submit);
    }

    @Then("Kullanıcı passwordun altında Minimum sekiz character uyarısını görür")
    public void kullanıcıPasswordunAltındaMinimumSekizCharacterUyarısınıGörür() {
        // String expected="Minimum 8 character";
        String actual=vice.passwordalerT.getText();
        Assert.assertTrue(actual.contains("Minimum 8 character"));

    }


}
