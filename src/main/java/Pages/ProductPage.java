package Pages;

import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{
    public static final String BOOK_PAGE= "// img[@alt='childrens-picture-book-by-Shelley-Admont-KidKiddos-english-language-Goodnight-my-love-cover']";
    public static final String HARDCOVER= "//*[@class='selector-wrapper js product-form__item']//following-sibling::*[@value='Hardcover']";
    public static final String PAPERBACK= "//*[@class='selector-wrapper js product-form__item']//following-sibling::*[@id='SingleOptionSelector-0']";

    public static final String QUANTITY= "//div[@class = 'product-form__item product-form__item--quantity']//descendant::input[@name = 'quantity']";
    public static final String ADD_TO_CARD= "//button[@type = 'submit'][@name = 'add'][@id = 'AddToCart-product-template'][@class = 'btn product-form__cart-submit']";

    public boolean bookIsVisible(){
        Boolean isVisible = elementExists(BOOK_PAGE);
        return isVisible;
    }

    public void changeFormatToHardcover(){
        clickElementByXpath(PAPERBACK);
        clickElementByXpath(HARDCOVER);


    }
    public void changeQuantity(){
        WebElement quantity =  findElementByXpath(QUANTITY);
        quantity.clear();
        quantity.sendKeys("5");


    }

    public void addToCard(){
        clickElementByXpath(ADD_TO_CARD);


    }
}
