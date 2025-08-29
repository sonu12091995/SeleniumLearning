package org.Selenium.Project_3;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project__3 extends commanToAll {

    @Test
    public void createAccount(){
        WebDriver driver = new ChromeDriver();
       open_Browser(driver,"https://app.vwo.com");
        WebElement strtTrial_Click =  driver.findElement(By.linkText("Start a free trial"));
        strtTrial_Click.click();

        WebElement coockes =  driver.findElement(By.id("onetrust-accept-btn-handler"));
        coockes.click();

        WebElement Email =  driver.findElement(By.id("page-v1-step1-email"));
        Email.sendKeys("absda");

        WebElement checkbox =  driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox.click();

        WebElement ConfirmEmail =  driver.findElement(By.xpath("//button[text() =\"Create a Free Trial Account\"]"));
        ConfirmEmail.click();

        WebElement message =  driver.findElement(By.xpath("//div[text() =\"The email address you entered is incorrect.\"]"));
        message.getText();

        //Assertion
        Assert.assertEquals(message.getText(),"The email address you entered is incorrect.");

        Close_Browser(driver);

    }


}

