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
        open_Browser(driver,"https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        Waits.waitJVM(1000);
        // Vwo shared URl

        WebElement EmaiInpput = driver.findElement(By.xpath("//input[@name=\"primaryUrl\"]"));
        EmaiInpput.clear();
        EmaiInpput.sendKeys("https://thetestingacademy.com/");
        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        Waits.waitJVM(1000);
        driver.manage().window().maximize();

        // Window handle
        Set<String> windows = driver.getWindowHandles();

        // change set string into ArrayList
        List<String> window = new ArrayList<>(windows);

        String parent = window.get(0);
        String child = window.get(1);

        // switched to the child
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.switchTo().window(child);// Switched the child window

        // switched to iframe
        driver.switchTo().frame(0);
        Waits.waitJVM(1000);

        WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));

        Actions action = new Actions(driver);
        action.moveToElement(navigate_button).click();



        Close_Browser(driver);




    }
}
