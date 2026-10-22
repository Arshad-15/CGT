

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPractice {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.google.com");
        driver.navigate().to("https:");
       
        driver.manage().window().maximize();


        driver.findElement(By.linkText("About")).click();

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        
        driver.findElement(By.partialLinkText("Abou")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}