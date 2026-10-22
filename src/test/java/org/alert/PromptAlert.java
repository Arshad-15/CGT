package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        Thread.sleep(3000);
        String inputText = "Career Guidance Technologies";
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys(inputText);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("promptResult")).getText();
        System.out.println(result);
        driver.quit();
    }
}