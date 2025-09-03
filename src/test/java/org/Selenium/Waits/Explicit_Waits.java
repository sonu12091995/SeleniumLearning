package org.Selenium.Waits;

import io.qameta.allure.Link;
import io.qameta.allure.Description;   // ✅ Correct import
import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Explicit_Waits extends commanToAll {
    @Description("TC#1 - Verify that a particular text exists on the VWO login page")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://app.vwo.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        email.sendKeys("abd");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        password.sendKeys("12323");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("js-login-btn")));
        loginButton.click();

        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
        String actualMessage = title.getText();

        Assert.assertEquals(actualMessage, "Your email, password, IP address or location did not match");
    }
}
