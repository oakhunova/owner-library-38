package tests;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicTest extends TestBase {

    @Test
    void testAlfaSearch() {
        open("/");
        $("[data-test-id='test-ya-button']").click();
        $("[data-test-id='search-input']").setValue("вклад").pressEnter();
        $(".hdJZg3")
                .shouldBe(visible, Duration.ofSeconds(5))
                .shouldHave(text("вклад"));
    }
}