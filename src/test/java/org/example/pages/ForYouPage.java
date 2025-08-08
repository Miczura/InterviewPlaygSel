package org.example.pages;

import org.example.driver.DriverManager;
import org.example.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ForYouPage extends BasePage{
    @FindBy(css = "#menu-en-carrer li")
    private List<WebElement> topMenuItems;

    @FindBy(xpath = "//div[./h3[text()='Contact']]")
    private ContactComponentPage contactSection;

    ForYouPage(){
        super();
        contactSection = new ContactComponentPage();
    }

    public ContactComponentPage getContactSection() {
        return contactSection;
    }
    public List<String> getVisibleTopMenuTexts() {
        //move this out of here to utils
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#menu-en-carrer li")));
        return ElementUtils.getVisibleTexts(topMenuItems);
    }
}
