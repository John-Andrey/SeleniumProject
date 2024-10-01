package ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdowndemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label/span")).click();

        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Goa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
    }
}
