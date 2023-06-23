package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US01.RegisterUS01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01StepDefinition {
    RegisterUS01 obj;

    @Given(":Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And(":Register butonuna tiklar")
    public void registerButonunaTiklar() {
        obj = new RegisterUS01();
        obj.register.click();
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

   @Then("Kullanici cinsiyet female girer")
    public void kullaniciCinsiyetFemaleGirer() {
        obj = new RegisterUS01();
        ReusableMethods.click(obj.genderfemale);
    }




    @And("Kullanici Register butona tiklar")
    public void kullaniciRegisterButonaTiklar() {
        obj = new RegisterUS01();
        obj.registerOk.click();

    }

    @Then("SayfayiKapatir")
    public void sayfayikapatir() {
    }


    @And("Kullanici eksik karakterle password girer uyari alamlidir")
    public void kullaniciEksikKarakterlePasswordGirerUyariAlamlidir() {
        obj = new RegisterUS01();
        String invalid = obj.passwordinvalid.getText();

        Assert.assertTrue("Uyari almalidir almaz", invalid.contains("Minimum 8 character"));

    }

    @And("Kullanici isim girer")
    public void kullaniciIsimGirer() {
        obj = new RegisterUS01();
        ReusableMethods.sendKeysJS(obj.namebutton, "Gulsum");
    }


    @Then(":Kullanici bilgileri girer {string},{string},{string},{string},{string},{string} ,{string},{string}")
    public void kullaniciBilgileriGirer(String Name, String Surname, String BirthPlace, String Phone,
                                        String DateOfBirth, String Ssn, String UserName, String Password) {
        obj = new RegisterUS01();


        obj.namebutton.sendKeys(Name, Keys.TAB, Surname, Keys.TAB, BirthPlace, Keys.TAB, Phone, Keys.TAB, Keys.TAB,
                DateOfBirth, Keys.TAB, Ssn, Keys.TAB, UserName, Keys.TAB, Password);
    }




    }


