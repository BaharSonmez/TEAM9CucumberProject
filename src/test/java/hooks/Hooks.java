package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_urls.ManagementBaseUrl.setUp;

public class Hooks {

    @Before("")//Sadece parantez içinde belirtilen tag senaryoları öncesi çalışır
    public void beforeApi(){

        setUp();

    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {//Eger fail olursa alınan ekran goruntusunu rapora ekle
            final byte[] failedScreenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenShot, "image/png", "failed_scnenaio" + scenario.getName());
        }
        Driver.closeDriver();
    }



}
