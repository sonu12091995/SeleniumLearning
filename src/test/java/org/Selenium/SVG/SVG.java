package org.Selenium.SVG;

import org.Selenium.Utils.commanToAll;
import org.Selenium.WaitHelper.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG extends commanToAll {
    @Test
    public void test_Flipkart_Search_ICON() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        open_Browser(driver, "https://www.flipkart.com/search");
        WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        search.sendKeys("MacMini");

        // Click the SVG
        List<WebElement> svg = driver.findElements(By.xpath("//*[name() = \"svg\"]"));
        svg.get(0).click(); //click first svg

        // Writing the waits dynamically
        Waits wait1 = new Waits();
        wait1.waitForVisibility(driver, 3, "//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]");


        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }






        // until Next button is visible, for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while(next_button.isDisplayed()){

            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();


            Waits wait = new Waits();
            wait.waitForVisibility(driver, 3, "//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]");


            List<WebElement> titlesResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

            for (WebElement title :  titlesResults2){
                if(title.getText()!= null){
                    System.out.println(title.getText());
                }

            }
        }




    }
}
