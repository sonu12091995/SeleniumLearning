package org.Selenium.Selenium_Basics;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Assertions {
    @Description("Verify that the title is visible. ")
    @Test
    public void test_selenium_assertion(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com/");

        // TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        // Rest Assured? (ValidatableResponse)

        driver.quit();

    }


}
