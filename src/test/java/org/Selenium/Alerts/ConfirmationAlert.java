package org.Selenium.Alerts;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ConfirmationAlert extends commanToAll {
    @Test
    public void confirmationAlert(){

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver,"https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

      // click on the button
        WebElement element = driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]"));
        element.click();

        // Accept/Dismiss/send keys
        Alert alert  = driver.switchTo().alert(); // handle the alert after open
        alert.sendKeys("Sonu Sharma");
        alert.accept();
        //alert.dismiss();

        //Assertion
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: Sonu Sharma");

    }
}
