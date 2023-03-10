package Pages;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public static final String LOGIN_HEADER = "//h1[@class='text-center']";
    public static final String SIGN_IN_BUTTON = "//input[@value='Sign In']";
    public static final String ERROR_MESSAGE = "//*[text() ='Incorrect email or password.']";
    public static final String EMAIL_FIELD = "//input[@id='CustomerEmail']";
    public static final String PASSWORD_FIELD = "//input[@id='CustomerPassword']";
    public static final String CAPTCHA = "//p[@class = 'shopify-challenge__message']";




    public void navigateToLoginPage(){
        webDriver.get("https://kidkiddos.com/account/login");


    }

    public boolean isPageTitleVisible(){
        return elementExists(LOGIN_HEADER);

    }
    public void clickOnSignInButton(){
        clickElementByXpath(SIGN_IN_BUTTON);
//        return new ContactUsPage();

    }

    public void emailInput(){
        sendTextToElementByXpath(EMAIL_FIELD, "valeria@gmail.com");
//        return findElementByXpath(EMAIL_FIELD).getAttribute("value");
    }
    public void passwordInput(){
        sendTextToElementByXpath(PASSWORD_FIELD, "12345");
//        return findElementByXpath(PASSWORD_FIELD).getAttribute("value");

    }
    public boolean errorMessage() {
       findElementByXpath(ERROR_MESSAGE);

        return errorMessage();
    }

    public boolean errorEmail() {
   elementExists(CAPTCHA);
   return errorEmail();
    }

}
