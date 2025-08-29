package org.Selenium.Project_1;

import io.qameta.allure.Link;
import jdk.jfr.Description;
import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_1 extends commanToAll {
    // open url
    //get title
    //get open source
    //Assertion

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void test_verify_text_katalon(){
        WebDriver driver = new ChromeDriver();
        open_Browser(driver,"https://app.vwo.com");

        // Assertions
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Text 'CURA Healthcare Service' not found in page source");
        }

        Close_Browser(driver);

    }
}
