package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserFactory {
    private static final String MESSAGE_UNKNOWN_BROWSER = "Unknown browser type! Please check your configuration";

    public static WebDriver getBrowser(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=en");
                return new ChromeDriver(options);
            case FIREFOX:

                FirefoxProfile profile = new FirefoxProfile();
                profile.setPreference("intl.accept_languages", "en");

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setProfile(profile);
                return new FirefoxDriver(firefoxOptions);

            default:
                throw new IllegalArgumentException(MESSAGE_UNKNOWN_BROWSER);
        }
    }
}
