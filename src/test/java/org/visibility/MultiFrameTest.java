package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrameTest {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();


        driver.switchTo().frame("frame1");
        Thread.sleep(3000);

        String parentText = driver.findElement(By.tagName("body")).getText();

        System.out.println("Text:");
        System.out.println(parentText);

        driver.switchTo().frame(0);

        Thread.sleep(3000);
        String childText = driver.findElement(By.tagName("p")).getText();

        System.out.println("Text:");
        System.out.println(childText);

        driver.switchTo().parentFrame();

        System.out.println("Returned to Parent Frame");

        driver.switchTo().defaultContent();

        System.out.println("Returned to Main Page");

        driver.quit();
    }
}