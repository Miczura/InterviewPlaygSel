package org.example.tests;

import org.testng.annotations.Test;

public class DummyTest extends TestBase{
    @Test
    public void dummyTest() throws InterruptedException {
        System.out.println("Running on >>>>> "+Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
