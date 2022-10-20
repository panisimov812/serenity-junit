package page_object.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_object.BasePage;
import utils.Selectors;


public class MainPage extends BasePage {

    private final By CARDS_ELEMENTS = Selectors.byClass("home-body","category-cards");
    private final By MAIN_BANNER = Selectors.byClass("home-body");

    public void checkElementCardOnMainPage(){
        waitFor(ExpectedConditions.visibilityOfElementLocated(CARDS_ELEMENTS));
    }

    
    
    
}
