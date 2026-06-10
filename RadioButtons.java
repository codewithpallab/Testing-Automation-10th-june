package SpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons {

    WebDriver driver;
    String url = "https://www.spicejet.com/";

    @Test
    public void setup() {
        driver = new EdgeDriver();
        driver.navigate().to(url);   
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-glunga']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[1]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')]")).click();
    }
}
