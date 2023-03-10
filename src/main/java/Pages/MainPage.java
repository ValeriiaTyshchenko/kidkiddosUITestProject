package Pages;

import Consts.Consts;

public class MainPage extends BasePage{

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text() ='Contact us']";
    public static final String LOGIN_ICON = "//*[@class='icon icon-login']";
    public static final String ENGLISH_ONLY = "//a[text() ='English Only']";
    public static final String BOOKS_BY_LANGUAGE = "//a[@aria-controls = 'SiteNavLabel-books-by-language']";
    public static final String DROP_DOWN_MENU = "//div[@id = 'SiteNavLabel-books-by-language']";

    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);

    }

    public boolean isLogoVisible(){
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public ContactUsPage openContactUsPage(){
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();

    }

    public LoginPage openLoginPage(){
        clickElementByXpath(LOGIN_ICON);
        return new LoginPage();

    }

    public void openDropDownMenu(){
        clickElementByXpath(BOOKS_BY_LANGUAGE);

    }

    public boolean isDropDownMenuIsVisible(){
        Boolean isVisible = elementExists(DROP_DOWN_MENU);
        return isVisible;
    }

    public BooksResultPage openEnglishOnly() {
        clickElementByXpath(ENGLISH_ONLY);
      return new BooksResultPage();
    }
}
