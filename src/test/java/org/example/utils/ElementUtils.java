package org.example.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ElementUtils {
    public static List<String> getVisibleTexts(List<WebElement> elements) {
        return elements.stream()
                .filter(WebElement::isDisplayed)
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
