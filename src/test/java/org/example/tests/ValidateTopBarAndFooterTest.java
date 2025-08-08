package org.example.tests;

import org.example.pages.BusinessPage;
import org.example.pages.MainPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DummyTest extends TestBase{
    @Test
    public void ValidateTopMenuBarTest() {
        System.out.println("Running on >>>>> "+Thread.currentThread().getName());
        //Given
        List<String> expectedVisibleLinkTexts = List.of("Business", "About Us", "Offer", "Contact", "Career");
        //When
        MainPage page = new MainPage();
        BusinessPage businessPage = page.navigateToBusinessPage();

        List<String> actualVisibleLinkTexts = businessPage
                .getVisibleMenuTexts();
        //Then
        Assert.assertEquals(actualVisibleLinkTexts, expectedVisibleLinkTexts, "Some of the visible link elements are different than expected");

    }

    @Test
    public void dummyTest1() throws InterruptedException {
        System.out.println("Running on >>>>> "+Thread.currentThread().getName());

        MainPage page = new MainPage();
        page.navigateToBusinessPage();
    }
}
