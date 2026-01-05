package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${mode}.properties")

public interface WebConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String browserName();

    @Key("browser.version")
    @DefaultValue("128")
    String browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://google.com")
    String baseUrl();

    @Key("remote.url")
    String remoteUrl();

    @Key("is.remote")
    @DefaultValue("false")
    boolean isRemote();
}