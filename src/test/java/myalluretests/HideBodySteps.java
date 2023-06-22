package myalluretests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class HideBodySteps {
    private static final String REPOSITORY = "Moro19/Allure";
    @Test
    public void test() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        TestWithSteps testWithSteps = new TestWithSteps();

        testWithSteps.openMainPage();
        testWithSteps.searchForRepository(REPOSITORY);
        testWithSteps.clickOnRepositoryLink(REPOSITORY);
        testWithSteps.openIssuesTab();
        testWithSteps.shouldNameIssue();
        testWithSteps.takeScreenshot();

    }
}