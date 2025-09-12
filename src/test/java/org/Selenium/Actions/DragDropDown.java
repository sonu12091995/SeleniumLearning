package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.Selenium.WaitHelper.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropDown extends commanToAll {

    @Test
    public void DragAndDrop() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://the-internet.herokuapp.com/drag_and_drop");

        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        // Source , Destination
        //  from and to
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(from,to).build().perform();
    }
}
