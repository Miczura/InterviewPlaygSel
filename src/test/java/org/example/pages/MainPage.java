package org.example.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{
    @FindBy(xpath = "//a[text()='MORE INFO']")
    private WebElement moreInfoButton;

    @FindBy(xpath = "//a[text()='JUMP IN']")
    private WebElement jumpInButton;

    public MainPage(){
        super();
    }
    public BusinessPage navigateToBusinessPage(){
        moreInfoButton.click();
        return new BusinessPage();
    }
    public ForYouPage navigateToForYouPage(){
        jumpInButton.click();
        return new ForYouPage();
    }

}
