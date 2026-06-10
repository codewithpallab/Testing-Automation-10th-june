package com.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollDownCaseStudy {

    WebDriver driver;

    @Test
    public void CaseStudy() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String[] urls = {
            "https://www.flipkart.com/",
            "https://www.myntra.com/",
            "https://blinkit.com/",
            "https://www.hollandandbarrett.com/",
            "https://www.nopcommerce.com/en"
        };

     
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        for (String url : urls) {

            driver.get(url);
            Thread.sleep(4000);

            // Scroll Down
            js.executeScript("window.scrollBy(0,6000)");
            Thread.sleep(3000);

            // Scroll Up
            js.executeScript("window.scrollBy(0,-4000)");
            Thread.sleep(2000);
        }

        driver.quit();
    }
}