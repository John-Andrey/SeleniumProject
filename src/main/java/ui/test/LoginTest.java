package ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    public static void main( String[] args ){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        //identified by id name of xpath , we have a method ,where we insert the username standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");




    }
}
