package org.Selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com");

        // Assertions for page load
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // Enter credentials
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // ✅ FluentWait to handle error message
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))       // total timeout
                .pollingEvery(Duration.ofSeconds(2))       // polling interval
                .ignoring(NoSuchElementException.class);   // ignore exception while polling

        WebElement errorMessage = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });

        // Validate the error message
        String actualMessage = errorMessage.getText();
        Assert.assertEquals(actualMessage, "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
