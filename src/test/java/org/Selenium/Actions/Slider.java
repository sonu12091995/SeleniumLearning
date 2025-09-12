package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Slider extends commanToAll {
    @Test
    public void DragAndDrop() {

        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://jqueryui.com/slider/");
        driver.switchTo().frame(0);

        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
        System.out.println(slider.getLocation());// 0,4

        actions.dragAndDropBy(slider,100,4).build().perform();
        actions.dragAndDropBy(slider,50,4).build().perform();






    }
    }
