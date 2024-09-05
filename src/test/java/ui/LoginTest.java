package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest {
    @Test
    public void loginWithTAFUser()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kostiantyn_Brit\\Downloads\\chromedriver_win32(4)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://trello.com");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.cssSelector("input#user")).sendKeys("kb111110101@gmail.com");
        driver.findElement(By.cssSelector("input#login")).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#password")));
        firstResult.sendKeys("tafTESTuser1");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        driver.quit();
    }
}
