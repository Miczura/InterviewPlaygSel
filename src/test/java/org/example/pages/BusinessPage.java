package org.example.pages;


import org.example.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class BusinessPage extends BasePage{
    @FindBy(css = "#menu-en-business li")
    private List<WebElement> topMenuItems;

    @FindBy(xpath = "//div[./h3[text()='Contact']]")
    private ContactComponentPage contactSection;

    public BusinessPage(){
        super();
        contactSection = new ContactComponentPage();
    }

    public ContactComponentPage getContactSection() {
        return contactSection;
    }

    public List<String> getVisibleTopMenuTexts() {
        return ElementUtils.getVisibleTexts(topMenuItems);
    }
}
