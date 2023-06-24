package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EsraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US23_UI_StepDefinition {

    EsraPage esraPage =new EsraPage();

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
    }

    @And("Admin Vice Dean Management sayfasini goruntuler")
    public void adminViceDeanManagementSayfasiniGoruntuler() {
        esraPage.AdminManagement.isDisplayed();

    }

    //TC01

    @And("Admin Name kismina en az iki karakter girer")
    public void adminNameKisminaEnAzIkiKarakterGirer() {
        esraPage.namE.sendKeys("es");
    }

    @Then("Admin Name girilebildigini goruntuler")
    public void admin_name_girilebildigini_goruntuler() {
        esraPage.validName.isDisplayed();
    }
    @Then("Admin Name kismini bos birakir")
    public void admin_name_kismini_bos_birakir() {
       esraPage.namE.clear();
    }
    @Then("Admin Required yazisini goruntuler ve name bos birakilamayacagini dogrular")
    public void admin_required_yazisini_goruntuler_ve_bos_birakilamayacagini_dogrular() {
        esraPage.invalidName.isDisplayed();
    }

    //TC02

    @Then("Admin Surname kismina en az iki karakter  girer")
    public void admin_surname_kismina_en_az_iki_karakter_girer() {
        esraPage.surnamE.sendKeys("as");
    }

    @And("Admin Surname girilebildigini goruntuler")
    public void adminSurnameGirilebildiginiGoruntuler() {
        esraPage.validSurname.isDisplayed();
        }

    @And("Admin Surname  kismini bosbirakir")
    public void adminSurnameKisminiBosbirakir() {
        esraPage.surnamE.clear();
    }
    @Then("Admin Required yazisini goruntuler ve surname bos birakilamayacagini dogrular")
    public void admin_required_yazisini_goruntuler_ve_surname_bos_birakilamayacagini_dogrular() {
       esraPage.invalidSurname.isDisplayed();
    }

    //TC03



}

