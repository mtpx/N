import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utils.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Reader;



import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;
import static utils.Utils.generateRandomString;

public class Tests {
    Faker faker = new Faker();

    private static final Logger log = LogManager.getLogger(Tests.class);
    @BeforeClass
    public void setUp() throws Exception {
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @BeforeTest
    public void beforeTest() {
        log.info("staring test");
    }

    @Test(enabled = true, priority = 1, description = "Logowanie")
    @Description("Logowanie: bez danych/logowanie poprawne")
    public void test001_logowanie() throws Exception {


        log.info("1. Przejscie na strone logowania");
        Reader objReader = new Reader();
        objReader.readProperties();

        open(Constants.testurl);


       // new _TestBase().clickLogin();

        log.info("2. Logowanie");
        Login objLogin = new Login();
        objLogin.login("mkrasny@opi.org.pl", "Wniosek1!");

    }

    @AfterTest
    public void afterTest() {
        log.info("test end");
    }

    @AfterClass
    public void afterClass() {
        log.info("all tests end");
    }

}
