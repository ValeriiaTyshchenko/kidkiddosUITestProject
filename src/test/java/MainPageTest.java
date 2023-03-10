import Pages.ContactUsPage;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {

    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPage.class);


    @BeforeAll
    public static void classSetup(){
        mainPage = new MainPage();

    }

    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();

    }

    @Test
    public void mainPageLoadTest() throws IOException {
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);

    }
    @Test
    public void openContactUsPage(){
        ContactUsPage contactUsPage = mainPage.openContactUsPage();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void openLoginPage() throws IOException {
        LoginPage loginPage = mainPage.openLoginPage();
        boolean isLoaded = loginPage.isPageTitleVisible();
        loginPage.takeScreenshot("LoginPageTest");
        assertTrue(isLoaded);


    }
}
