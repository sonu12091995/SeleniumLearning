package org.Selenium.RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Below {
    @Test
    public void test_relative_locator_codepen() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        // switch to iframe with id "result"

        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();// click submit button

        //find the validation message appeared below the email input field


        WebElement email = driver.findElement(By.id("username"));
       String text = driver.findElement(with(By.tagName("small")).below(email)).getText();
        Assert.assertEquals(text,"Username must be at least 3 characters");

    }
}
