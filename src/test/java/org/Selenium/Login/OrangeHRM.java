package org.Selenium.Login;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends commanToAll {

    @Owner("Pramod")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() {
        WebDriver driver = new ChromeDriver();
        open_Browser(driver,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //```
        ////input[@name="username"]
        ////input[@placeholder="Username"]
        //```
        //```
        ////input[@placeholder="Password"]
        //```
        //
        //
        //```
        ////button[normalize-space()="Login"]
        //``
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));


        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

// if no write loadig=ng long time
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

        Close_Browser(driver);




    }


}
