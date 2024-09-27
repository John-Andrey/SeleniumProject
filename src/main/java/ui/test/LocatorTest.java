package ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTest {
    public static String browser="chrome";
    //driver = global
    public static WebDriver driver;
    public static void main( String[] args ){

        if(browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


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
