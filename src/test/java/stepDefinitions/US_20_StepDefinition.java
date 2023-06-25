package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_20_StepDefinition {
    TeacherPage teacherPage=new TeacherPage();




    @Given("Meet list de toplantinin Date Start Time Stop Time  Descriptionu gorur")
    public void meet_list_de_toplantinin_date_start_time_stop_time_descriptionu_gorur() {
        Assert.assertTrue(teacherPage.mevcutdate.isDisplayed());
        Assert.assertTrue(teacherPage.mevcutstart.isDisplayed());
        Assert.assertTrue(teacherPage.mevcutstop.isDisplayed());
        Assert.assertTrue(teacherPage.mevcutdesc.isDisplayed());

    }
    @Given("Edit butonuna tiklar ve Date de guncelleme yapar")
    public void edit_butonuna_tiklar_ve_date_de_guncelleme_yapar() {
        ReusableMethods.click(teacherPage.edit);
        teacherPage.editdate.sendKeys(ConfigReader.getProperty("editdate"));



    }
    @Given("Edit butonuna tiklar ve Start Time da guncelleme yapar")
    public void edit_butonuna_tiklar_ve_start_time_da_guncelleme_yapar() {
        teacherPage.editdate.sendKeys(ConfigReader.getProperty("editstart"));

    }
    @Given("Edit butonuna tiklar ve Stop Time da guncelleme yapar")
    public void edit_butonuna_tiklar_ve_stop_time_da_guncelleme_yapar() {
        teacherPage.editdate.sendKeys(ConfigReader.getProperty("editstop"));

    }
    @Given("Edit butonuna tiklar ve Description da guncelleme yapar")
    public void edit_butonuna_tiklar_ve_description_da_guncelleme_yapar() {
        teacherPage.editdate.sendKeys(ConfigReader.getProperty("editdesc"));

    }

    @And("Silmek istedigi toplantinin karssindaki cop Kutusu butonuna tiklar ve siler")
    public void silmekIstedigiToplantininKarssindakiCopKutusuButonunaTiklarVeSiler() {
    }


}
