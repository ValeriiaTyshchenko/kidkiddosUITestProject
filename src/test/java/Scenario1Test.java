import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class Scenario1Test extends UseCaseBase {

    private static LoginPage loginPage;

    public static final Logger logger = LogManager.getLogger(LoginPage.class);
    private static MainPage mainPage;



    @BeforeAll
    public static void classSetup(){
        mainPage = new MainPage();

        loginPage = new LoginPage();
        mainPage.navigateToMainPage();

    }

    @BeforeEach
    public void beforeTest() {
        mainPage.openLoginPage();


    }


        @Test
    public void loginWithEmptyFields() throws IOException {
        logger.info("Login with Empty fields");
        loginPage.clickOnSignInButton();
        boolean error = loginPage.errorMessage();
        loginPage.takeScreenshot("LoginWithEmptyFields");
        assertTrue(error);
    }

@Test
    public void incorrectUsernameAndPasswordTest() {
    logger.info("Login with incorrect username and password");
    loginPage.emailInput();
    loginPage.passwordInput();
    loginPage.clickOnSignInButton();
    boolean error = loginPage.errorMessage();
    assertTrue(error);


}

}


