

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");

       
        driver.manage().window().maximize();

       
        driver.findElement(By.name("q")).sendKeys("Career Guidance Technologies");

        
        System.out.println("Page Title: " + driver.getTitle());

       
        System.out.println("Current URL: " + driver.getCurrentUrl());

        
        driver.quit();
    }
}