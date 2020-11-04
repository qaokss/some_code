package ru.heisenbug;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    // баловство с селенидом
    @Test
    public void userCanSearchKeyword() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "800x600";


//        Configuration.browser = "opera";
//        Configuration.browser = "ie";
//        Configuration.browser = "edge";
//        Configuration.browser = "safari";


        open("https://duckduckgo.com/");

        $(By.name("q"))
                .setValue("heisenbug selenide")
                .pressEnter();

        // глобальное ожидание увеличено до 8 секунд
        Configuration.timeout = 1;


        $$(".results--main .result")
                .shouldHave(CollectionCondition
                        .sizeGreaterThan(5));

        $(".results--main .result")
                .shouldHave(text("heisenbug-moscow.ru"));

        // локальньное ожидание для определённой проверки
//       $(".active")
//               .waitUntil(visible, 88_000)
//               .shouldHave(text("hello"), cssClass("grid"));
    }
}
