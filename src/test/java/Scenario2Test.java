import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Scenario2Test extends UseCaseBase {
    private static MainPage mainPage;
    private static BooksResultPage booksResultPage;
    private static ProductPage productPage;
    private static CardPage cardPage;
    public static final Logger logger = LogManager.getLogger(Scenario2Test.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        booksResultPage = new BooksResultPage();
        productPage = new ProductPage();
        cardPage = new CardPage();
        mainPage.navigateToMainPage();


    }

    @BeforeEach
    public void beforeTest() {


    }

    @Test
    public void booksPurchaseTest() {
        mainPage.openDropDownMenu();
        logger.info("Open the Books result page English Only");
        BooksResultPage booksResultPage = mainPage.openEnglishOnly();
        boolean isLoaded = booksResultPage.isButtonVisible();
        assertTrue(isLoaded);

        logger.info("Open the Books page 'Goodnight, My Love!' test");
        ProductPage productPage = booksResultPage.openProductPage();
        boolean isVisible = productPage.bookIsVisible();
        assertTrue(isVisible);

        logger.info("Change book format to Hardcover");
        productPage.changeFormatToHardcover();


        logger.info("Change quantity on the Product page");
        productPage.changeQuantity();

        logger.info("Open the Card Page");
        productPage.addToCard();
        cardPage.cardPageIsOpened();

        logger.info("Change quantity on the Card page");
        String newQuantity = cardPage.changeQuantity();
        assertEquals("6", newQuantity);

        logger.info("Check the price");
        cardPage.clickOnUpdateButton();
        String checkTotalPrice = cardPage.checkTotalPrice();
        assertEquals("203.94", checkTotalPrice);

    }


}

