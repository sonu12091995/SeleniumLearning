package org.Selenium.Utils;

import org.openqa.selenium.WebDriver;

public class commanToAll {


    WebDriver driver;

    public void open_Browser(WebDriver driver ,String url){
        driver.get(url);



    }
    public void Close_Browser(WebDriver driver){

        try{ // exceptin handle
            Thread.sleep(3000);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        driver.quit();// close driver
    }
}
