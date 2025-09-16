package org.Selenium.Frame;

import org.Selenium.Utils.commanToAll;
import org.Selenium.WaitHelper.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleIframe extends commanToAll {


    @Test
    public void IframeHandle() {


        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        Waits.waitJVM(1000);
        // Vwo shared URl

        String parentWindowHandle = driver.getWindowHandle();

        WebElement EmaiInpput = driver.findElement(By.xpath("//input[@name=\"primaryUrl\"]"));
        EmaiInpput.clear();
        EmaiInpput.sendKeys("https://thetestingacademy.com/");
        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        Waits.waitJVM(1000);
        driver.manage().window().maximize();

        // Window handle
        Set<String> Handles = driver.getWindowHandles();


        for (String handle : Handles) {
            if(!handle.equals(parentWindowHandle)){

                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                 Waits.waitJVM(1000);
                // System.out.println(driver.getPageSource());

                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(navigate_button).click().build().perform();



            }
        }
    }}
