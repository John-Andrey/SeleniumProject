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
        //same thing also for the password, as the user name
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //third step is to identify the id button , but with the copy of xpath
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //the last step is to close the browser
        driver.close();


    }
}
