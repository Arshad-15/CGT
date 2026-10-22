package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert();
	  driver.switchTo().alert().dismiss();
	  System.out.println("alert accepted successfully.");
	  Thread.sleep(3000);
      driver.quit();
}
}
