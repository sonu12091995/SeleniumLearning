package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.Selenium.WaitHelper.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MakeMytipHandle extends commanToAll {

    @Test
    public void makeMyTrip() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://www.makemytrip.com/");


        Waits.waitJVM(3000);
        //close the modal
        WebElement closeButton = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeButton.click();

        //  from and to city
        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));


        // Action class
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("Chandigarh").build().perform();// open the dropdown all state appear
        Waits.waitJVM(3000);
        // Select the chandigarh all list (find dynamically xpath appear all country)
       List<WebElement>  drpOption = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));


        for(WebElement options : drpOption){
            System.out.println(options.getText());

            if (options.equals("Chandigarh")){
                options.click();
            }
        }

        Close_Browser(driver);


    }
}
