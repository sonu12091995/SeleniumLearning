package org.Selenium.Alerts;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Promt_Alert extends commanToAll {

    @Test
    public void confirmation(){

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver,"https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());


        WebElement element = driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]"));
        element.click();

       // Accept/Dismiss
        Alert alert  = driver.switchTo().alert();
        alert.accept();
        // alert.dismiss

        // Assertion

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You clicked: Ok");
    }
}
