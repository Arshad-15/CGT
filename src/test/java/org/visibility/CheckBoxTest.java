package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

      
        WebElement homeCheckbox = driver.findElement(By.xpath("//span[@class='rc-tree-checkbox']"));

        homeCheckbox.click();
        Thread.sleep(3000);

        if (homeCheckbox.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }

       
        driver.quit();
    }
}