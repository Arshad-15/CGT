package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("confirmResult")).getText();
        System.out.println(result);
        driver.quit();
    }
}