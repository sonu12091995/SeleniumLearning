package org.Selenium.DetaDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HardCorded {

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123"},   // valid OrangeHRM login
                {"wrongUser", "wrongPass"} // invalid login
        };
    }

    @Test(dataProvider = "loginData")
    public void OrangeHrm(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000); // demo wait

        WebElement input_username = driver.findElement(By.name("username"));
        input_username.sendKeys(username);

        WebElement input_password = driver.findElement(By.name("password"));
        input_password.sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
