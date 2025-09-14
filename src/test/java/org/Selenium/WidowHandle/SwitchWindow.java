package org.Selenium.WidowHandle;

import org.Selenium.Utils.commanToAll;
import org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow extends commanToAll {
    @Test
    public void switchWindow() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://the-internet.herokuapp.com/windows");

        String parentWindow = driver.getWindowHandle();
        WebElement clickButton = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        clickButton.click(); //open another window

        Set<String> windows = driver.getWindowHandles();

        for( String window : windows){
         String title =    driver.switchTo().window(window).getTitle();
            System.out.println(title);
            if (title.equals("New Window")){
                System.out.println(driver.getCurrentUrl());// switched child window
            }
        }

        // switched to parent window

        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl());

    }
}


