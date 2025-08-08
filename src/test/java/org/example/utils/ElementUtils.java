package org.example.utils;

import org.example.driver.DriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class ElementUtils {
    public static List<String> getVisibleTexts(List<WebElement> elements) {
        return elements.stream()
                .filter(WebElement::isDisplayed)
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public static void scrollAndClick(WebElement element) {
        scrollToElement(element);
        jsClick(element);
    }

    public static void scrollToElement(WebElement element) {

        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getWebDriver();
        js.executeScript("const rect = arguments[0].getBoundingClientRect();" +
                        "window.scrollTo({ top: rect.top + window.scrollY - 150, behavior: 'auto' });", element);
        //Ugly workaround for FF



    }

    private static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getWebDriver();
        js.executeScript("arguments[0].click();", element);
    }

}
