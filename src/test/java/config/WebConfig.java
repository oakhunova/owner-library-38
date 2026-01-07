package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${mode}.properties")

public interface WebConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://alfabank.ru")
    String baseUrl();

    @Key("remote.url")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remoteUrl();

    @Key("isRemote")
    boolean isRemote();

}