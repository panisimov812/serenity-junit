package ui.front.tests;

import net.thucydides.core.annotations.Steps;
import page_object.mainPage.MainPage;
import ui.front.steps.BaseSteps;

public class BaseTest {

    @Steps(shared = true)
    public MainPage mainPage;

    @Steps(shared = true)
    public BaseSteps baseSteps;




}
