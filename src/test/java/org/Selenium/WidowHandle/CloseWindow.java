package org.Selenium.WidowHandle;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class CloseWindow extends commanToAll {
    @Test
    public void closeWindow() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://the-internet.herokuapp.com/windows");


        WebElement clickButton = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        clickButton.click(); //open another window

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            System.out.println(title);
            if (title.equals("New Window")) {
             driver.close();
             break;
            }
        }
    }
}
