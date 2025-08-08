package org.example.pages;

import org.example.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class TestAutoDeveloperPage extends BasePage{
    @FindBy(id = "forminator-module-1254")
    private WebElement applicationForm;

    @FindBy(css = "button.forminator-button-submit")
    private WebElement applyButton;

    @FindBy(css = "#forminator-module-1254 .forminator-response-message ul li")
    private List<WebElement> errorMessages;


    public TestAutoDeveloperPage(){
        super();
    }
    public TestAutoDeveloperPage scrollToForm() {
        ElementUtils.scrollToElement(applicationForm);
        return this;
    }

    public TestAutoDeveloperPage clickApply() {
        ElementUtils.scrollAndClick(applyButton);
        return this;
    }

    public List<String> getFormErrors() {
        return errorMessages.stream()
                .map(e -> e.getAttribute("textContent").trim())
                .collect(Collectors.toList());
    }
}
