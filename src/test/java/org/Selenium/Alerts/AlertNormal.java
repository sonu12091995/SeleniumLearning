package org.Selenium.Alerts;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertNormal extends commanToAll {

    @Test
    public void normalAlert(){
        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver,"https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());


        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        element.click();

        Alert alert  = driver.switchTo().alert();
        alert.accept();



    }


}
