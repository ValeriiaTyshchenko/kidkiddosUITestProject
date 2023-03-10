package Pages;

import org.openqa.selenium.WebElement;

public class CardPage extends BasePage{
    public static final String CARD_PAGE= "//*[contains(text(), 'Your cart')]";
    public static final String UPDATE_BUTTON= "//input[@name = 'update'][@class='btn btn--secondary cart__update cart__update--large small--hide']";
    public static final String QUANTITY= "//input[@name = 'updates[]'][@class='cart__qty-input']";
    public static final String TOTAL_PRICE = "//*[@class = 'cart__subtotal']//descendant::*[@class='cbb-price-digits']";

    public boolean cardPageIsOpened(){
        Boolean isVisible = elementExists(CARD_PAGE);
        return isVisible;
    }

    public String changeQuantity(){
        WebElement quantity =  findElementByXpath(QUANTITY);
        quantity.clear();
        quantity.sendKeys("6");
        String newQuantity = quantity.getAttribute("value");


        return newQuantity;
    }
    public void clickOnUpdateButton(){
        clickElementByXpath(UPDATE_BUTTON);


    }
    public String checkTotalPrice(){
      String totalPrice =  findElementByXpath(TOTAL_PRICE).getText();

        return totalPrice;
    }
}
