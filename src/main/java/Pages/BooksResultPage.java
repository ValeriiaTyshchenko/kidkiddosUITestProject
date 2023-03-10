package Pages;

import Consts.Consts;

public class BooksResultPage extends BasePage {


    public static final String ENGLISH_BUTTON= "//input[@value='For ebooks in English click here']";
    public static final String BOOK_PAGE= "// img[@alt='childrens-picture-book-by-Shelley-Admont-KidKiddos-english-language-Goodnight-my-love-cover']";
    public static final String CLOSE_BUTTON= "//div[@class='_close']";


    public boolean isButtonVisible(){
        Boolean isVisible = elementExists(ENGLISH_BUTTON);
        return isVisible;
    }
    public ProductPage openProductPage() {
        clickElementByXpath(BOOK_PAGE);
        return new ProductPage();
    }
    public void closePopupWindow(){
        clickElementByXpath(CLOSE_BUTTON);

    }





}
