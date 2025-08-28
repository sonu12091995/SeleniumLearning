package org.Selenium.Project_2;

import io.qameta.allure.Link;
import jdk.jfr.Description;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Project__2 {
    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
       WebElement  email =  driver.findElement(By.id("login-username"));
       email.sendKeys("abd");
       WebElement password =  driver.findElement(By.id("login-password"));
       password.sendKeys("12323");
       WebElement loginBuutton =  driver.findElement(By.id("js-login-btn"));
       loginBuutton.click();
        WebElement title = driver.findElement(By.id("js-notification-box-msg"));
        title.getText();

        // Assertion
        Assert.assertEquals(title.getText(),"Your email, password, IP address or location did not match");


    }
}
