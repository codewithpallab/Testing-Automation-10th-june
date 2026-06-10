//write a program using Selenium web driver perform operation using actions also count 
//and print no of links present in downdload page.
package com.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;

public class ActionsSelenium {
	
	int linkCount;
	List<WebElement>list;
	WebDriver driver;

    @Test
    public void mouseover() throws Exception {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.easycalculation.com/#");
        WebElement ele= driver.findElement(By.xpath("//a[@href='#']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();
        
        list = driver.findElements(By.tagName("a"));
        System.out.println("Number of a links " + list.size());
        
        for (int i =0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	
        }
        		Thread.sleep(6000);
        		WebElement ele2 = driver.findElement(By.xpath("//a[normalize-space()='Download']"));
        		ele2.click();
        		System.out.println(driver.getCurrentUrl());
        		driver.quit();
}
}
