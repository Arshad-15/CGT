

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        
        driver.findElement(By.xpath("//textarea[@name='q']"));

        
        driver.findElement(By.xpath("//a[text()='About']"));
        driver.findElement(By.xpath("//a[contains(text(),'Abo')]"));
      
        driver.findElement(By.xpath("//textarea[contains(@name,'q')]"));

       
        driver.findElement(By.xpath("//textarea[starts-with(@name,'q')]"));

        driver.findElement(By.id("name"));
        driver.findElement(By.xpath("(//a)[1]"));

        driver.quit();
    }
}