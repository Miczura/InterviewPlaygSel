package org.example.tests;


import org.testng.annotations.Test;

public class NewDummyTest extends TestBase{
    @Test
    public void secondDummyTest() throws InterruptedException {
        System.out.println("Running on >>>>> "+Thread.currentThread().getName());

    }
}
