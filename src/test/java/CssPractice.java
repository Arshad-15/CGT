

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

       
        driver.findElement(By.cssSelector("#APjFqb"));

        
        driver.findElement(By.cssSelector(".gLFyf"));


        driver.findElement(By.cssSelector("textarea#APjFqb"));

        
        driver.findElement(By.cssSelector("textarea.gLFyf"));

       
        driver.findElement(By.cssSelector("[name='q']"));

        
        driver.findElement(By.cssSelector("[name^='q']"));

        
        driver.findElement(By.cssSelector("[name*='q']"));

       
        driver.findElement(By.cssSelector("[name$='q']"));

        driver.quit();
    }
}