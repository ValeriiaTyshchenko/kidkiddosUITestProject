package Utils;

import Consts.Consts;
import Pages.BasePage;
import Pages.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class UseCaseBase {

    private static WebDriver webDriver;
    private static BasePage page;
    private static MainPage mainPage;

    @BeforeAll
    public static void setUpMain() {

        page = new BasePage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        page.setWebDriver(webDriver);
    }


    @AfterAll
    public static void tearDownMain(){
        SharedDriver.closeDriver();
        webDriver = null;


    }


}
