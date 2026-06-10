package com.MultipleApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class DifferentBrowser {

    WebDriver driver;

    @Test
    public void TestPopups() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("file:///C:/Users/Pallab.Banerjee/Downloads/index.html");
        Thread.sleep(2000);

        int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of frames: " + totalnoofframes);

        driver.switchTo().frame("easycalculation");

        // ✅ FIX 1: Clean URL (removed HTML)
        driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");

        driver.findElement(By.id("log_email")).sendKeys("9413216788");
        driver.findElement(By.id("log_password")).sendKeys("Pallab@020");

        // ✅ FIX 2: Correct locator
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println(driver.getTitle());

        // ✅ FIX 3: back to main page
        driver.switchTo().defaultContent();

        driver.navigate().to("file:///C:/Users/Pallab.Banerjee/Downloads/index.html");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/a")).click();

        // ✅ FIX 4: Clean URL
        driver.navigate().to("https://www.selenium.dev/");
        driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();

        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.navigate().to("file:///C:/Users/Pallab.Banerjee/Downloads/index.html");

        driver.switchTo().frame("PractiseAutomation");

        // ✅ FIX 5: Clean URL
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.quit();
    }
}
