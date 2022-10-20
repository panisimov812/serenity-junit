package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Quotes;


public class Selectors {

    static final String NORMALIZE_SPACE_XPATH = "normalize-space(translate(string(.), '\t\n\r\u00a0', '    '))";

    public static By byXpath(String xpath) {
        return By.xpath(xpath);
    }

    public static By byId(String id) {
        return By.cssSelector("#" + id);
    }

    public static By byName(String name) {
        return By.cssSelector("[name='" + name + "']");
    }

    public static By byText(String elementtext) {
        return By.xpath(".//*/text()[" + NORMALIZE_SPACE_XPATH + " = " + Quotes.escape(elementtext) + "]/parent::*");
    }

    public static By byClass(String className) {
        return By.className(className);
    }

    public static By byClass(String className, String siblingClassName ) {
        return By.className("//*[@class=\"" + className + "\"]//*[@class=\"" + siblingClassName + "\"]");
    }
}
