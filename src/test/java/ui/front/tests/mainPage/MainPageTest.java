package ui.front.tests.mainPage;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ui.front.tests.BaseTest;

@ExtendWith(SerenityJUnit5Extension.class)
public class MainPageTest extends BaseTest {


    @Test
    public void checkElementsCard(){
        baseSteps.openUrl();
        mainPage.checkElementCardOnMainPage();



    }
}
