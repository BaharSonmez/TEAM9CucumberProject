package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.AdminPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminStepDefinitions {

   AdminPage adminPage = new AdminPage();


   @Given("kullanıcı managementschool sayfasına gider")
   public void kullanıcı_managementschool_sayfasına_gider() {
      Driver.getDriver().get(ConfigReader.getProperty("url"));
      ReusableMethods.bekle(2);
   }
   @Then("kullanıcı log ın  butonuna tıklar")
   public void kullanıcı_log_ın_butonuna_tıklar() {
      adminPage.loginButton.click();
      // ReusableMethods.click(adminPage.loginButton);
   }
   @Then("kullanıcı admin olarak username kısmını doldurur")
   public void kullanıcı_admin_olarak_username_kısmını_doldurur() {
      adminPage.usernameButton.sendKeys(ConfigReader.getProperty("adminUsername"));
   }
   @Then("kullanıcı admin olarak password kısmını doldurur")
   public void kullanıcı_admin_olarak_password_kısmını_doldurur() {
      adminPage.passwordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
   }
   @Then("kullanıcı log ın giris butonuna tıklar")
   public void kullanıcı_log_ın_giris_butonuna_tıklar() {
      adminPage.loginButtonGiris.click();
   }
   @Then("kullanıcı name kutucugunu doldurur")
   public void kullanıcı_name_kutucugunu_doldurur() {
      adminPage.nameKutucugu.sendKeys(ConfigReader.getProperty("adminname"));
   }
   @Then("kullanıcı surname kutucugunu doldurur")
   public void kullanıcı_surname_kutucugunu_doldurur() {
      adminPage.surnameKutucugu.sendKeys(ConfigReader.getProperty("adminsurname"));
   }
   @Then("kullanıcı birth place yerini doldurur")
   public void kullanıcı_birth_place_yerini_doldurur() {
      adminPage.birtPlaceKutucugu.sendKeys(ConfigReader.getProperty("birthplaces"));
   }
   @Then("kullanıcı cinsiyetini seçer")
   public void kullanıcı_cinsiyetini_seçer() {
      adminPage.genderKutusu.click();
   }
   @Then("kullanıcı date of birth bölümünü doldurur")
   public void kullanıcı_date_of_birth_bölümünü_doldurur() {
      adminPage.birthDayKutusu.sendKeys("25/05/1515");


   }
   @Then("kullanıcı phone kısmını doldurur")
   public void kullanıcı_phone_kısmını_doldurur() {
      adminPage.phoneKutusu.sendKeys(ConfigReader.getProperty("phone"));
   }
   @Then("kullanıcı Ssn kısmını doldurur")
   public void kullanıcı_ssn_kısmını_doldurur() {
      adminPage.ssnKutusu.sendKeys(ConfigReader.getProperty("ssnnumber"));
   }
   @Then("kullanıcı username kutucugunu doldurur")
   public void kullanıcı_username_kutucugunu_doldurur() {
      adminPage.usernameButton.sendKeys(ConfigReader.getProperty("usernameregister"));
   }
   @Then("kullanıcı password kutucugunu doldurur")
   public void kullanıcı_password_kutucugunu_doldurur() {
      adminPage.passwordButton.sendKeys(ConfigReader.getProperty("passwordregister"));
   }
   @Then("kullanıcı submit butonuna tıklar")
   public void kullanıcı_submit_butonuna_tıklar() {
      adminPage.submitButonu.click();
   }






   }


