package org.Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dry_runTest {
    @Test
    public void Demotest(){
        System.out.println("Checking setup");
        Assert.assertEquals("Sonu","Sonu");
        System.out.println("End the test");
    }
}
