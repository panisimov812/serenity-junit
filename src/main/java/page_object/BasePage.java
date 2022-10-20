package page_object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class BasePage extends PageObject {

    public BasePage() {
    }

    public BasePage (WebDriver driver) {
        super(driver);
    }


}
