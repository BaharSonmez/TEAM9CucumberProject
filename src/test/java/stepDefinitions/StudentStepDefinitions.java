package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StudentPage;

import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class StudentStepDefinitions {
    StudentPage studentPage = new StudentPage();

    @Given("kullanıcı management sayfasına gider")
    public void kullanıcı_management_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("kullanıcı login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        studentPage.loginButton.click();
    }
    @Then("kullanıcı username kısmını doldurur")
    public void kullanıcı_username_kısmına_anka45_yazar() {
        studentPage.usernameButton.sendKeys(ConfigReader.getProperty("StudentUsername"));

    }
    @Then("kullanıcı password kısmını doldurur")
    public void kullanıcı_password_kısmına_anka4567_yazar() {
        studentPage.passwordButton.sendKeys(ConfigReader.getProperty("StudentPassword"));
    }
    @Then("kullanıcı login giris butonuna tıklar")
    public void kullanıcıLoginGirisButonunaTıklar() {
        studentPage.loginButtonGiris.click();
    }
    @Then("kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür")
    public void kullanıcı_acılan_bolumde_teacher_day_start_time_ve_stop_time_bilgilerini_görür() {
        Assert.assertTrue(studentPage.teacherTimeBilgileri.isDisplayed());
    }
    @Then("kullanıcı istediği dersleri seçer")
    public void kullanıcı_istediği_dersleri_seçer() {

        studentPage.secilenDers.click();
        bekle(2);


    }
    @Then("kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır")
    public void kullanıcı_aynı_gün_ve_aynı_saatte_olan_dersleri_seçtiğinde_uyarı_mesajı_alır() {
        //managementPages.aynıSaattekiDers.click();
        click(studentPage.aynıSaattekiDers);
        bekle(2);
        click(studentPage.submitButonu);

        bekle(2);
        Assert.assertEquals(studentPage.uyarıMesajı.getText(),"Error: Course schedule cannot be selected for the same hour and day");

    }
    @Then("kullanıcı seçtiği bir dersi siler")
    public void kullanıcı_seçtiği_bir_dersi_siler() {
        webElementResmi(studentPage.list);
    }
    @Then("kullanıcı seçtiği dersleri Lesson Program Listte görür")
    public void kullanıcı_seçtiği_dersleri_lesson_program_listte_görür() {
        scrollEnd();
        Assert.assertTrue(studentPage.lessonProgramList.isDisplayed());
    }
    @Then("kullanıcı sağ üstten menü bölmesine tıklar")
    public void kullanıcı_sağ_üstten_menü_bölmesine_tıklar() {
        bekle(1);
        studentPage.menuButton.click();
    }
    @Then("Kullanıcı acılan pencereden grades and announcement bölümüne tıklar")
    public void kullanıcı_acılan_pencereden_grades_and_announcement_bölümüne_tıklar() {
        bekle(2);
        studentPage.gradesAnnouncements.click();
    }

    @Then("kullanıcı açılan sayfada sınav notlarını görür")
    public void kullanıcı_açılan_sayfada_sınav_notlarını_görür() {
        scrollHome();
        bekle(2);
        Assert.assertTrue(studentPage.examplesNote.isDisplayed());
    }
    @Then("kullanıcı acılan sayfada kendisi icin olusturulan toplantıları gorur")
    public void kullanıcı_acılan_sayfada_kendisi_icin_olusturulan_toplantıları_gorur() {
        Assert.assertTrue(studentPage.meetList.isDisplayed());
    }











    }


