package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class _TestBase {

    private static final Logger log = LogManager.getLogger(_TestBase.class);
    //lokalizatory //$(".btn").shouldBe(enabled).click();

    private SelenideElement login = $(".c-programs > a");
    private SelenideElement programs = $(".c-programs > a");
    private List<SelenideElement> applicationsMenu = $$(By.xpath("//div[@class='grid__item -inline-flex']//a//span"));



    public Properties loadPropertiesFile(String filePath) {

        Properties prop = new Properties();

        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filePath)) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }

        return prop;

    }


    private static String getRestUrl() throws IOException {
        Properties prop = GenericUtils.loadProperties("environment.properties");
        String restUri = prop.getProperty("rest.uri");
        System.out.println("restUri = " + restUri);
        return restUri;
    }



    @Step("Przejście na stronę logowania")
    public void clickLogin() {
        login.click();
    }

    @Step("Przejscie na podstrone 'programy'")
    public void clickPrograms() {
        applicationsMenu.get(0).click();
    }


    public void clickMyApplications() {
        try {
            applicationsMenu.get(1).shouldBe(Condition.enabled).click();
        }catch (Exception e){
            applicationsMenu.get(1).shouldBe(Condition.enabled).click();
        }
    }

    public void clickDocuments() {
        applicationsMenu.get(2).click();
    }

    public void clickProfile() {
        applicationsMenu.get(3).click();
    }

    public void clickNotification() {
        applicationsMenu.get(4).click();
    }
    public void acceptAlertIfPresent() {
        try {
            confirm();
        } catch (Exception e) {
        }
    }

}