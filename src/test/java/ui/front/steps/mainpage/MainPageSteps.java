package ui.front.steps.mainpage;

import net.thucydides.core.annotations.Step;
import page_object.mainPage.MainPage;

public class MainPageSteps {

    MainPage mainPage;

    @Step("Check element card on main page")
    public void checkElementCardOnMainPage(){
        mainPage.checkElementCardOnMainPage();



    }
}
