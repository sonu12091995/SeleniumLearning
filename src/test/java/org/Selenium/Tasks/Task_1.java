package org.Selenium.Tasks;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task_1 extends commanToAll {
    public void openUrl() {
        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://www.google.com");
        driver.manage().window().maximize();
        Close_Browser(driver);

    }

    //Task 2


    @Owner("sonu")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() {
        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));


        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();
    }

    //Task 3

    public void SelectDropDown(){

        WebDriver driver = new ChromeDriver();
        open_Browser(driver,"https://www.amazon.in/");

        // Select dropdown xpath
        WebElement selectDrop = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));

        Select select = new Select(selectDrop);// Select dropdown

        // get Select All option
        List<WebElement> selectList = select.getOptions();
        for(int i = 0; i<selectList.size(); i++){
            System.out.println(selectList.get(i).getText());

        }
        // Select by text
        select.selectByValue("search-alias=amazon-pharmacy");

        Close_Browser(driver);

    }

    //task 4
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
