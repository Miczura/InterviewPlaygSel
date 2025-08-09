package org.example.tests;

import org.example.pages.BusinessPage;
import org.example.pages.ContactComponentPage;
import org.example.pages.MainPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateTopBarAndFooterTest extends TestBase{
    private static final String expectedAddress ="ul. Obwiednia Południowa 22 44-200 Rybnik";
    private static final String expectedPhoneNumber ="+48 32 733 86 00";
    private static final String expectedEmail="info@alan-systems.com";

    @Test
    public void validateTopMenuBarBusinessPageTest() {

        //Given
        List<String> expectedVisibleLinkTexts = List.of("Business", "About Us", "Offer", "Contact", "Career");
        //When
        MainPage page = new MainPage();
        BusinessPage businessPage = page.navigateToBusinessPage();

        List<String> actualVisibleLinkTexts = businessPage
                .getVisibleTopMenuTexts();
        //Then
        Assert.assertEquals(actualVisibleLinkTexts, expectedVisibleLinkTexts, "Some of the visible link elements are different than expected");

    }

    @Test
    public void validateFooterBusinessPageTest() {


        //When
        MainPage page = new MainPage();
        ContactComponentPage contactSection =page
                .navigateToBusinessPage()
                .getContactSection()
                .scrollIntoContactSection();
        //Then
        Assert.assertEquals(contactSection.retrieveAddress(),expectedAddress, "Address do not match");
        Assert.assertEquals(contactSection.getPhoneNumber(),expectedPhoneNumber, "Phone number do not match");
        Assert.assertEquals(contactSection.getEmail(),expectedEmail, "Email address do not match");
    }
    @Test
    public void validateTopMenuBarForYouPageTest() {
        //Given
        List<String> expectedVisibleLinkTexts = List.of("For You", "About Us", "Career", "Contact", "Business");
        //When
        MainPage page = new MainPage();
        List<String> actualVisibleLinkTexts =page.navigateToForYouPage()
                .getVisibleTopMenuTexts();

        //Then
        Assert.assertEquals(actualVisibleLinkTexts, expectedVisibleLinkTexts, "Some of the visible link elements are different than expected");
    }
    @Test
    public void validateFooterForYouPageTest(){
        //Given

        //When
        MainPage page = new MainPage();
        ContactComponentPage contactSection =page
                .navigateToForYouPage()
                .getContactSection()
                .scrollIntoContactSection();
        //Then
        Assert.assertEquals(contactSection.retrieveAddress(),expectedAddress,  "Address do not match");
        Assert.assertEquals(contactSection.getPhoneNumber(),expectedPhoneNumber, "Phone number do not match");
        Assert.assertEquals(contactSection.getEmail(),expectedEmail, "Email address do not match");
    }
}
