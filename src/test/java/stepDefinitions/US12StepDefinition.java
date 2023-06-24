package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.US12.ViceDeanDersProgOlusturma;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US12StepDefinition {

    ViceDeanDersProgOlusturma viceDean = new ViceDeanDersProgOlusturma();

    @When("Kullanici Login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        viceDean.homePageLogin1.click();
        ReusableMethods.bekle(1);

    }

    @When("Kullanici usernmae kutusuna tiklar")
    public void kullanici_usernmae_kutusuna_tiklar() {
        viceDean.username.click();
        ReusableMethods.bekle(1);

    }

    @Then("Kullanici username kutusuna AdminB129 girer ve alt kutucuga gecer")
    public void kullanici_username_kutusuna_admin_b129_girer_ve_alt_kutucuga_gecer() {
        viceDean.username.sendKeys(ConfigReader.getProperty("viceusername1"));
        ReusableMethods.bekle(1);

    }

    @Then("Kullanici password kutusuna {int} bilgisini girer ve tiklar")
    public void kullanici_password_kutusuna_bilgisini_girer_ve_tiklar(Integer int1) {
        viceDean.password.sendKeys(ConfigReader.getProperty("vicepassword1"));

    }

    @Then("Kullanici Vice Dean olarak Login olur")
    public void kullanici_vice_dean_olarak_login_olur() {
        viceDean.login.click();
        ReusableMethods.bekle(1);

    }

    @Then("Kullanici  acilan sayfada ust kisimda AdminB129 gorebilmeli")
    public void kullanici_acilan_sayfada_ust_kisimda_admin_b129_gorebilmeli() {
        viceDean.b129Baslik.isDisplayed();

    }

    @Then("Kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {

        viceDean.menuButonu.click();
        ReusableMethods.bekle(1);
    }

    @Then("Kullanici Main Menu altinda Lesson Management secenegine tiklar")
    public void kullanici_main_menu_altinda_lesson_management_secenegine_tiklar() {
        viceDean.lessonmanagement.click();

    }

    @Then("Kullanici acilan sayfada Lesson Program secnegini gorebilmeli")
    public void kullanici_acilan_sayfada_lesson_program_secnegini_gorebilmeli() {
        viceDean.lessonsProgram.isDisplayed();


    }

    @Then("Kullanici Lesson Program kutusuna tiklar")
    public void kullanici_lesson_program_kutusuna_tiklar() {

        viceDean.lessonsProgram.click();

    }

    @Then("Kullanici Add Lesson Program seceneklerini gorebilmeli")
    public void kullanici_add_lesson_program_seceneklerini_gorebilmeli() {
        Assert.assertTrue(viceDean.addLessonText.isDisplayed());

    }

    @Then("Kullanici Choose Lessons bolumundeki Select Lesson kutusunua tiklar")
    public void kullanici_choose_lessons_bolumundeki_select_lesson_kutusunua_tiklar() {
        ReusableMethods.click(viceDean.chooseLesson);
        ReusableMethods.bekle(1);


    }

    @Then("Kullanici acilan kutudan dersler gorunur ve secilir olmali")
    public void kullanici_acilan_kutudan_dersler_gorunur_ve_secilir_olmali() {
        ReusableMethods.tumSayfaResmi("TC01-Choose Lessons ders gorunumu");


    }

    @Then("Kullanici Choose lessontan bir ders secer ve tiklar")
    public void kullanici_choose_lessontan_bir_ders_secer_ve_tiklar() {
        ReusableMethods.click(viceDean.seleniumSecim);
        //Selenium Dersi secildi
        ReusableMethods.bekle(2);


    }

    @Then("Secilen ders  arama cubukta gorunur olmali")
    public void secilen_ders_arama_cubukta_gorunur_olmali() {
        Assert.assertTrue(viceDean.seleniumSecim.isDisplayed());

    }

    @Then("Kullanici Choose Education Term secenegi kutusunu gorebilmeli")
    public void kullanici_choose_education_term_secenegi_kutusunu_gorebilmeli() {
        Assert.assertTrue(viceDean.educationTermDdm.isDisplayed());

    }

    @Then("Kullanici Choose Education Term kutusuna tiklar")
    public void kullanici_choose_education_term_kutusuna_tiklar() {
        ReusableMethods.click(viceDean.educationTermDdm);


    }

    @Then("Kullanici kutuda Terms seceneklerini gorebilmeli")
    public void kullanici_kutuda_terms_secebilmeli() {
        Assert.assertTrue(viceDean.springSemester.isDisplayed());


    }

    @Then("Kullanici Term seceneklerinden birinin uzerine tiklar")
    public void kullanici_term_seceneklerinden_birinin_uzerine_tiklar() {
        Select select = new Select(viceDean.springSemester);
        select.selectByValue("1");


    }

    @Then("Kullanici sectigi SPRING_SEMESTER secili oldugunu gorebilmeli")
    public void kullanici_sectigi_spring_semester_secili_oldugunu_gorebilmeli() {
        Assert.assertTrue(viceDean.springSemester.isDisplayed());


    }

    @Then("Kullanici Choose Day kutusunu gider")
    public void kullanici_choose_day_kutusunu_gider() {
        Assert.assertTrue(viceDean.choseDayDdm.isDisplayed());


    }

    @Then("Kullanci Choose Day kutusuna tiklar")
    public void kullanci_choose_day_kutusuna_tiklar() {
        ReusableMethods.click(viceDean.addLessonText);


    }

    @Then("Kullanici bir gun secer")
    public void kullanici_bir_gun_secer() {
        Select select = new Select(viceDean.mondaySecimi);
        select.selectByValue("MONDAY");


    }

    @Then("Kullanici Monday yazisini kutuda gorebilmeli")
    public void kullanici_monday_yazisini_kutuda_gorebilmeli() {
        Assert.assertTrue(viceDean.mondaySecimi.isDisplayed());


    }

    @Then("Kullanici Start Time kutusuna gider")
    public void kullanici_start_time_kutusuna_gider() {

        Assert.assertTrue(viceDean.startTime.isDisplayed());

    }

    @Then("Kullanici Start Time kutusuna tiklar")
    public void kullanici_start_time_kutusuna_tiklar() {

        viceDean.startTime.click();


    }

    @And("Kullanici ikili secenekten {string}ve {string} olarak ikili secimi yapar")
    public void kullaniciIkiliSecenektenVeOlarakIkiliSecimiYapar(String arg0, String arg1) {
        viceDean.startTime.click();
        ReusableMethods.bekle(2);
        viceDean.startTime.sendKeys("0830A");
    }


    @Then("Kullanici kutucukta sectigi saati gerebilmeli")
    public void kullanici_kutucukta_sectigi_saati_gerebilmeli() {
        Assert.assertTrue(viceDean.startTime.isDisplayed());

    }

    @Then("Kullanici Stop Time kutusuna gider")
    public void kullanici_stop_time_kutusuna_gider() {

        Assert.assertTrue(viceDean.stopTime.isDisplayed());

    }

    @Then("Kullanici Stop Time kutusuna tiklar")
    public void kullanici_stop_time_kutusuna_tiklar() {

        viceDean.stopTime.click();
        ReusableMethods.bekle(2);

    }

    @And("Kullanici ikili secenekten   stop time {string} ve {string} olarak ikili secimi yapar")
    public void kullaniciIkiliSecenektenStopTimeVeOlarakIkiliSecimiYapar(String arg0, String arg1) {
        viceDean.stopTime.sendKeys("0930A");

    }

    @Then("Kullanci SUBMIT secenegi kutusunu grebilmeli")
    public void kullanci_submit_secenegi_kutusunu_grebilmeli() {

        Assert.assertTrue(viceDean.submit.isDisplayed());


    }

    @Then("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {

        ReusableMethods.click(viceDean.submit);
        ReusableMethods.bekle(2);

    }

    @Then("Kullanici Created Lesson Program Alert yazsisni gorebilmeli")
    public void kullanici_created_lesson_program_alert_yazsisni_gorebilmeli() {

        ReusableMethods.tumSayfaResmi("CREATED LESSON ALERT YAZISI");
        ReusableMethods.bekle(2);
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("Kullanici Lesson Program Assigmnet sayfasini gorebilmeli")
    public void kullaniciLessonProgramAssigmnetSayfasiniGorebilmeli() {
       Assert.assertTrue(viceDean.lessonPrgAssigmnet.isDisplayed());
    }

    @When("Kullanici Lesson Program Assigmnet sayfasindan Choose Lesson bolumune gider")
    public void kullaniciLessonProgramAssigmnetSayfasindanChooseLessonBolumuneGider() {
        Assert.assertTrue(viceDean.chsLesson.isDisplayed());
    }

    @And("Kullanici Lesson kutusundan olusturdugu dersi gorebilmeli")
    public void kullaniciLessonKutusundanOlusturduguDersiGorebilmeli() {

        Assert.assertTrue(viceDean.olusturlanDers.isDisplayed());

    }

    @Then("Kullanici Lesson kutusunda olusturdugu dersin yanindaki Choose Llesson kutusuna tiklar")
    public void kullaniciLessonKutusundaOlusturduguDersinYanindakiChooseLlessonKutusunaTiklar() {
        ReusableMethods.click(viceDean.olusturlanDers);
    }

    @And("Kullanici ilgili sayfanin en altina gider")
    public void kullaniciIlgiliSayfaninEnAltinaGider() {
        ReusableMethods.scrollEnd();
        
    }

    @When("Kullanici ilgili sayfada Choose Teacher kutusuna gider")
    public void kullaniciIlgiliSayfadaChooseTeacherKutusunaGider() {
        Assert.assertTrue(viceDean.chooseTeacherDDM.isDisplayed());

        
    }

    @And("Kullanici Choose Teacher kutusuna tiklar")
    public void kullaniciChooseTeacherKutusunaTiklar() {
        ReusableMethods.click(viceDean.chooseTeacherDDM);
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici seceneklerden bir ogretmen secer")
    public void kullaniciSeceneklerdenBirOgretmenSecer() {
        Select select = new Select(viceDean.chooseTeacherDDM);
        select.selectByValue("6");
    }

    @And("Kullanici Submit kutusunun uzerine gider")
    public void kullaniciSubmitKutusununUzerineGider() {
        Assert.assertTrue(viceDean.submitSon.isDisplayed());
        
    }

    @Then("Kullanici Submit kutusuna tiklar")
    public void kullaniciSubmitKutusunaTiklar() {
        viceDean.submitSon.click();
        ReusableMethods.bekle(2);
    }

    @And("Kullanici Lesson Added To Teacher alert mesajini gorur")
    public void kullaniciLessonAddedToTeacherAlertMesajiniGorur() {
        ReusableMethods.tumSayfaResmi("LESSON ADDED TO TEACHER ALERT MESAJI");

    }
}









