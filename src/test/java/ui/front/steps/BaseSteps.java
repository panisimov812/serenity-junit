package ui.front.steps;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

public class BaseSteps {

    private EnvironmentVariables env;

    @Step("Open url")
    public void openUrl(){
        String baseurl =  EnvironmentSpecificConfiguration.from(env).getProperty("webdriver.base.url");

        //Open.url("https://demoqa.com/");
    }
}
