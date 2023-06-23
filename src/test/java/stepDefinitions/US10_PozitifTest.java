package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChooseLesson_Nihat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_PozitifTest {
    ChooseLesson_Nihat chooseLesson;



    @When("Kullanici Lesson Program butonunu gorur")
    public void kullanici_lesson_program_butonunu_gorur() {
        chooseLesson= new ChooseLesson_Nihat();
        chooseLesson.lessonProgramButonu.isDisplayed();


    }
    @Then("Kullanici Lesson Program butonuna tiklar")
    public void kullanici_lesson_program_butonuna_tiklar() {
        chooseLesson= new ChooseLesson_Nihat();
        chooseLesson.lessonProgramButonu.click();


    }
    @Then("Kullanici Lesson program Management yazisini gorur")
    public void kullanici_lesson_program_management_yazisini_gorur() {
        chooseLesson= new ChooseLesson_Nihat();
        assert chooseLesson.lessonProgManagementyazisi.isDisplayed();


    }
    @Then("Kullanici Choose lessons alanina tiklar")
    public void kullanici_choose_lessons_alanina_tiklar() {
        chooseLesson= new ChooseLesson_Nihat();
        chooseLesson.chooseLessonsAlani.click();

        ReusableMethods.bekle(3);


    }
    @Then("Kullanici secilecek dersi Choose Lessons alana yazar")
    public void kullanici_secilecek_dersi_choose_lessons_alana_yazar() {
        chooseLesson= new ChooseLesson_Nihat();




    }
    @Then("Kullanici Choose Education Term alanina  tiklar")
    public void kullanici_choose_education_term_alanina_tiklar() {


    }
    @Then("Kullanici FAlL_SEMESTER secenegini secer")
    public void kullanici_f_al_l_semester_secenegini_secer() {


    }
    @Then("FALL_SEMESTER secenegi gorunur olmalidir")
    public void fall_semester_secenegi_gorunur_olmalidir() {


    }
    @Then("Kullanici Choose Day alanina tiklar")
    public void kullanici_choose_day_alanina_tiklar() {


    }
    @Then("Kullanici MONDAY secenegini secer")
    public void kullanici_monday_secenegini_secer() {


    }
    @Then("Kullanici Start Time alanina tiklar")
    public void kullanici_start_time_alanina_tiklar() {


    }
    @Then("Kullanici ders baslangic saat ve dakikasini  secer")
    public void kullanici_ders_baslangic_saat_ve_dakikasini_secer() {


    }
    @Then("Kullanici ogleden sonra ifadesini secer")
    public void kullanici_ogleden_sonra_ifadesini_secer() {


    }
    @Then("Kullanici Stop Time alanina tiklar")
    public void kullanici_stop_time_alanina_tiklar() {


    }
    @Then("Kullanici ders bitis saat ve dakikasini secer")
    public void kullanici_ders_bitis_saat_ve_dakikasini_secer() {


    }
    @Then("Kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {


    }
    @Then("Kullanici  onay mesajini gorur")
    public void kullanici_onay_mesajini_gorur() {


    }

}
