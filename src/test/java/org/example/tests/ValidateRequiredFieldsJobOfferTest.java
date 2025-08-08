package org.example.tests;


import org.example.pages.MainPage;
import org.testng.annotations.Test;

public class ValidateRequiredFieldsJobOffer extends TestBase{
    @Test
    public void secondDummyTest() throws InterruptedException {
        System.out.println("Running on >>>>> "+Thread.currentThread().getName());
        MainPage landingPage = new MainPage();
        landingPage.navigateToBusinessPage();

    }
}
