package org.example.pages;


import org.example.utils.ElementUtils;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class CareerPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href, 'test-automation-developer-en')]")
    private WebElement offer;
    public CareerPage(){
        super();
    }

    public TestAutoDeveloperPage navigateToOffer()  {
        ElementUtils.scrollAndClick(offer);
        return new TestAutoDeveloperPage();
    }
}
