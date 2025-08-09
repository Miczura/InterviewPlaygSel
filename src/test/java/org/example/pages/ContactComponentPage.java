package org.example.pages;

import org.example.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactComponentPage extends BasePage{
    @FindBy(xpath = "//div[./h3[text()='Contact']]")
    private WebElement contactSection;
    @FindBy(css= "div.icon-address")
    private WebElement address;
    @FindBy(css = "div.icon-phone.d-md-block")
    private WebElement phoneNumber;
    @FindBy(css ="div.icon-email")
    private WebElement email;

    ContactComponentPage(){
        super();
    }

    public String retrieveAddress(){
        return address.getText().replace("\n", " ").trim();
    }
    public String getPhoneNumber(){
        return phoneNumber.getText();
    }
    public String getEmail(){
        return email.getText();
    }
    public ContactComponentPage scrollIntoContactSection(){
        ElementUtils.scrollToElement(contactSection);
        return this;
    }
}
