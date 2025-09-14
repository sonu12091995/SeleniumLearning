package org.Selenium.WidowHandle;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class onlyTwoWindow extends commanToAll {
    @Test
    public void closeWindowTwo() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://the-internet.herokuapp.com/windows");


        WebElement clickButton = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        clickButton.click(); //open another window

        Set<String> windows = driver.getWindowHandles();

        // change set string into ArrayList
        List<String> window = new ArrayList<>(windows);

        String parent = window.get(0);
        String child = window.get(1);

        // switched to the child
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());

        // Switched to Parent window
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        driver.close();



    }
}
