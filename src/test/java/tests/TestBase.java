package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @BeforeAll
    public static void launchConfiguration() {
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();
        Configuration.baseUrl = config.baseUrl();
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
        if (config.isRemote()) {
            Configuration.remote = config.remoteUrl();
        }
    }
        @BeforeEach
        void openBrowser() {
        open("/");
    }
    @AfterEach
    void tearDown() {
    Selenide.closeWebDriver();
    }
}