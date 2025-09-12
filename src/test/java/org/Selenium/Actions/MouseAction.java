package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction extends commanToAll {
    @Test
    public void mouseActions() {


    ChromeDriver driver = new ChromeDriver();

    open_Browser(driver,"https://www.spicejet.com/");

    WebElement tolocation = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]"));
        WebElement fromlocation = driver.findElement(By.xpath("//input[@value=\"Select Destination\"]"));

        // Action class
        Actions actions = new Actions(driver);
        actions.moveToElement(tolocation).click().sendKeys("BEK").build().perform();
        actions.moveToElement(fromlocation).click().sendKeys("DEL").build().perform();
        Close_Browser(driver);

    }

}
