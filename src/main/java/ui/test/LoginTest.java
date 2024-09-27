package ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class LoginTest {
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
        WebElement password = driver.findElement(By.id("password"));
        By userNameLocator = RelativeLocator.with(By.tagName("input")) // Find an <input> element
                .above(By.id("password")); // that is located above an element with ID "password"

        WebElement userNameElement = driver.findElement(userNameLocator); // Find the element using the locator
        userNameElement.sendKeys("your_username"); // Send the keys to the element

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();




    }
}
