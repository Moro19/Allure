package myalluretests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

    public class CleanTestWithListener {


        @Test
        public void testIssueName() {
            SelenideLogger.addListener("allure", new AllureSelenide());
            System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
            open("https://github.com");

            $(".header-search-input").click();
            $(".header-search-input").sendKeys("Moro19/Allure");
            $(".header-search-input").submit();
            $("a[href='/Moro19/Allure']").click();
            $("#issues-tab").click();
            $("#issue_1_link").shouldHave(text("Нужен для ДЗ по Allure"));

        }

    }

