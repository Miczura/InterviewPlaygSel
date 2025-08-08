package org.example.tests;


import org.example.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateRequiredFieldsJobOfferTest extends TestBase{
    private static final String cvError ="Use PDF or DOCX files";
    private static final String consentCurrentError = "We need your consent";
    private static final String consentFutureError = "We need your consent";
    private static final String whistleBlowingAcknowlegmentError ="We need your consent";
    @Test
    public void validateIfAllFieldsAreMandatoryTest() throws InterruptedException {
        //Given
        MainPage landingPage = new MainPage();
        //When
        List<String> errors =landingPage.navigateToForYouPage()
                .navigateToCareerPage()
                .navigateToOffer()
                .scrollToForm()
                .clickApply()
                .getFormErrors();
        //Then
        Assert.assertEquals(errors.get(0),cvError,"Missing CV message is different than expected");
        Assert.assertEquals(errors.get(1),consentCurrentError,"Missing consent current data processing message is different than expected");
        Assert.assertEquals(errors.get(2),consentFutureError, "Missing consent future data processing message is different than expected");
        Assert.assertEquals(errors.get(2),whistleBlowingAcknowlegmentError, "Missing acknowledgment message is different than expected");
    }
}
