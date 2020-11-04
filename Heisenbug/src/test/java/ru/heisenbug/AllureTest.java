package ru.heisenbug;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Test;


public class AllureTest {

    // аллюр отчёты без использования степпов
    @Before
    public void addAllure() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(false));
    }


    // аллюр отчёты с использованием степов
    @Test
    public void test1() {
        step1();
        step2();
        step3();

    }


    @Step
    void step1() {

    }

    @Step
    void step2() {

    }

    @Step
    void step3() {

    }

}
