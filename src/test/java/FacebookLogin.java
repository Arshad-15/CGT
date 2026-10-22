
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String[] args) {

       
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Test@123");      
        driver.findElement(By.xpath("//*[@id='login_form']/div/div[1]/div/div[3]/div/div/div")).click();
        driver.quit();
    }
}
        

       
        

        
       

      
       