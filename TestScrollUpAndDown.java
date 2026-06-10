package com.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestScrollUpAndDown {
    
    WebDriver driver;
    String Url = "https://www.nopcommerce.com/en";

    @Test
    public void Test() throws Exception {

        // Step 1: Open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open URL
        driver.get(Url);
        Thread.sleep(5000);

        // Step 3: Scroll Down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)");
        Thread.sleep(5000);

        // Step 4: Scroll Up
        js.executeScript("window.scrollBy(0,-4000)");
    }
}
